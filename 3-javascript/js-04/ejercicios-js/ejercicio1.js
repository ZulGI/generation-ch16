//Parte 1 //////////////
/* Hay tres personas esperando el banco. Sus nombres, en orden, son Sofía, David y Juan. Cree una matriz que tenga estos tres nombres en orden. */

let barco = ["Sofía", "David", "Juan"]
console.log(barco);

//Parte 2 /////////////
/* Se agregan dos personas más al final de la fila: Sara y Augustin. La primera persona en la fila es llamada al cajero. ¿Cómo es la cola? */

barco.push("Sara", "Agustin");
barco.shift();
console.log(barco);

//parte 3
/* Resulta que David estaba reservando un lugar para su amiga Renata. Ella aparece y va detrás de él en la fila. Aparece una persona más (Elena) y va hasta el final de la fila. ¿Cómo es la cola? */

barco.splice(1, 0, "Renata");
barco.push("Elena")
console.log(barco);