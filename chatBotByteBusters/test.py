import google.generativeai as genai
import tkinter as tk

genai.configure(api_key="AIzaSyDJiv0bbo2Tx_tfw5UAoTf-0m4bnyRCtwU") # Configuro la api key
model = genai.GenerativeModel(model_name='gemini-pro')
chat_history = []

# Creo una variable para limitar las respuestas del bot
limitacion_pregunta = "Eres asistente para sacar dudas sobre el mundial 2022"
chat_historia = []


# Función de respuesta del bot
def response(msg):
    # Agrego "limitacion_pregunta" para que no se desvíe del mundial 2022.
    # También agrego un ciclo for de chat_historia, para que vaya siguiendo la conversación que se va teniendo
    answer = model.generate_content(limitacion_pregunta + " ".join([item["content"] for item in chat_history]) + msg)
    chat_area.config(state="normal")
    chat_area.insert(tk.END, "Bot: " + answer.text + "\n""\n"+ "\n¿Quíeres saber algo más?"+"\n""\n")
    chat_area.config(state="disabled")
    chat_area.see(tk.END)
    # Guardo la respuesta en el rol : asistente, contenido : respuesta
    chat_historia.append({"role": "assistant", "content": answer})


# Función para preguntar al bot
def send_message(event=None):
    # user_imput.get() es el input de tkinter
    msg = user_input.get()
    if msg:
        chat_area.config(state="normal")
        chat_area.insert(tk.END, "Tú: " + msg + "\n")
        chat_area.config(state="disabled")
        user_input.delete(0, tk.END)
        # Guardamos el rol de usuario y el contenido del mensaje
        chat_historia.append({"role": "user", "content": msg})
        # La misma función que pregunta llama a la respuesta. Eso esta bueno
        # Pasando msg como parámetro y siendo recibido en response como argumento
        response(msg)


# Creo interzas grafica con Tkinter
ventana = tk.Tk()
ventana.title("Byte Buster Chatbot")
ventana.geometry("400x500")

# Area del Chat
ventana_chat = tk.Frame(ventana, bd=8, bg="gray", relief="groove")
ventana_chat.place(relwidth=0.9, relheight=0.75, relx=0.05, rely=0.05)
scrollbar = tk.Scrollbar(ventana_chat)
scrollbar.pack(side=tk.RIGHT, fill=tk.Y)
chat_area = tk.Text(ventana_chat, yscrollcommand=scrollbar.set, state="disabled", bg="white")
chat_area.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)
scrollbar.config(command=chat_area.yview)

# Entrada de usuario
user_input = tk.Entry(ventana, bd=8, bg="white", width=50)
user_input.place(relwidth=0.74, relheight=0.1, relx=0.05, rely=0.85)
user_input.bind("<Return>", send_message)

# Boton enviar
send_button = tk.Button(ventana, text="Enviar", command=lambda: send_message())
send_button.place(relx=0.8, rely=0.85, relwidth=0.15, relheight=0.1)

ventana.mainloop()