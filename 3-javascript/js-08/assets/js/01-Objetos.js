/* let x = 10;
console.log(x.length); */

let persona = {
    nombre: "Zul",
    apellido: "García",
    edad: 18,
    correoElectronico: "sahiangarciaislas@gmail.com",
    /* nombreCompleto: function(){
        return this.nombre + " " + this.apellido; */
    idioma: "es",
get leng(){
            return this.idioma.toUpperCase();
        }
        set leng (lang){
            this.idioma = lang.toLowerCase()
        }
    
}

console.log(persona.leng);
persona.lang = 





/* persona.tel = "5555555555"
persona.te1 = "6666666666"

console.log(persona);
console.log(persona.nombreCompleto()); */

/************************** For **********************/
/* for (varPropiedad in persona){
    console.log(persona[varPropiedad]);
}

let personaString = JSON.stringify(persona);
console.log(personaString); */



