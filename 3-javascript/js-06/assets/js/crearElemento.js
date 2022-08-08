
//crear un elemento
const imagen = document.createElement(`img`);

//Modificar los atributos HTML del elemento.
imagen.src = `https://placeimg.com/640/480/nature`;
imagen.alt = `Imágenes aleatorias de animales`;

//Insertamos un elemento padre
document.body.appendChild(imagen);
document.body.insertAdjacentElement("afterbegin", imagen);
document.body.insertAdjacentElement("afterend", imagen);
document.body.insertAdjacentElement("beforebegin", imagen);
document.body.insertAdjacentElement("beforeend", imagen);

//Forma correcta de crear e insertar un elemento
//1- se crea el elemento que contendrá la imagen
//2- seleccionar el elemento padre
const padreImg = document.getElementById(`padreImg`);

//3- crear el elemento
const imagen2 = document.createElement(`img`);

//4- modificamos los atributos del elemento
imagen2.src = "https://placeimg.com/640/480/people";
imagen2.alt = "Imagenes de personas";

//5- insertar elemento
padreImg.appendChild(imagen2);

//Utilizar forEach para pintar datos
const frutas = ["Toronja", "Manzana", "Mandarina", "Limón", "Granada", "Melón", "Platáno", "Guayaba"];

const listaFrutas = document.getElementById(`frutas`);

//Froma 1
/* frutas.forEach((Element) => {
    const li = document.createElement(`li`);
    li.textContent = Element
    listaFrutas.appendChild(li);
}); */

//Forma 2
frutas.forEach((el) => {
    listaFrutas.innerHTML += `<li>${el}</li>`;
})