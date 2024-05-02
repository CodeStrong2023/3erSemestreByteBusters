# BYTE BUSTERS 
Hola! Este repositorio esta destinado para las materias del 3er semestre, del grupo BYTE BUSTERS, estudiantes de la Tecnicatura en Programación en la UTN Sede San Rafael.




![Logo](https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/180afa3d-a66e-4664-9940-b7077f77a773/dew7rt0-9c628bd0-2a77-449f-8cf5-0714f7004290.jpg/v1/fit/w_828,h_828,q_70,strp/ghostbusters_logo_by_gearchroniclefan_dew7rt0-414w-2x.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzE4MGFmYTNkLWE2NmUtNDY2NC05OTQwLWI3MDc3Zjc3YTc3M1wvZGV3N3J0MC05YzYyOGJkMC0yYTc3LTQ0OWYtOGNmNS0wNzE0ZjcwMDQyOTAuanBnIiwiaGVpZ2h0IjoiPD0xOTIwIiwid2lkdGgiOiI8PTE5MjAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uud2F0ZXJtYXJrIl0sIndtayI6eyJwYXRoIjoiXC93bVwvMTgwYWZhM2QtYTY2ZS00NjY0LTk5NDAtYjcwNzdmNzdhNzczXC9nZWFyY2hyb25pY2xlZmFuLTQucG5nIiwib3BhY2l0eSI6OTUsInByb3BvcnRpb25zIjowLjQ1LCJncmF2aXR5IjoiY2VudGVyIn19.IEzg0xaNpan9347WgYeZEBDPd2FxlCNh7b0JBVHSJBo)


 # ¡¡¡ IMPORTANTE !!!
 ### * No se podra fusionar los archivos que contenga en su Rama Personal con la RamaSecundario o la Rama Main SIN la aprobación del Encargado de turno.<br>
 ### * No se podra agregar archivos a la RamaSecundario o la Rama Main de manera directa desde el navegador SIN la aprobación del Encargado de turno.<br>
 ### * Cada semana se designara un Encargado, y se designara a los Colaboradores. Los Colaboradores tendran una tarea asignada para realizar y un tiempo determinado para cumplirla. <br>
 ### * Si por distintos motivos algun miembro del grupo no puede cumplir con su cronograma de actividades programadas debera comunicarlas en el grupo de whatsapp para reacomodar las tareas designas.
 ### * Tareas de los Colaboradores y el Encargado de turno seleccionados:<br>
  1- El Colaborador debera crear una Rama Personal a partir de la RamaSecundaria o, si ya la tienen, deberan actualizarla con todos los últimos cambios de la RamaSecundaria.<br>
  2- El Colaborador debera trabajar de manera local en su rama personal, añadiendo la tarea asignada.<br>
  3- Una vez completa la tarea, el Colaborador debera verificar que el código funcione correctamente y enviar los cambios de su equipo local a su rama personal en GitHub.<br>
  4- Completada el paso 3, el Colaborador debera dar aviso al Encargado, quien verificara el contenido de la rama del colaborador, si todo esta en orden el Encargado la fusionara con la RamaSecundaria.<br>
  5- Una vez el encargado agrega los cambios a la RamaSecundaria debera dar aviso a un nuevo Colaborador, anteriormente seleccionado, para que este realize nuevamente los pasos 1, 2 y 3, con su tarea previamente asiganda.<br>
  6- Sera trabajo y responsabilidad del Encargado que cada nueva actualización aprobada de la RamaSecundaria sea de inmediato fusionada con la Rama Main. La Rama Main sera la última en actualizarse para asegurarnos de no cometer errores.<br>
<br>
<br>
### Algunos pasos a tener en cuenta a la hora de trabajar:<br>
      PARA CREAR UNA RAMA PERSONAL DESDE LA RAMA SECUNDARIA EN GIT BASH

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (RamaSecundaria)<br>
$ git branch Luna

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (RamaSecundaria)<br>
$ git branch<br>
  Luna<br>
  *RamaSecundaria<br>
  main<br>

                             IR A UNA RAMA

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (RamaSecundaria)<br>
$ git checkout Luna<br>
Switched to branch 'Luna'<br>


LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (Luna)<br>
$ git push --set-upstream origin Luna<br>


                         COMITEAR NUEVO TRABAJO

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (Luna)<br>
$ git status<br>
On branch Luna<br>
Your branch is up to date with 'origin/Luna'.<br>

Untracked files:<br>
  (use "git add <file>..." to include in what will be committed)<br>
        Java/Leccion01/<br>

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (Luna)<br>
$ git add .<br>

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (Luna)<br>
$ git commit -m "clase1, video 1"<br>


                 PARA ENVIAR CAMBIOS A LA RAMA PERSONAL EN GITHUB

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (Luna)<br>
$ git push<br>


                        COLOCARSE EN RAMA SECUNDARIA 

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (Luna)<br>
$ git checkout RamaSecundaria<br>
LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (RamaSecundaria)<br>


                     FUSIONAR RAMA PERSONAL CON LA SECUNDARIA 
(ANTES DE EMPEZAR A TRABAJAR, HACER GIT PULL PARA TRAER LOS CAMBIOS EN LA RAMA SECUNDARIA <br>
            A LA RAMA PERSONAL Y DESPUES EMPEZAR A REALIZAR LOS CAMBIOS)<br>

LUNA@DESKTOP /c/LUNA/UTN/3erSemestreByteBusters (RamaSecundaria)<br>
$ git merge Luna<br>



## Integrantes

- [@dalmaponce](https://www.github.com/dalmaponce)
- [@Luna201](https://www.github.com/Luna201)
- [@M-elsesser](https://www.github.com/M-elsesser)
- [@Briandif](https://github.com/Briandif)
- [@EmilianoGrossi](https://github.com/EmilianoGrossi)
- [@HernanVega753](https://github.com/HernanVega753)
- [@Nikki-021](https://github.com/Nikki-021)
- [@pablo22y](https://github.com/pablo22y)
