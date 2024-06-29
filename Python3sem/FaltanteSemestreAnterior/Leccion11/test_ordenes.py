from Orden import Orden
from Producto import Producto

producto1 = Producto('Camiseta', 100)
producto2 = Producto('Pantalón', 150)
producto3 = Producto('saco', 300)
producto4 = Producto('campera', 200)

productos1 = [producto1, producto2]  # Lista de productos
productos2 = [producto3, producto4]

orden1 = Orden(productos1)  # Primer objeto orden pasando lista de productos
orden1.agregar_producto(producto4)
print(orden1)
orden2 = Orden(productos2)
orden2.agregar_producto(productos1)
print(orden2)