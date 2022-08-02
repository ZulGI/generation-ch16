"use strict";
 //JS de forma estricta

 /* Tipos de variables */
 let a; //Local
 var b; //Global
 const c = 0;//Constante y local

 /* Scope - contexto
 espacio en el que vive la variable */
 
 /* Tipos de datos */

//Strig
let cadena = "Hola Mundo"
let cadena2 = "Adios"

//Number
let numero = 5;
let numero1 = 5.89;
let numero3 = 5.89;

//Boolean
let boleano = true;
let boleano2 = false;

//undefined
let variable;

//null
let vacio = null;


/* NaN - Not a Number
no es un numero; tratar de realizar alguna operación aritmética
con algún dato que no es un numero */

/* plantillas 
template strings
literal strings
interpolación
*/
/* console.log(`Esta es una cadena ${5 + 4}`);
console.log("Esta es una cadena ${5 + 4]"); */

let nombre = `Raul`;

//let presentación = ``;
/* console.log("Mi nombre es " + nombre);
console.log(`Yo me llamo ${nombre}`); */

/* Arreglos - matrices - arrays */
let arr = [1, "A", null, undefined, [true, false]];

//notación de corchetes
/* console.log(arr[4][0]); */

if (arr[4][0] === true){
    console.log("es verdad");
}

let arr2 = new Array("B", 2);
/* console.log(arr2); */

/* Objetos */
//clave / valor

const persona = {
    nombre: `Raúl`, 
    edad: 31,
    hobbies: [
        "Leer",
        "Ver Srek 1 y 2",
        "Comer"
    ],
    auto: {
        marca: "VW",
        modelo: "Pointer",
        year: 2000,
    }, 
    saludar: function (){
        return "Saludar"
    }
};

persona.nombre= "Panchito";

//Notación de punto
console.log(`Mi nombre es ${persona.nombre}`);

console.log(`Mi hobbie favorito es ${persona.hobbies[1]}`);

console.log(`La marca de mi carro es ${persona.auto.marca}`);

console.log(`La reacción que realizo es: ${persona.saludar()}`);

//Arreglo de objetos
[{}, {}, {}]



