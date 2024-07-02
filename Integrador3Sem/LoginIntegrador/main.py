import tkinter as tk
from tkinter import messagebox

class MenuPrincipal:
    def __init__(self, master, login_window):
        self.master = master
        self.login_window = login_window  # Guardar la referencia de la ventana de login
        master.title("Constructora BYTEBUSTERS | Menú")

        frame_principal = tk.Frame(master)
        frame_principal.pack(padx=20, pady=20, fill=tk.BOTH, expand=True)

        # Frame para los botones
        frame_botones = tk.Frame(frame_principal)
        frame_botones.pack(side=tk.LEFT, padx=20, pady=20)

        botones = [
            ("Inicio", self.opcion_inicio),
            ("Nosotros", self.opcion_nosotros),
            ("Cotización", self.opcion_cotizacion),
            ("Tipología", self.opcion_tipologia),
            ("Contáctanos", self.opcion_contactanos),
            ("Salir", self.opcion_salir)
        ]

        for texto, comando in botones:
            boton = tk.Button(frame_botones, text=texto, command=lambda cmd=comando: self.ejecutar_y_cerrar(cmd), width=20)
            boton.pack(padx=10, pady=5)

    def ejecutar_y_cerrar(self, comando):
        comando()  # Ejecutar la función correspondiente
        self.master.destroy()  # Cerrar la ventana principal después de ejecutar el comando

    def opcion_inicio(self):
        messagebox.showinfo("Inicio", "Elegiste la opción Inicio")

    def opcion_nosotros(self):
        messagebox.showinfo("Nosotros", "Elegiste la opción Nosotros")

    def opcion_cotizacion(self):
        messagebox.showinfo("Cotización", "Elegiste la opción Cotización")

    def opcion_tipologia(self):
        messagebox.showinfo("Tipología", "Elegiste la opción Tipología")

    def opcion_contactanos(self):
        messagebox.showinfo("Contáctanos", "Elegiste la opción Contáctanos")

    def opcion_salir(self):
        self.master.destroy()  # Cerrar la ventana del menú principal
        self.login_window.deiconify()  # Mostrar la ventana de login

if __name__ == "__main__":
    root = tk.Tk()
    login_window = tk.Toplevel(root)
    app = MenuPrincipal(root, login_window)
    root.mainloop()