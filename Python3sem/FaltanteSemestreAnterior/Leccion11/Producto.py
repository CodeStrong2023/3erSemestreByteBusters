class Producto:
    contador_productos = 0  # Variable de clase

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1  # Aumento para variable de clase
        self._id_producto = Producto.contador_productos  # Asignación desde la variable de clase
        self._nombre = nombre
        self._precio = precio

    # Métodos setters and getters
    @property
    def nombre(self):
        return self._nombre

    @property
    def precio(self):
        return self._precio

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @precio.setter
    def precio(self, precio):
        self._precio = precio

    # Sobreescribimos el método __str__
    def __str__(self):
        return f'Id Producto: {self._id_producto} Nombre: {self._nombre} Precio {self._precio}'


if __name__ == '__main__':  # Sólo será visible si la prueba se ejecuta desde aquí
    producto1 = Producto('Camiseta', 100)
    producto2 = Producto('Pantalón', 150)
