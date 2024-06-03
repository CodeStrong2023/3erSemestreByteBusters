//let persona3 = new Persona("Carla", "Gomez");  //No se permite antes de que este la clase creada

class Persona{ //clase padre

    static contadorPersonas = 0;//atributo estatico
    //email = "Valor email";//atributo no estatico

    static get MAX_OBJ(){// Este metodo simula una constante
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorObjetosPersona; 
        }
        else{
            console.log("Se ha superado el maximo de objetos")
        }
       
        //console.log("se incrementa el contador: "+Persona.contadorObjetosPersona);
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

    nombreCompleto(){
        return this.idPersona+" "+_nombre +" "+ this._apellido;
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

    //Sobreecritura
    nombreCompleto(){
        return super.nombreCompleto()+", "+this.departamento;
    }
    //Sobreescribimos el metodo de la clase padre(Object)
    toString(){//Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("Metodo static");
    }

    static saludar2(persona){
        console.log(persona.nombre+" "+persona.apellido);
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

//Object.prototype.toString //Esta es una manera de acceder a atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); // no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); // no se puede acceder desde la clase
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona("Romina", "Ramos");
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; // no se puede modificar ni alterar

let persona4 = new Persona("Franco", "Moya");
console.log(persona4.toString());