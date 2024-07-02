miFuncion(3, 2); // Esto se conoce como HOISTING

function miFuncion(a, b){
    //console.log("sumamos: "+ (a+b));
    return a+b;
}

// Llamamos la función
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//Declaramos una función de tipo expresión o anónima
let x = function(a, b){return a + b};
resultado = x(5, 6);  // Al llamarla, se pone la variable y paréntesis
    
console.log(resultado);

//Funciones de tipo self e invoking
(function(a,b){
    console.log('Ejecutando la función: '+ (a + b))
})(6,9)

console.log(typeof miFuncion);

function miFuncionDos(a, b){
    console.log(arguments.length);
}
miFuncionDos(5, 7, 3, 4);

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

//Funciones Flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7);  // Asignamos el valor a una variable
console.log(resultado);

//Función de tipo expresión
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]);  // Muestra el parámetro de: a
    console.log(arguments[1]);  // Muestra el parámetro de: b
    
    return (a + b) + arguments[2];
}
resultado = sumar(3, 2, 9);
console.log(resultado);

let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);

function sumarTodo(){
    suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];  //arguments es para arreglos
    }
    return suma;
}

//Tipos primitivos
let k = 10;
function cambiarValor(a){  // Paso por valor
    a = 20;
}
cambiarValor(k);
console.log(k);

const persona = {  // Paso por referencia
    nombre: 'Juan',
    apellido: 'Lopez'
}
console.log(persona);

function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}
cambiarValorObjeto(persona);
console.log(persona);