class numerosIgualesExcepcion(Exception):#Extiende de la clase
    def __init__(self,mensaje):
        self.mensaje = mensaje