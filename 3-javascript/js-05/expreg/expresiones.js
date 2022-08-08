//let texto = "Hoy parece que va a salir el sol";
//let texto01 = "La espero en el aereopuerto LA";
let texto01 = "usuario@servidor.com";

let buscar = /[\w]+@{1}[\w]+\.[a-z]{2,3}/;

console.log(buscar.test(texto01));


