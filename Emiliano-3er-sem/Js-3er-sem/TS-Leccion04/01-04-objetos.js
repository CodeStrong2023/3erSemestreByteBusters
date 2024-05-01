let x = 10; //variable tipo primitiva

// Objeto
let persona = {
    nombre:"Carlos",
    apellido:"Alonso",
    edad: 30,
    nombreCompleto: function(){// Metodo o funcion
        return this.nombre+"  "+this.apellido;
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.nombre);
console.log(persona.nombreCompleto());

let persona2 = new Object();//Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Sala 13";
console.log(persona2.direccion);

console.log(persona["apellido"]); //Accedemos como si fuera un arreglo

//for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);//como acceder a una propiedad y luego a su valor
}

persona.apellida = "Ramos"; //cambiamos dinamicamente un valor del objeto
delete persona.apellida; // eliminamos el error

//Distintas formas de imprimir un objeto
// Numero 1: la mas sencilla, concatenar un velor de cada propiedad
console.log("Distintas formas de imprimir un objeto forma 1");
console.log(persona.nombre+" "+persona.apellido);

//Numero 2: a travez del ciclo for in
console.log("Distintas formas de imprimir un objeto forma 2");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: la funcion Object.values()
console.log("Distintas formas de imprimir un objeto forma 3");
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: utilizaremos el metodo JSON.stringify
console.log("Distintas formas de imprimir un objeto forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);
