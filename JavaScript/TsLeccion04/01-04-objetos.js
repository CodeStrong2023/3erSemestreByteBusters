let x = 10;  // variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');
// Creamos un objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase();  // Convierte las minúsculas a mayúsculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){  // Método o función en JavaScript
        return this.nombre +' '+this.apellido;
    },
    get nombreEdad(){
        return this.nombre+' edad: '+this.edad;
    },
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

console.log('Comenzamos a usar el método get');
console.log(persona.nombreEdad);
persona.lang = 'en';
console.log(persona.lang);

function Persona3 (nombre, apellido, email){  // Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombre = 'Luis';  // modificamos el nombre
padre.telefono = '5254254254542';  // Es una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto());
let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono);  // La propiedad no está definida
console.log(madre.nombreCompleto());
// Diferentes formas de crear objetos
// caso Objeto 1
let miObjeto = new Object();
// caso Objeto 2
let miObjeto2 = {};

// caso String 1
let miCadena = new String('Hola')
// caso String 2
let miCadena2 = 'hola';

// caso con números 1
let miNumero = new Number(1);  // Es formal no recomendable
// caso con números 2
let miNumero2 = 1;  // sintaxis recomendada

// caso boolean 1
let miBoolean1 = new Boolean(false);
// caso boolean 2
let miBoolean2 = false;

// caso arreglos 1
let miArreglo1 = new Array();
// caso arreglos 2
let miArreglo2 = [];

// caso funciones 1
let miFuncion1 = new function(){};  // Todo despues de new es considerado objeto
// caso funciones 2
let miFuncion2 = function(){};  //notación simplificada y recomendada

// Uso de prototype
Persona3.prototype.telefono = '261898983';
console.log(padre);
madre.telefono = '75158375335'
console.log(madre.telefono);

// Uso de call
let Persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let Persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(Persona4.nombreCompleto2('Lic.', '51857935575'));
console.log(Persona4.nombreCompleto2.call(Persona5, 'Ing.', '7957927593'));

// Metodo Apply
let arreglo =['Ing.', '58747537843'];
console.log(Persona4.nombreCompleto2.apply(Persona5, arreglo));


