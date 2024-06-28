import LoginIntegrador.Cotizacion.cotizacion
import LoginIntegrador.Tipologia.tipologia
#import LoginIntegrador.Contactanos.Contactanos


def ir_main():
    while True:
        try:
            opcion = int(input("""
        ++   Bienvenido a Constructora Byte-Busters   ++
Seleccione el tamaño de la construcción:
(1) - 1
(2) - Contáctanos
(3) - Cotización
(4) - Tipologia
(5) - Salir
                """))
            if opcion == 1:
                print('Has seleccionado la opción 1')
            elif opcion == 2:
                print('Has seleccionado la opción 2')
                #LoginIntegrador.Contactanos.Contactanos.contactanos()
            elif opcion == 3:
                LoginIntegrador.Cotizacion.cotizacion.ir_cotizacion()
            elif opcion == 4:
                appTipologia = LoginIntegrador.Tipologia.tipologia.Tipologia()
                appTipologia.start()
            elif opcion == 5:
                print('Saliendo del programa...')
                break
            else:
                print("Elige una opción válida.")
        except ValueError:
            print("Error: Debes ingresar un número válido.")
        except Exception as e:
            print(f"Ocurrió un error inesperado: {e}")
