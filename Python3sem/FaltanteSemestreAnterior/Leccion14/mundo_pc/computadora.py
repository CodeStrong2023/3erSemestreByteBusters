from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado


class Computadora:
    contador_computadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadoras += 1
        self._id_computadora = Computadora.contador_computadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    def __str__(self):
        return f'''
                {self._nombre}: {self._id_computadora}
                monitor: {self._monitor} 
                teclado: {self._teclado} 
                raton: {self._raton}'
                '''


if __name__ == '__main__':

    teclado1 = Teclado('Hp', 'USB')
    raton1 = Raton('Hp', 'USB')
    monitor1 = Monitor('Hp', 20)
    computadora1 = Computadora('HP',monitor1,teclado1,raton1)
    print(computadora1)

    teclado2 = Teclado('Acer', 'Bluetooth')
    raton2 = Raton('Acer', 'Bluetooth')
    monitor2 = Monitor('Acer', 20)
    computadora2 = Computadora('Acer', monitor1, teclado1, raton1)
    print(computadora2)