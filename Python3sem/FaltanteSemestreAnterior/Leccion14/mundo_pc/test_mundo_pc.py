from mundo_pc.computadora import Computadora
from mundo_pc.monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1 = Teclado('Hp', 'USB')
raton1 = Raton('Hp', 'USB')
monitor1 = Monitor('Hp', 20)
computadora1 = Computadora('HP',monitor1,teclado1,raton1)

teclado2 = Teclado('Acer', 'Bluetooth')
raton2 = Raton('Acer', 'Bluetooth')
monitor2 = Monitor('Acer', 20)
computadora2 = Computadora('Acer', monitor2, teclado2, raton2)

teclado3 = Teclado('Gamer', 'Bluetooth')
raton3 = Raton('Gamer', 'Bluetooth')
monitor3 = Monitor('Gamer', 27)
computadora3 = Computadora('Gamer',monitor3,teclado3,raton3)

teclado4 = Teclado('Acer', 'Bluetooth')
raton4 = Raton('Acer', 'Bluetooth')
monitor4 = Monitor('Acer', 20)
computadora4 = Computadora('Acer', monitor4, teclado4, raton4)

teclado5 = Teclado('Apple', 'Bluetooth')
raton5 = Raton('Apple', 'Bluetooth')
monitor5 = Monitor('Apple', 27)
computadora5 = Computadora('Apple',monitor5,teclado5,raton5)

teclado6 = Teclado('Samsung', 'Bluetooth')
raton6 = Raton('Samsung', 'Bluetooth')
monitor6 = Monitor('Samsung', 20)
computadora6 = Computadora('Samsung', monitor6, teclado6, raton6)

teclado7 = Teclado('Lenovo', 'Bluetooth')
raton7 = Raton('Lenovo', 'Bluetooth')
monitor7 = Monitor('Lenovo', 20)
computadora7 = Computadora('Lenovo', monitor7, teclado7, raton7)

computadoras1 = [computadora1, computadora2, computadora7, computadora4]

orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora4)m "Agregado POO"

print(orden1)

computadoras2 = [computadora3, computadora4, computadora6]

orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora1)
print(orden2)
