from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    print(objeto)  # De manera indirecta estamos llamando __str__ de la clase empleado o gerente
    print(type(objeto))  #Saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)

empleado = Empleado('Ariel', 50000)
imprimir_detalles(empleado)

gerente = Gerente('Natalia', 60000, 'Sistemas')
imprimir_detalles(gerente)
