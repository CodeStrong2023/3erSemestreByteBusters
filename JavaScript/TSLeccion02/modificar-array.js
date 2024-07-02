//Modificar los elementos de un arreglo
autos[1] = 'Volvio';
console.log(autos[1]);

//Agregamos nuevos valores de areglo
autos.push('Audi');
console.log(autos);

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porche';
console.log(autos);

//3ra forma de agregar elementos teniendo CUIDADO
autos[50] = 'Renault';
console.log(autos);