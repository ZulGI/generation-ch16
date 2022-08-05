

/* Condicionales */
/* If */

let condicion = false;

if(condicion === 10){
    /* 
    Codigo que se hace si se cumple la condición A
    
    */

   console.log("Entro en la condición A");

}else if (condicion === "Hola"){
    /* 
    Codigo que se hace si se cumple la condición B
    
    */
   
    console.log("Entro en la condición B");

}else if (condicion === false){
    /* 
    Codigo que se hace si se cumple la condición C
    
    */

    console.log("Entro en la condición C");

}else {
    /* 
    Codigo que se hace si no se cumple ninguna de las condiciones anteriores
    */

    console.log("No cumple con ninguna");
}

function dividir (a, b){

    if (b === 0){
        console.log("No se puede realizar la operación ");
    }
    console.log(a/b);
}

dividir(10,2)

/************************* Switch *********************/
/* == o === regresa un true si la condición se cumple */

let nuevaCondición = 1;


switch(nuevaCondición){

    case 1:
        console.log("Buenos días");
        console.log("Espero que te encuentres bien");
         break
    case "Adios":
        console.log("Nos vemos");

    case "Saludo":
    console.log("Te mando un saludo");

    default:
        console.log("No entendi tu mensaje");
        break

}


let edad = 30

    switch(edad >= 18){
        case true:
            console.log("mayor");
            break
        case false:
            console.log("menor");
    }


let elegir = "sumar"

    switch(elegir){
        case "Sumar":
            console.log("Vamos a sumar");
            break

        case "Restar":
            console.log("Vamos a restar");
            break

        case "Dividir":
            console.log("Vamos a dividir");
            break

        case "Multiplicar":
            console.log("Vamos a multiplicar");
    }

    if(elegir === "sumar"){

        console.log("Vamos a sumar");
    
    }else if(elegir == "restar"){
    
        console.log("Vamos a restar");
    
    }else if(elegir == "dividir"){
    
        console.log("Vamos a dividir");
    
    }else if(elegir == "multiplicar"){
    
        console.log("Vamos a multiplicar");
    
    } else {
    
        console.log("No entiendo");
    
    }
    


