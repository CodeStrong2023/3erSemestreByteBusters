import tkinter as tk
from customtkinter import CTkButton
from PIL import Image, ImageTk

c_azulClaro = "#86A9FD"
c_negro = "#010101"
c_morado = "#7f5af0"
c_verde = "#2cb67d"
c_azul = "#33DDFF"
c_azulOscuro = "#2980B9"
c_blanco = "#FFFFFF"

def ir_nosotros(ventana_anterior):

    def volver_al_menu():
        root.destroy()
        ventana_anterior.deiconify()

    root = tk.Toplevel()  # Usar Toplevel en lugar de Tk para crear una nueva ventana secundaria
    root.title("Nosotros")
    ventana_anterior.withdraw()

    ancho_root = root.winfo_screenwidth()
    altura_root = root.winfo_screenheight()
    ancho_root = int(ancho_root)
    altura_root = int(altura_root)
    root.geometry(f"{ancho_root}x{altura_root}")
    root.config(bg=c_azulClaro)
    root.title("Byte Busters Travel")

    # Cargar y mostrar imagen
    image_path = "images/fondo.png"  # Asegúrate de que esta ruta sea correcta
    try:
        image = Image.open(image_path)
    except FileNotFoundError:
        print(f"Error: No se encontró el archivo de imagen en la ruta {image_path}")
        return

    image = image.resize((150, 100))  # Redimensiona la imagen si es necesario
    img = ImageTk.PhotoImage(image)

    panel = tk.Label(root, image=img)
    panel.image = img  # Necesario para evitar que la imagen sea recolectada por el garbage collector
    panel.pack(padx=10, pady=10)

    # Texto de bienvenida
    bienvenida = (
        "¡Hola y bienvenidos al Chatbot de la Copa America, tu fuente de información más completa y actualizada!\n\n"
        "Aquí en el equipo ByteBuster, estamos emocionados de ayudarte a vivir la emoción del fútbol al máximo junto a nuestro ChatBot.Nuestra misión es brindarte\n "
        "toda la información que necesitas sobre el torneo, desde los partidos hasta los campeones históricos.\n\n "
        "A continuación, te presentamos las opciones que tenemos disponibles:\n\n"
        "- Grupos\n"
        "Conoce cómo están conformados los grupos del torneo, descubre qué equipos se enfrentarán y sigue de cerca el desempeño"
        "de tus selecciones favoritas.\n\n"
        "- Fechas\n"
        "No te pierdas ni un solo partido. Consulta el calendario completo de la Copa America, con fechas y horarios exactos de cada encuentro\n "
        "para que puedas planificar tus días de fútbol.\n\n"
        "- Lugar de Partidos\n"
        "Descubre en qué estadios se jugarán los partidos. Te ofrecemos información detallada sobre cada sede, desde su capacidad "
        "hasta datos históricos y curiosidades.\n\n"
        "- Historial de Campeones\n"
        "Sumérgete en la rica historia del torneo. Conoce a los equipos que han levantado la copa a lo largo de los años y revive los momentos\n "
        "más memorables de la Copa America.\n\n"
        "- Comunicación\n"
        "¿Tienes preguntas o necesitas más detalles? Estamos aquí para ayudarte. Nuestro sistema de comunicación te permite interactuar con nosotros\n "
        "para obtener respuestas rápidas y precisas.\n\n"
        "¡Estamos aquí para hacer que tu experiencia sea inolvidable! Disfruta cada momento y que gane el mejor equipo. ¡Vamos a vivir la pasión del fútbol juntos!"
    )

    label_bienvenida = tk.Label(root, text=bienvenida, font=("sans serif", 12), bg=c_blanco, justify="left")
    label_bienvenida.pack(padx=20, pady=20)

    boton_menu = CTkButton(root, font=("sans serif", 13), border_color=c_negro, fg_color=c_azulOscuro,
                           hover_color=c_morado, corner_radius=12, border_width=2, text="Ir al Menú Principal",
                           height=40, command=volver_al_menu)
    boton_menu.pack()
    boton_menu.place(relx=0.51, rely=0.85, relwidth=0.12, relheight=0.05)

    btn0 = CTkButton(root, font=("sans serif", 13), border_color=c_negro, fg_color=c_azulOscuro,
                     hover_color=c_morado, corner_radius=12, border_width=2, text="Salir", height=40,
                     command=root.quit)
    btn0.pack()
    btn0.place(relx=0.38, rely=0.85, relwidth=0.12, relheight=0.05)

    root.mainloop()
