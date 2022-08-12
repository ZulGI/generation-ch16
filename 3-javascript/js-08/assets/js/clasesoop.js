class persona{
    
    constructor(nombre, apellido){
        this._nombre = nombre; 
        this._apellido = apellido;
    }
get nombre(){
    return this.nombre;
}
set nombre(nombre){
     this.nombre = nombre;

}
}

let persona1 = new persona("jose", "Perez");
console.log(persona1);

persona1.nombre = "Hugo Sanchez";
console.log(persona1.nombre);

let persona2 = new persona("Ana", "Cruz");
console.log(persona2);






class Persona {
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre
    }
}

let persona1 = new Persona('David','Castellanos');

console.log(persona1);

persona1.nombre = 'David Guzman'

console.log(persona1.nombre);

let persona2 = new Persona ('Arturo', 'Guzman');
console.log(persona2);

//Con el guoin bajo se hace publico para poder acceder a él desde fuera
//get retorna un valor.
//set coloca un valor a un atributo.
//Se les conoce como accesores a tributos privados 
/* get  = obtiene
set = fija
get se utiliza para leer un atributo
set se utiliza para modificar el valor de un atributo
 */