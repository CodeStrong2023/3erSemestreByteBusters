import google.generativeai as genai

# Configurar la llave de acceso a Gemini
genai.configure(api_key="AIzaSyD-p5XxwdQlU-6JQYCdsFm6518UUHA8cpI")
model = genai.GenerativeModel("gemini-pro")

# Definir una lista de preguntas específicas
preguntas = {
    "1": "Lista de todos los paises que enfrento Argentina en Qatar 2022",
    "2": "Lista de jugadores en Argentina vs Arabia Saudita",
    "3": "Lista de jugadores en Argentina vs México",
    "4": "Lista de jugadores en Argentina vs Polonia",
    "5": "Lista de jugadores en Argentina vs Australia",
    "6": "Lista de jugadores en Argentina vs Países Bajos",
    "7": "Lista de jugadores en Argentina vs Croacia",
    "8": "Lista de jugadores en Argentina vs Francia",
    "9": "Estadistica de la Selección Argentina en Qatar 2022",

    # Agregar más preguntas aquí si es necesario
}

# Guardar las entradas y relacionar las respuestas
chat_historia = []

while True:
    # Mostrar las opciones de preguntas
    print("")
    for key, value in preguntas.items():
        print(key + ": " + value)
    print("10: Hazme una pregunta")
    print("0: Salir")

    # Solicitar al usuario que seleccione una opción
    opcion = input("Ingresa el número de la pregunta o '0' para salir: ")

    if opcion == "10":
        chat_historia = []
        while True:
            pregunta = input("Hazme una pregunta: ")

            # guarda el rol (usuario) y el contenido (pregunta)
            chat_historia.append({"role": "user", "content": pregunta})

            # response = respuesta de la ia
            response = model.generate_content(pregunta)

            # guarda el rol (asistente) y el contenido (respuesta)
            chat_historia.append({"role": "assistant", "content": response})

            # imprime la respuesta
            print(response.text)
            break

    if opcion == "0":  # Salir cierra el programa
        print("Hasta luego ;)")
        break

    # Verificar si la opción seleccionada es válida
    if opcion in preguntas:
        pregunta_seleccionada = preguntas[opcion]

        # Guardar el rol (usuario) y el contenido (pregunta)
        chat_historia.append({"role": "user", "content": pregunta_seleccionada})

        # Usar el modelo de IA para generar una respuesta
        response = model.generate_content(pregunta_seleccionada)

        # Guardar el rol (asistente) y el contenido (respuesta)
        chat_historia.append({"role": "assistant", "content": response})

        # Imprimir la respuesta
        print(response.text)

    else:
        print("")
        print("Por favor, selecciona una opción.")
