/******** Funciones como Objetos *********/
function miFuncion (a, b){// a y b son parametros o atributos, propiedades
    let res = 0; //propiedad
    res = (a * b); //acción o proceso
    return res;
}

console.log(typeof miFuncion);
var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto);