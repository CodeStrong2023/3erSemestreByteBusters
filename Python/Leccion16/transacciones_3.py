# -----   Manejo de transacciones con with (Automáticamente) ------

import psycopg2 as bd

conexion = bd.connect(
    user= "postgres",
    password= "admin",
    host= "127.0.0.1",
    port= "5432",
    database= "test_bd"
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = "INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)"
            valores = ("Martina", "Perez", "MPerez@mail.com")
            cursor.execute(sentencia, valores)
            
            sentencia = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_perosna=%s"
            valores = ("Juan", "Gramo", "JuanG@mail.com", 2)
            cursor.execute(sentencia, valores)
               
except Exception as e:
    print(f"ocurrio un error, se hizo un rollback: {e}")
finally:
    conexion.close() 
    
print("Termina la transaccion")