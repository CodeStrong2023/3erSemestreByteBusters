PARA CREAR UNA RAMA PERSONAL

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (main)
$ git branch Luna

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (main)
$ git branch
  Luna
  RamaSecundaria
* main

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (RamaSecundaria)
$ git checkout Luna
Switched to branch 'Luna'

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (Luna)
$ git push --set-upstream origin Luna


                         COMITEAR NUEVO TRABAJO

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (Luna)
$ git status
On branch Luna
Your branch is up to date with 'origin/Luna'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Java/Leccion01/

nothing added to commit but untracked files present (use "git add" to track)

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (Luna)
$ git add .

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (Luna)
$ git commit -m "clase1, video 1"
[Luna c11b3cc] clase1, video 1


                   PARA ENVIAR A LA RAMA PERSONAL EN GITHUB

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (Luna)
$ git push


                        COLOCARSE EN RAMA SECUNDARIA 

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (Luna)
$ git checkout RamaSecundaria


               FUSIONAR RAMA PERSONAL CON LA SECUNDARIA 
(ANTES DE EMPEZAR A TRABAJAR, HACER GIT PULL PARA TRAER LOS CAMBIOS EN LA RAMA SECUNDARIA)

LUNA@DESKTOP-MPR49LC MINGW64 /c/LUNA/UTN/3erSemestreByteBusters (RamaSecundaria)
$ git merge Luna

