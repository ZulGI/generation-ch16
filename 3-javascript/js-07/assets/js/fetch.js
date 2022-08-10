const url = "https://dog.ceo/api/breeds/image/random"

//Respuesta de la petición
fetch(url).then( (respuesta) => {
    console.log(respuesta);
})


//Obtener la información de la petición
fetch(url)
.then((respuesta) => respuesta.json())
.then((datos) => {

    console.log(datos);

}).catch((error) => {
    console.log(error);
})

//Forma #2
async function ObtenerPerritoAleatorio(){
    try{
        
        const respuesta = await fetch(url);
        const datos = await respuesta.json()

    console.log(datos);

    }catch(error){

        console.log(error);
    }
}

ObtenerPerritoAleatorio()

