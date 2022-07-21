
function saludar (  ){
    console.log("Hola Mundo")
}

//saludar();

//Arreglos
//Se crean con estos simbolos []

let num = [];
//console.log(num);

//Forma no tan común pero sirve igual
let arr1 = new Array(); 
//console.log(arr1);


//usar un arreglo

const arr = [1,2,3,4,5,];
//Notación de corchetes []
//Para llamar a un espacio en especifico.
//console.log(arr[3]);

arr[5] = 25;
arr[6] = 8;
arr[6] = 0;
//arr[8] = undefined

arr[10] = 40;

arr[7] = 9;

//console.log(arr);

//Propiedades de los arreglos
//descripción de nuestro arreglo

//console.log(arr.length);

//Un objeto tamién tiene metodos, 
//Hacen referencia a las acciones que puede relizar el arreglo

const frutas = ["Manzanas", "Platano"];
console.log(frutas);

//push()
//agrega un valor al final del arreglo

let fruta = "Toronja";

frutas.push("Naranja");
frutas.push(fruta);

console.log(frutas);

//pop()
//quita un elemente del final del arreglo

let elementoBorrado = frutas.pop();
console.log(frutas); 
console.log(elementoBorrado);

//unshift()
//Agrega uno o más elemento al inicio del arreglo

let devolver = frutas.unshift("Uva", "Pera");
console.log(frutas);
console.log(devolver);

//Shift
//elimina un elemento del inicio de un arreglo
//el método es acumulable 
frutas.shift();
frutas.shift();
let frutaQuitada = frutas.shift();
frutas.shift();
console.log(frutaQuitada);

console.log("División");

//Arreglo multidimensional: Un arreglo dentro de otro.
const newArr= [1, 45, "Hola", "Adiós", true, null,[
    30, 31, 32], ["Azul", "Amarillo", "Verde"]];

    console.log(newArr[7][1]);

//Objetos
//estructura especial llamada objeto
//nos permite guardar pares de valores
//Key - value
//LLave - valor

const obj = {
    nombre : "Pedro", 
    edad : 25,
    color : "Azul",
    hobbies : ["Leer", "Correr"],
    newArr : newArr
}; 

console.log(obj.edad);
console.log(obj.hobbies[1]);