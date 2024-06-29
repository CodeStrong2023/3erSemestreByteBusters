# MANEJO DE CONTEXTO with | sintaxis simplificada, abre y cierra el archivo
# with open('prueba.txt', 'r',
         # encoding='utf8') as archivo:
    # print(archivo.read())
    # No es necesario el try ni el finally
    # En el contexto with, lo que se ejecuta de manera automática
    # Utiliza diferentes métodos: __enter__ y __exit__
from ManejoArchivos import ManejoArchivos

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())
