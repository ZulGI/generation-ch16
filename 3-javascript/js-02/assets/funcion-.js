function miSuma(a, b){
    let resultado = (a + b);
    console.log("la suma es: "+ resultado);
}

miSuma(2, 3);

function miSuma(a, b){
    console.log("la suma es: "+ (a + b));
}

miSuma(4, 6)

//

function miProducto(a, b){
    return (a * b);
}

console.log("el producto es "+ miProducto(4, 5));


//

let res;

function miResta(a, b){
    return (a - b);
}
res= miResta(10, 4);

console.log("La resta es " + res);

//Ejercicios

function miNombre(nombres, apellidoPaterno, apellidoMaterno){
    return (nombres + " " + apellidoPaterno + " " + apellidoMaterno)
}
let nombres = "Zuleica Sahian";
let apellidoPaterno = "García";
let apellidoMaterno = "Islas";

console.log("Mi nombre es " + miNombre(nombres, apellidoPaterno, apellidoMaterno));

/* División */

function miDivision(al, bl){
    return (al / bl)
}
console.log("El resultado de la división es " + miDivision(2938, 33));