/************************ sort() ***********************/
//Ordenar los elementos de un arreglo

const arr= ["X", "A", "H", "a", "W", "b"];

arr.sort(); 

//console.log(arr);

const arr2 = ["Hola", "adiós", "bienvenido", "Calle"];

arr2.sort();

//console.log(arr2);

const arr3 = [5, 1231, 567, 1, 80];

arr3.sort((a, b) => a - b);//ordena números de menor a mayor
arr3.sort((a, b) => b - a);//ordena números de mayor a menor

//console.log(arr3);


/******************* Función declarada *********************/
//Hoisting
//Un proceso de reacomodo automático del cógigo 
function sumar(a,b){
    return a + b;
}
//console.log(sumar(5, 7));


let a = 2; 
//console.log(a);


/*****************Función expresada ************************/
//Hoisting no funciona porque esta dentro de una variable y las variables no tienen hoisting
const multiplicar = function(a, b){
    return a * b;
}

//console.log(multiplicar(3,5));

/***************** Funciones flecha *********************/
const dividir = (a,b) => {
    return a / b; 
}
//Si solo se regresa una acción puede quedar así

const div = (a,b) => a/b;

//console.log(dividir(10, 2));


/******************** ForEach() *********************/
//Un ciclo que recorre en automático todo nuestro arreglo

const arrNumeros = [1,4,6,8,10];

/* for(let i=0; i< arrNumeros.length i++){
    arrNumeros[i] = arrNumeros[i] * 2;

} */
arrNumeros.forEach((elemento) => console.log(elemento *= 2)
);
//forEach(elemento, indice, arreglo completo)