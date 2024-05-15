let x = 10;  // variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');
// Creamos un objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){  // Método o función en JavaScript
        return this.nombre +' '+this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un Objeto');

let persona2 = new Object();  // Debe crear un nuevo espacio en memoria
persona2.nombre = 'Pedro';
persona2.direccion = 'Salada 14';
persona2.telefono = 53489854545;
console.log(persona2.telefono);
console.log('Creamos un nuevo Objeto');
console.log(persona['apellido']);  // Accedemos como si fuera un arreglo

// for in
console.log('Usamos el ciclo for in');
for(propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad])
}

//persona.apellido = 'Betancud';  // Cambiamos dinámicamente un valor de un Objeto
console.log('Arreglamos un error');
persona.apellida = 'Betancud';  // Cometemos un error
delete persona.apellida;  // Eliminamos el error
console.log(persona.apellido);
console.log(persona);

// Distintas formas de imprimir un objeto
// Número 1: la más sencilla, concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto, forma: 1');
console.log(persona.nombre+' '+persona.apellido);

// Número 2: a través de un ciclo for in
console.log('Distintas formas de imprimir un objeto, forma: 2');
for(propiedad in persona){
    console.log(persona[propiedad]);
}

// Número 3: la función Object.values()
console.log('Distintas formas de imprimir un objeto, forma: 3');
let personaArray = Object.values(persona);
console.log(personaArray)

// Número 4: usamos la función JSON.stringify
console.log('Distintas formas de imprimir un objeto, forma: 4');
let personaString = JSON.stringify(persona);
console.log(personaString)
