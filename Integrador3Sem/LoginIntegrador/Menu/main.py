import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import os
import Cotizacion.cotizacion as Cotizacion
import Contactanos.Contactanos as Contactanos
import Tipologia.tipologia as Tipologia
import inicio2.texto_inicio as Inicio
import Login.login_gui as Login

class MenuPrincipal:
    def __init__(self, master, login_window):
        self.master = master
        self.login_window = login_window  # Guardar la referencia de la ventana de login
        master.title("Constructora BYTEBUSTERS | Menú")

        frame_principal = tk.Frame(master)
        frame_principal.pack(padx=20, pady=20, fill=tk.BOTH, expand=True)

        # Frame para la imagen
        frame_imagen = tk.Frame(frame_principal)
        frame_imagen.pack(side=tk.LEFT, padx=10, pady=10)

        # Cargar imagen
        image_path = "bytebusters_constructora.png"
        imagen_ancho = 250
        imagen_alto = 200

        self.photo = self.cargar_imagen(image_path, imagen_ancho, imagen_alto)
        if self.photo:
            image_label = tk.Label(frame_imagen, image=self.photo)
            image_label.pack(padx=10, pady=10)

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

    def cargar_imagen(self, image_path, width, height):
        try:
            if os.path.exists(image_path):
                image = Image.open(image_path)
                resized_image = image.resize((width, height), Image.Resampling.LANCZOS)
                return ImageTk.PhotoImage(resized_image)
            else:
                messagebox.showerror("Error", f"No se encontró el archivo: {image_path}")
                return None
        except Exception as e:
            messagebox.showerror("Error", f"Error al cargar la imagen: {str(e)}")
            return None

    def ejecutar_y_cerrar(self, comando):
        comando()  # Ejecutar la función correspondiente
        self.master.destroy()  # Cerrar la ventana principal después de ejecutar el comando

    def opcion_inicio(self):
        messagebox.showinfo("Inicio", "Elegiste la opción Inicio")
        appInicio = Inicio.llamar_inicio()
        appInicio.start()

    def opcion_nosotros(self):
        messagebox.showinfo("Nosotros", "Elegiste la opción Nosotros")

    def opcion_cotizacion(self):
        messagebox.showinfo("Cotización", "Elegiste la opción Cotización")
        appCotizacion = Cotizacion.ir_cotizacion()
        appCotizacion.start()

    def opcion_tipologia(self):
        messagebox.showinfo("Tipología", "Elegiste la opción Tipología")
        appTipologia = Tipologia.Tipologia()
        appTipologia.start()

    def opcion_contactanos(self):
        messagebox.showinfo("Contáctanos", "Elegiste la opción Contáctanos")
        appContactanos = Contactanos.contactanos()
        appContactanos.start()

    def opcion_salir(self):
        self.master.destroy()  # Cerrar la ventana del menú principal
        self.login_window.deiconify()  # Mostrar la ventana de login

if __name__ == "__main__":
    root = tk.Tk()
    login_window = tk.Toplevel(root)
    login_app = Login.Login(login_window)
    login_window.withdraw()  # Ocultar la ventana de login inicialmente
    app = MenuPrincipal(root, login_window)
    root.mainloop()