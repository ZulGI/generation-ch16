//console.log(document.);

/******************* getElementById() **********************/
//El método getElementById () devuelve el elemento que tiene el atributo ID con el valor especificado.

//console.log(document.getElementById("parrafo1").textContent);

console.log(document.getElementById("parrafo1"));

const parrafo1 = document.getElementById("parrafo1");

console.log(parrafo1.textContent);

parrafo1.textContent = "Hola desde el párrafo 1";

console.log(parrafo1.textContent);

console.log(parrafo1.style);

parrafo1.style.color = "red";
parrafo1.style.backgroundColor = "yellow";

/******************** querySelector() **********************/
//etiqueta = p
//clase = .parrafo
//id = #parrafo

const parrafo2 = document.querySelector(".parrafo");
console.log(parrafo2.textContent);

parrafo2.textContent += " \n Modificando contenido desde JavaScript";

//\n -- inserta un salto de línea === <br>
//también son expresiones regulares llamados caracteres de escape
//Estan más hechos para representarse en consola.

/**************** querySelectorAll() ***********************/
//Nos regres una lista de nodos (nodelist)

const parrafos = document.querySelectorAll("p");
console.log(parrafos[2]);

parrafos[2].style.fontSize = "2rem";

//Css - font-size
//js - fontSize - lower camel case

//Modificar los atributos de HTML 
const enlace = document.getElementById("enlace");
console.log(enlace.href);

enlace.href = "https://www.youtube.com/";
enlace.target = "_blank";
enlace.textContent = "Enlace de Youtube"

/******************** Remplazar contenido *****************/

const parrafo4 = document.getElementById("parrafo4");

console.log(parrafo4.nodeName);
console.log(parrafo4.textContent);
console.log(document.body.innerHTML);//muestra el HTML que haya en el interior de el elemento.
console.log(parrafo4.outerHTML);//Este nos muestra todo el contenido hTML, incluyendo al elemento.

//parrafo4.outerHTML = `<a href="http://google.com">Enlace</a>`; remplaza el elemento completo

//parrafo4.innerHTML = `<a href="http://google.com">Enlace</a>`; reemplaza el contenido del elemento. 

//parrafo4.outerHTML = `<div class="elemento">Este es un div</div>`;

//js permite modificar las clases css
//utilizando style
//usando classlist

console.log(parrafo4.classList.contains("elemento"));
parrafo4.classList.add(`elemento`)

const cambiarColor = () => {
    parrafo4.classList.toggle(`elemento`)
}

cambiarColor();//Se agrega la clase, con toggle
cambiarColor();//Se quita la clase