import tkinter as tk
from customtkinter import CTkButton

c_azulClaro = "#86A9FD"
c_negro = "#010101"
c_morado = "#7f5af0"
c_verde = "#2cb67d"
c_azul = "#33DDFF"
c_azulOscuro = "#2980B9"
c_blanco = "#FFFFFF"

def ir_nosotros():

    def volver_al_menu():
        root.destroy()

    root = tk.Tk()
    root.title("Cotización de Construcción")

    ancho_root = root.winfo_screenwidth()
    altura_root = root.winfo_screenheight()
    ancho_root = int(ancho_root)
    altura_root = int(altura_root)
    root.geometry(f"{ancho_root}x{altura_root}")
    root.config(bg=c_azulClaro)
    root.title("Byte Busters Travel")

    # Texto de bienvenida
    bienvenida = (
        "¡Hola y bienvenidos al Chatbot Mundialista, tu fuente de información más completa y actualizada sobre la Copa del Mundo!\n\n"
        "Aquí en el Chatbot Mundialista, estamos emocionados de ayudarte a vivir la emoción del fútbol al máximo. "
        "Nuestra misión es brindarte toda la información que necesitas sobre el torneo, \n"
        "desde los partidos hasta los campeones históricos.\n\n "
        "A continuación, te presentamos las opciones que tenemos disponibles:\n\n"
        "- Grupos\n"
        "Conoce cómo están conformados los grupos del torneo, descubre qué equipos se enfrentarán y sigue de cerca el desempeño"
        "de tus selecciones favoritas.\n\n"
        "- Fechas\n"
        "No te pierdas ni un solo partido. Consulta el calendario completo de la Copa del Mundo, con fechas y horarios exactos de cada encuentro\n "
        "para que puedas planificar tus días de fútbol.\n\n"
        "- Lugar de Partidos\n"
        "Descubre en qué estadios se jugarán los partidos. Te ofrecemos información detallada sobre cada sede, desde su capacidad "
        "hasta datos históricos y curiosidades.\n\n"
        "- Historial de Campeones\n"
        "Sumérgete en la rica historia del torneo. Conoce a los equipos que han levantado la copa a lo largo de los años y revive los momentos\n "
        "más memorables de la Copa del Mundo.\n\n"
        "- Comunicación\n"
        "¿Tienes preguntas o necesitas más detalles? Estamos aquí para ayudarte. Nuestro sistema de comunicación te permite interactuar con nosotros\n "
        "para obtener respuestas rápidas y precisas.\n\n"
        "¡Estamos aquí para hacer que tu experiencia del Mundial sea inolvidable! Disfruta cada momento y que gane el mejor equipo. ¡Vamos a vivir la pasión del fútbol juntos!"
    )

    label_bienvenida = tk.Label(root, text=bienvenida, font=("sans serif", 12), bg=c_blanco, justify="left")
    label_bienvenida.pack(padx=20, pady=20)

    boton_menu = CTkButton(root, font=("sans serif", 13), border_color=c_negro, fg_color=c_azulOscuro,
                           hover_color=c_morado, corner_radius=12, border_width=2, text="Ir al Menú Principal",
                           height=40,
                           command=volver_al_menu)
    boton_menu.pack()
    boton_menu.place(relx=0.51, rely=0.8, relwidth=0.12, relheight=0.05)


    btn0 = CTkButton(root, font=("sans serif", 13), border_color=c_negro, fg_color=c_azulOscuro,
                     hover_color=c_morado, corner_radius=12, border_width=2, text="Salir", height=40,
                     command=root.quit)
    btn0.pack()
    btn0.place(relx=0.38, rely=0.8, relwidth=0.12, relheight=0.05)

    root.mainloop()

if __name__ == "__main__":
    ir_nosotros()
