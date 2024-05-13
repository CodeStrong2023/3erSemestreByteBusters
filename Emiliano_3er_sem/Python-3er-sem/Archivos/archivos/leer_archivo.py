#archivo = open("prueba.txt", "r", encoding="utf8")
#print(archivo.read())

archivo = open("prueba.txt", "a", encoding="utf8")

archivo = open("prueba.txt", "x", encoding="utf8")
#print(archivo.read(16))#Se muestran las primeras 16 letras
#print(archivo.read(16))#continuamos desde la linea anterior
#print(archivo.readline())

#vamos a iterar el archivo, cada uno de las lineas
for linea in archivo:
    print(linea) #iteramos todos los elementos del archivo
    #print(archivo.readlines()[11])#Accedemos al archivo como si fuera una lista

#Anexamos informacion, copiamos a otro
archivo2 = open("copia.txt", "a", encoding="utf8")
archivo2.write(archivo.read())
archivo.clase()#cerramos el primer archivo
archivo2.clase()#cerramos el segundo archivo