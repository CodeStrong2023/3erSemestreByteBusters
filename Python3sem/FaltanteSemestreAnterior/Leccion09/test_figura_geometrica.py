from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo

print('Creación de objeto clase cuadrado'.center(50,'_'))
cuadrado1 = Cuadrado(8, 'Azul')
cuadrado1.alto = 7
#cuadrado1.ancho = 7
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')

# MRO: METHOD RESOLUTION ORDER
# print(Cuadrado.mro())

print(cuadrado1)

print('Creación de objeto clase rectángulo'.center(50,'_'))
rectangulo1 = Rectangulo(8, 9, "verde")
rectangulo1.ancho = 15
print(f'Calculo del área del rectángulo: {rectangulo1.calcular_area()}')

print(f'{rectangulo1.__str__()}')

# figura1 = FiguraGeometrica(6, 6) No puede instanciarse por ser abstracta

print(Cuadrado.mro())
