/* Escriba bucles while para hacer lo siguiente: */ 

/* – Imprimir repetidamente el valor de la variable xValue, disminuyéndolo en 0,5 cada vez,
siempre que xValue siga siendo positivo. */

let xValue = 10;

while(0 < xValue){
    console.log(xValue);

    xValue-=0.5;
}


/* - Imprime todos los números impares entre 1 - 100. */

let i = 0;
while (i <= 100) {
    if(i % 2 === 1) {
        console.log(i)
    }
    i++;
}

/* - Escriba un método con un bucle while para imprimir del 1 al n entre corchetes.
Por ejemplo, si n = 6 imprime [1] [2] [3] [4] [5] [6] */

let numero = parseInt(prompt("Escribe un número"));
console.log(numero);

while (0 < numero) {
    console.log("[" + numero + "]");

    numero++;
}

/* - Escriba un método con un bucle while que calcule la suma de los primeros n enteros positivos:
suma = 1 + 2 + 3 + … + n
Ejemplos:
n = 5 suma = 15
n = 19 suma = 190 */


let suma = 0;
let num = 19;
console.log("n = " + num);

while (num >= 0) {
    suma = suma + num;
    num--;
}
console.log("suma = " + suma);