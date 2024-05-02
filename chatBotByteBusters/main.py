import tkinter as tk

# Funcion enviar mensaje
def send_message(event = None):
    msg = user_input.get()
    if msg:
        chat_area.config(state="normal")
        chat_area.insert(tk.END, "Tú: " + msg + "\n")
        chat_area.config(state="disabled")
        user_input.delete(0, tk.END)
        respond(msg)

# Respuestas predefinidas
def respond(message):
    responses = {
        "hola": "¡Hola! ¿Cómo puedo ayudarte?",
        "adiós": "¡Adiós! Ten un buen día.",
    }
    response = responses.get(message.lower(), "Lo siento, no entiendo esa pregunta.")
    chat_area.config(state="normal")
    chat_area.insert(tk.END, "Bot: " + response + "\n")
    chat_area.config(state="disabled")
    chat_area.see(tk.END)


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