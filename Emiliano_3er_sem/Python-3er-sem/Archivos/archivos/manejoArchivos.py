#Declaramos una  variable
try:
    archivo = open("prueba.txt", "w", encoding="utf8")#La w es de write que significa escribir
    archivo.write("Programando con tipos de archivos \n")
    archivo.write("Las palabras con acentro: acción, ejecución, etc \n")
    archivo.write("las letras son:\nr read leer, a append anexa, w write escribe, x crea un archivo, t esta es para texto o text, b archivos binarios, w+ y r+ lee y escribe ")
except Exception as e:
    print(e)
finally:#Siempre se ejecuta
    archivo.close()#Con esto se debe cerrar el archivo