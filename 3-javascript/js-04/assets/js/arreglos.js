/******************** Arreglos *******************/
//Colección de elementos
//Cada elemento ocupa una posición
//Esa posición se conoce como indice y compienza a partir de 0

let arr = [1, 2,[true], 3, 4];
console.log(arr);

//propiedades - describen
//métodos - acciones que puede realizar

console.log(arr[2]);
arr[4] = 190;
arr[4] = "Hola"
console.log(arr);


/****************** Métodos de arreglos *******************/
//Modifican el arreglo original
const arreglo = ["adiós"];

//push()////////////////////////////
//Agrega elementos al final del arreglo
arreglo.push(2);
arreglo.push(true);

let num = 500;
arreglo.push(num);

console.log(arreglo);

//unshift() ////////////////////////
//Agrega elementos al inicio del arreglo
arreglo.unshift("A");
arreglo.unshift("B");

console.log(arreglo);

console.log(typeof (arreglo[4]));

//Pop() //////////////////////////
//Métodos para quitar elementos del final del areglo

let dato1 = arreglo.pop()
console.log(dato1);

console.log(arreglo);

//Shift() ///////////////////////
//Quitar un elemento del inicio del arreglo

let dato2 = arreglo.shift();
console.log(dato2);
console.log(arreglo);

//splice() ///////////////////////
//Quitar una parte de cualquier posición de nuestro arreglo
//Permite reemplazar un elemento
//Permite insertar un elemento en una posición en especifico

arreglo.splice(1, 1, "Parangaricutirimicuaro");
//Splice(posición de inicio, cantidad de elementos a afectar, elemento/s que se quiere agregar)
console.log(arreglo);

/* ******************************************************* */

//Métodos que no modifican el arreglo original.
//Hacen una copia, modifican esa copia 

//slice /////////////////////////
let dato3 = arreglo.slice(0, 2);

//slice(posición a partir de la cual va a cortar, posición hasta la cual se va a terminar de cortar )
//se indica un rango
//genera un arreglo con el elemento cortado

console.log(dato3);
console.log(arreglo);