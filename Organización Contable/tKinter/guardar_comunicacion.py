from tkinter import messagebox
import tkinter as tk
from customtkinter import CTkButton
import guardar_comunicacion as save

# Colores
c_azulClaro = "#86A9FD"
c_negro = "#010101"
c_morado = "#7f5af0"
c_verde = "#2cb67d"
c_azul = "#33DDFF"
c_azulOscuro = "#2980B9"

def guardar_comunicacion(nombre, email, telefono, mensaje):
    with open("comunicacion.txt", "a", encoding="utf-8") as file:
        file.write(f"Nombre: {nombre}\nEmail: {email}\nTeléfono: {telefono}\nMensaje: {mensaje}\n\n")

def ir_chatbot(ventana_anterior):
    def volver_al_menu():
        root.destroy()
        ventana_anterior.deiconify()

    def guardar_datos():
        nombre = entry_nombre.get()
        email = entry_email.get()
        telefono = entry_telefono.get()
        mensaje = text_area.get("1.0", tk.END).strip()
        if nombre and email and telefono:
            guardar_comunicacion(nombre, email, telefono, mensaje)
            messagebox.showinfo("Éxito", "Datos guardados exitosamente")
            entry_nombre.delete(0, tk.END)
            entry_email.delete(0, tk.END)
            entry_telefono.delete(0, tk.END)
            text_area.delete("1.0", tk.END)
        else:
            messagebox.showerror("Error", "Todos los campos son obligatorios")

    root = tk.Tk()
    root.title("Formulario de Comunicación")
    ventana_anterior.withdraw()

    root.geometry("600x600")
    root.config(bg=c_azulClaro)
    root.title("Byte Busters Travel")

    # Campos del formulario
    tk.Label(root, text="Nombre:", bg=c_azulClaro, font=("Arial", 12)).pack(pady=5)
    entry_nombre = tk.Entry(root, width=50)
    entry_nombre.pack(pady=5)

    tk.Label(root, text="Email:", bg=c_azulClaro, font=("Arial", 12)).pack(pady=5)
    entry_email = tk.Entry(root, width=50)
    entry_email.pack(pady=5)

    tk.Label(root, text="Número de Teléfono:", bg=c_azulClaro, font=("Arial", 12)).pack(pady=5)
    entry_telefono = tk.Entry(root, width=50)
    entry_telefono.pack(pady=5)

    tk.Label(root, text="Mensaje:", bg=c_azulClaro, font=("Arial", 12)).pack(pady=5)
    text_area = tk.Text(root, wrap=tk.WORD, height=10, width=50)
    text_area.pack(pady=5)

    frame = tk.Frame(root)
    frame.pack(pady=20)

    btn_guardar = CTkButton(root, font=("sans serif", 13), border_color=c_negro, fg_color=c_azulOscuro,
                           hover_color=c_morado, corner_radius=12, border_width=2, text="Guardar", height=40,
                           command=guardar_datos)
    btn_guardar.pack()
    btn_guardar.place(relx=0.3, rely=0.8, relwidth=0.12, relheight=0.05)

    boton_menu = CTkButton(root, font=("sans serif", 13), border_color=c_negro, fg_color=c_azulOscuro,
                           hover_color=c_morado, corner_radius=12, border_width=2, text="Ir al Menú Principal",
                           height=40, command=volver_al_menu)
    boton_menu.pack()
    boton_menu.place(relx=0.58, rely=0.8, relwidth=0.12, relheight=0.05)

    btn0 = CTkButton(root, font=("sans serif", 13), border_color=c_negro, fg_color=c_azulOscuro,
                     hover_color=c_morado, corner_radius=12, border_width=2, text="Salir", height=40,
                     command=root.quit)
    btn0.pack()
    btn0.place(relx=0.44, rely=0.9, relwidth=0.12, relheight=0.05)

    root.mainloop()

# Ejemplo de cómo llamar a la función ir_chatbot
if __name__ == "__main__":
    ventana_anterior = tk.Tk()  # Crear una ventana ficticia para el ejemplo
    ir_chatbot(ventana_anterior)
