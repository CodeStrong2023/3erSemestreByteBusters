//let persona3 = new Persona("Carla", "Gomez");  //No se permite antes de que este la clase creada

class Persona{ //clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

}

class Empleado extends Persona{//clase hija
    constructor(nombre,apellido,departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
}

let persona1 = new Persona("Martin", "Lopez");
console.log(persona1.nombre);
persona1.nombre = "Juan Carlos";
let persona2 = new Persona("Pablo", "Perez");
persona2.nombre = "Maria"
console.log(persona2.nombre);

let empleado1 = new Empleado("Maria", "Lopez", "Sistemas");
console.log(empleado1);
console.log(empleado1._apellido);