from Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self._id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)  # Esto es para agregar un nuevo producto

    def calcular_total(self):
        total = 0  # variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio

    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + ' | '
        return f'Orden {self._id_orden} \nProducto {productos_str}'

if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100)
    producto2 = Producto('Pantalón', 150)
    producto3 = Producto('saco', 300)
    producto4 = Producto('campera', 200)

    productos1 = [producto1, producto2]  # Lista de productos
    productos2 = [producto3, producto4]

    orden1 = Orden(productos1)  # Primer objeto orden pasando lista de productos
    print(orden1)
    orden2 = Orden(productos2)
    print(orden2)

    # Tarea: modificar orden2 poniendo productos y precios
    # Crear una nueva lista de productos agregandola a orden2

    #print(f'El total de orden 1 es: {orden1.calcular_total()}')
    #print(f'El total de orden 2 es: {orden2.calcular_total()}')