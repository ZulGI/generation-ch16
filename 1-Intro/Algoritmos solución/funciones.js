//Funciones

function sumar (numero1, numero2){
    console.log("Voy a sumar");
    console.log("El resultado de la suma es:" + (numero1 + numero2));
}

//sumar(4, 5)

//Ejercicio 2 utilizando funciones


function calcularSueldo (sueldoIngresado, diasTrabajados){
   
l/* et nombre = prompt("Escribe tu nombre")
console.log(nombre); */

const sueldo = sueldoIngresado;
const diasSemana = diasTrabajados;
const semanasMes = 4;

console.log("Sueldo semanal: " + (sueldo * diasSemana));
console.log("Sueldo mensual: " + (sueldo * diasSemana * semanasMes));


return semanasMes;
};

/* let mes =calcularSueldo(100, 2)

calcularSueldo(100, 2)  */


//console.log(mes);

//Calculadora de porcentaje

function calcularPorcentaje (numero, porcentaje){
    
    let resultado = numero * porcentaje;
    
    return resultado;
};

let resultadoFuncion = calcularPorcentaje(100, 0.40);
console.log(resultadoFuncion);
