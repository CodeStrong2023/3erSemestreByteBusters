import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import os

# Funciones para cada opción del menú
def opcion_inicio():
    messagebox.showinfo("Inicio", "Elegiste la opción Inicio")

def opcion_nosotros():
    messagebox.showinfo("Nosotros", "Elegiste la opción Nosotros")

def opcion_cotizacion():
    messagebox.showinfo("Cotización", "Elegiste la opción Cotización")

def opcion_tipologia():
    messagebox.showinfo("Tipología", "Elegiste la opción Tipología")

def opcion_contactanos():
    messagebox.showinfo("Contáctanos", "Elegiste la opción Contáctanos")

def opcion_salir():
    ventana.destroy()

# Función para cargar y redimensionar la imagen
def cargar_imagen(image_path, width, height):
    try:
        if os.path.exists(image_path):
            with open(image_path, 'rb') as f:
                f.read()  # Intentar leer el archivo para verificar permisos
            image = Image.open(image_path)
            resized_image = image.resize((width, height), Image.Resampling.LANCZOS)
            return ImageTk.PhotoImage(resized_image)
        else:
            messagebox.showerror("Error", f"No se encontró el archivo: {image_path}")
            return None
    except Exception as e:
        messagebox.showerror("Error", f"Error al cargar la imagen: {str(e)}")
        return None

# Función para crear y mostrar la ventana del menú
def ir_main():
    global ventana, photo
    ventana = tk.Tk()
    ventana.title("Menú ByteBuster")

    # Ruta de la imagen y dimensiones deseadas
    script_dir = os.path.dirname(os.path.abspath(__file__))  # Ruta absoluta del script
    image_filename = "bytebusters_constructora.png"
    image_path = os.path.join(script_dir, image_filename)  # Construir la ruta completa

    # Imprimir la ruta para verificar
    print(f"Ruta completa de la imagen: {image_path}")

    imagen_ancho = 200
    imagen_alto = 200

    # Verificar si el archivo de imagen existe
    if os.path.exists(image_path):
        # Cargar y redimensionar la imagen
        photo = cargar_imagen(image_path, imagen_ancho, imagen_alto)

        if photo is not None:
            # Crear etiqueta para la imagen
            image_label = tk.Label(ventana, image=photo)
            image_label.image = photo  # Mantener una referencia a la imagen
            image_label.grid(row=0, column=0, rowspan=6, padx=10, pady=10)

            # Crear el marco para los botones
            frame_botones = tk.Frame(ventana)
            frame_botones.grid(row=0, column=1, padx=10, pady=10)

            # Crear los botones del menú
            boton_inicio = tk.Button(frame_botones, text="Inicio", command=opcion_inicio)
            boton_inicio.grid(row=0, column=0, padx=10, pady=5, sticky="ew")

            boton_nosotros = tk.Button(frame_botones, text="Nosotros", command=opcion_nosotros)
            boton_nosotros.grid(row=1, column=0, padx=10, pady=5, sticky="ew")

            boton_cotizacion = tk.Button(frame_botones, text="Cotización", command=opcion_cotizacion)
            boton_cotizacion.grid(row=2, column=0, padx=10, pady=5, sticky="ew")

            boton_tipologia = tk.Button(frame_botones, text="Tipología", command=opcion_tipologia)
            boton_tipologia.grid(row=3, column=0, padx=10, pady=5, sticky="ew")

            boton_contactanos = tk.Button(frame_botones, text="Contáctanos", command=opcion_contactanos)
            boton_contactanos.grid(row=4, column=0, padx=10, pady=5, sticky="ew")

            boton_salir = tk.Button(frame_botones, text="Salir", command=opcion_salir)
            boton_salir.grid(row=5, column=0, padx=10, pady=5, sticky="ew")

            # Mostrar la ventana principal
            ventana.mainloop()
        else:
            # Si no se puede cargar la imagen, muestra un mensaje de error
            messagebox.showerror("Error", f"No se pudo cargar la imagen: {image_path}")
    else:
        # Si no se encuentra el archivo de imagen, muestra un mensaje de error
        messagebox.showerror("Error", f"No se encontró el archivo: {image_path}")

if __name__ == "__main__":
    ir_main()