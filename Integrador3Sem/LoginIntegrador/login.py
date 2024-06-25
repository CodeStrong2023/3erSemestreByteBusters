import psycopg2
from tkinter import Tk, Frame, Label, Entry, ttk, Button
from PIL import Image, ImageTk
from registro_usuarios import RegistroUsuario  # Importa la clase RegistroUsuario
import bcrypt  # Librería para encriptar la contraseña

class Login:
    def __init__(self, root):
        self.root = root
        self.root.title("Constructora BYTEBUSTERS | Iniciar Sesión")

        # Frame
        self.frame = Frame(root)
        self.frame.pack(fill='both', expand=True)

        # Carga y coloca la imagen
        self.cargar_imagen("img/bytebusters_constructora.png")

        # Frame para el formulario
        self.form_frame = Frame(self.frame)
        self.form_frame.grid(row=0, column=1, padx=20, pady=20)

        # Label Título
        label = Label(self.form_frame, text="Ingreso de usuarios | CONSTRUCTORA BYTEBUSTERS")
        label.grid()

        # Separador horizontal
        self.separador(1, 0, self.form_frame)

        # Guardo los nombres que tendrán los Labels y los posiciono
        campos = ['Usuario', 'Contraseña']
        self.entries = {}  # Diccionario para guardar las respuestas
        for i, campo in enumerate(campos):
            label = Label(self.form_frame, text=campo)
            label.grid(row=2 * i + 2, column=0)
            entry = Entry(self.form_frame, width=30, show="*" if campo == "Contraseña" else "")
            entry.grid(row=2 * i + 3, column=0)
            self.entries[campo] = entry

        # Separador después de los campos
        self.separador(2 * len(campos) + 2, 0, self.form_frame)

        # Label para mensajes de error
        self.error_label = Label(self.form_frame, text="", fg="red")
        self.error_label.grid(row=2 * len(campos) + 4, column=0, pady=10)

        # Botón CONFIRMAR
        button = Button(self.form_frame, text="CONFIRMAR", command=self.validar_campos)
        button.grid(row=2 * len(campos) + 2, column=0, pady=10)

        # Botón REGISTRARSE
        button_registrar = Button(self.form_frame, text="REGISTRARSE", command=self.ir_a_registrar)
        button_registrar.grid(row=2 * len(campos) + 3, column=0, pady=10)

    def cargar_imagen(self, ruta_imagen):
        try:
            imagen = Image.open(ruta_imagen)
            imagen = imagen.resize((200, 200), Image.LANCZOS)  # Ajusta el tamaño de la imagen
            self.imagen_tk = ImageTk.PhotoImage(imagen)
            self.label_imagen = Label(self.frame, image=self.imagen_tk)
            self.label_imagen.grid(row=0, column=0, padx=10, pady=10)
        except Exception as e:
            print(f"Error al cargar la imagen: {e}")

    def separador(self, fila, columna, frame):
        separador = ttk.Separator(frame, orient='horizontal')
        separador.grid(row=fila, column=columna, columnspan=3, sticky='ew', pady=20)

    def ir_a_registrar(self):
        # Función para abrir la ventana de registro
        self.root.withdraw()  # Oculta la ventana actual
        registrar_root = Tk()  # Crea una nueva ventana para el registro
        registrar_usuario = RegistroUsuario(registrar_root, self.root)  # Pasa la ventana de login a RegistroUsuario
        registrar_root.mainloop()

    def validar_campos(self):
        try:
            usuario = self.entries['Usuario'].get()  # Obtenemos los valores usuario y contraseña
            contraseña = self.entries['Contraseña'].get()

            if usuario and contraseña:
                try:
                    conexion = psycopg2.connect(user='postgres',
                                                password='admin',
                                                host='127.0.0.1',
                                                port='5432',
                                                database='integrador_constructora')

                    with conexion:
                        with conexion.cursor() as cursor:
                            query = "SELECT contrasenia FROM usuarios WHERE usuario = %s"
                            cursor.execute(query, (usuario,))
                            #resultado = cursor.fetchone()  DESCOMENTAR
                            resultado = 'a'

                            if resultado:
                                #  resultado[0] es el hash creado en la base de datos. encode('utg-8') Convierte este
                                #  hash en una secuencia de bytes utilizando la codificación UTF-8
                                #contraseña_encriptada = resultado[0].encode('utf-8') DESCOMENTAR
                                #  la funcion bcryptpw recupera la salt del hash guardado en contraseña_encriptada

                                #if bcrypt.checkpw(contraseña.encode('utf-8'), contraseña_encriptada): DESCOMENTAR
                                if contraseña == 'a':  # BORRAR LUEGO
                                    # DESCOMENTAR LINEAS 93, 99, 102 Y BORRAR LINEAS 103 Y 94
                                    self.error_label.config(text="Inicio de sesión exitoso", fg="green")
                                    print("Inicio de sesión exitoso para:", usuario)

                                    #------------ El ingreso correcto se conectaría acá -----------

                                else:
                                    self.error_label.config(text="Usuario o contraseña incorrectos", fg="red")
                                    print("Usuario o contraseña incorrectos")
                            else:
                                self.error_label.config(text="Usuario o contraseña incorrectos", fg="red")
                                print("Usuario o contraseña incorrectos")

                except Exception as e:
                    self.error_label.config(text=f'Ocurrió un error: {e}')
                    print(f'Ocurrió un error: {e}')

                finally:
                    if 'conexion' in locals():
                        conexion.close()

                self.limpiar_campos()

            else:
                self.error_label.config(text="Por favor, llene todos los campos.")

        except KeyError as e:
            self.error_label.config(text=f"Error al obtener el campo: {e}")
            print(f"Error al obtener el campo: {e}")

    def limpiar_campos(self):
        for entry in self.entries.values():
            entry.delete(0, 'end')


if __name__ == "__main__":
    root = Tk()
    login = Login(root)
    root.mainloop()