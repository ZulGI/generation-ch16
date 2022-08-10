//Variable que simula los datos pedidos
const saludo = "Hola Mundo";
const datos = [
    {
        nombre: "Zul",
        apellido: "García"
    },
    {
        nombre: "Zul",
        apellido: "García"
    },
    {
        nombre: "Zul",
        apellido: "García"
    }
]

//Función para simular una petición
function obtenerDatos(){
    return new Promise( (resolve, reject) => {

        setTimeout( () => {

            if(false){
                resolve(datos)
            } else {
                reject("Nunca te quiso")
            }

            
        }, 2000)
    })

}
 //Forma #1 
obtenerDatos().then( (datos) => {

    console.log(datos);

}).catch( (error) => {

    console.log("Existe una petición en la petición 1");
    console.log(error);
})
//se pueden anidar then

//Forma #2 - funciones asincronas - await async
//await se va a esperar a la promesa
//async para anunciar que es una promesa. 
//try catch lo que va a hacer si no se cumple la promesa
async function funcionAsincrona(){

    try{

        const datos = await obtenerDatos()
        console.log(datos);

    }catch(error){

        console.log(error);

    }

    

}

funcionAsincrona()