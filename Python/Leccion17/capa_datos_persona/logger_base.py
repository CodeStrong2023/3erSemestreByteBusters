import logging as log

# pagina para la configuracion del logging -->  docs.python.org/3/howto/logging.html
#Llamamos una configuracion básica

log.basicConfig(level=log.DEBUG,
                format="%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s",
                datefmt="%I:%M:%S %p ",
                handlers=[
                    log.FileHandler("capa_datos.log"),
                    log.StreamHandler()
                ])

if __name__ == "__main__":    
    log.debug("Mensaje a nivel debug")
    log.info("Mensaje nivel info")
    log.warning("Mensaje nivel warning")
    log.error("Mensaje nivel error")
    log.critical("Mensaje nivel critical")
