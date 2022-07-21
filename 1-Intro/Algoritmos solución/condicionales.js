//Control de flujo

//let nombre = "Minushk"
//prompt es para interactuar con el usuario

let nombre = prompt("escribe tu Nombre");
console.log(nombre);

//Casteo - convertir un tipo de dato
// parseInt es para convertir texto a número
let edad = parseInt( prompt("Escribe tu edad"));
console.log(edad);

if(nombre === "Sahian" && edad === 18){
    //scope - contexto, lo que abarca el bloque {}
    console.log("Hola")
    console.log("Eres una chica(❁´◡`❁)")
    
}else if (nombre === "Minushka" || nombre === "Mitzhu" || nombre === "Kiyo"){
    console.log("Hola");
    console.log("Eres un gato🐱‍👤");
}


else {
    console.log("Hola");
    console.log("No sé qué eres ༼ つ ◕_◕ ༽つ");
}
//Para delimitar lo que va a hacer nuestro bloque se usan
//las llaves {}, lo que este dentro de las llaves queda
//aisaldo de lo demás


console.log("Adiós🐱‍💻");



