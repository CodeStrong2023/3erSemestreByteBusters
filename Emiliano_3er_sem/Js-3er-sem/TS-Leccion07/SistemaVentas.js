class Producto{
    static cotadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.cotadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){
        return this._idProducto+" "+this._nombre+" "+this._precio;
    }
}


class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){ //Simula una constante
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);//SINTAXIS NUMERO 1
            //this._productos[this._contadorProductosAgregados++] = producto; ---//SINTAXIS NUMERO 2----
        }
        else{
            console.log("No se pueden agregar mas productos");
        }
    }///Fin del metodo agregarProducto

    clacularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }///Fin ciclo For
        return totalVenta;
    }///Fin del metodo calcularTotal

    mostrarOrden(){
        let productoOrden = " ";
        for(let producto of this._productos){
            productoOrden += producto.toString()+" ";
        }///Fin del ciclo For
        console.log("Orden: "+this._idOrden +", Total: "+this.clacularTotal() +", Productos: "+this.productoOrden);
    }///Fin metodo mostrarOrden
}/// Fin de la clase Orden


let producto1 = new Producto("Pantalon", 200);
let producto2 = new Producto("Remera", 100);
let producto3 = new Producto("Gorro", 50);
let orden1 = new Orden();   
let orden2 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden1.mostrarOrden();
orden2.mostrarOrden();
