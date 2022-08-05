`use strict` 

function miFuncion(a, b){
    return (a + b);
}
let resultado = miFuncion(3, 6);
console.log("El resultado es: " + resultado);

/****************Función Expresión o anonima ***************/

let suma = function (a, b) {return (a + b)};

let res = suma (2, 3);

let caracteres = "La suma es: "

console.log(caracteres + res);

/* Ejercicios */

/* Suma */
let mas = function (c, d) {return (c + d)};

let resu = mas(7, 8);

console.log("El resultado de la suma es: " + resu);

/* Resta */

let menos = function (e, f) {return (e-f)};

let resul = menos (10, 9);

console.log("El resultado de la resta es: " + resul);

/* División */

let entre = function (g, h) {return (g / h)};

let result = entre (200, 9);

console.log("El resultado de la división es: " + result.toFixed(1));

/* Multiplicación */

let multi = function (i, j) {return (i * j)};

let resulta = multi (7, 8);

console.log("El resultado de la multiplicación es: " + resulta);

/****************Self Invoking *********************/

(function (a, b){
    console.log("El resultado es: " + (a + b));
}
)(3, 4); 