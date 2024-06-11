try:
    archivo = open(
        'prueba.txt', 'r',
        encoding='utf8')  # Las letras son: 'r' read, 'a' append, 'w' write, 'x'
except Exception as e:
    print(e)
# print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10))  # Continuamos desde la línea anterior
#print(archivo.readline())
#print(archivo.readline())

# Vamos a iterar el archivo. Cada una de las líneas
# for linea in archivo:
    # print(linea) # Iteramos todos los elementos de archivo
# print(archivo.readlines()[11]) # accedemos al archivo como si fuera una lista

# Anexamos información, copiamos a otro
try:
    archivo2 = open('copia.txt', 'w',
                    encoding='utf8')
    archivo2.write(archivo.read())
finally:
    archivo.close() #  Cerramos el primer archivo
    archivo2.close() # Cerramos el segundo archivo
    print('Se ha terminado el proceso de leer y copiar archivos')
