#MANEJO DE CONTEXTO WITH: sintaxis simolificada, abre y cierra el archivo
#with open("prueba.txt", "r", encoding="utf8") as archivo:
    #print(archivo.read())
#No hace falta ni en try, ni el finally
#en el contexto with lo se que ejecuta de manera automatica
#Utiliza diferentes metodos: __enter__ este es el que abre
#  __exit__  este es el que cierra

with manejo_Archivos("prueba.txt") as archivo:
    print(archivo.read())