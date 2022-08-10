/* URL a consumir */
const urlPokemon = "https://pokeapi.co/api/v2/pokemon/120"


/* Elementos del DOM */
const imgPokemon = document.getElementById("img-pokemon")

const idPokemon = document.getElementById("id-pokemon")

const nombrePokemon = document.getElementById("nombre-pokemon")


/* Funciones */
async function obtenerPokemon(url){
    const respuesta = await fetch(url)
    const datos = await respuesta.json()

    const pokemon = {
        nombre: datos.forms[0].name,
        habilidad: datos.abilities,
        id: datos.id,
        tipos: datos.types,
        imagen: datos.sprites.other["official-artwork"].front_default

    }

    imgPokemon.src = pokemon.imagen;
    idPokemon.textContent = `ID: ${pokemon.id}`;
    nombrePokemon.textContent = pokemon.nombre

}

obtenerPokemon(urlPokemon)