const palindromo = require(`../js/palindromo.js`);

describe(`Pruebas de la función palindromo`, () => {

    test(`debe regresar "Es un palindromo" si ingresamos ojo`, () => {
        let mensaje = `Es un palindromo`;
        let palabra = `ojo`;

        expect( palindromo(palabra) ).toBe(mensaje);
    })
    test(`No debe regresar "Es es un palindromo" al regresar generation`, () => {
        let mensaje = `Es un palindromo`;
        let palabra = `generation`;

        expect( palindromo(palabra) ).not.toBe(mensaje)
    })

    test(`al ingresar un número dee regresar el mensaje`, () => {
        let mensaje = `No es una palabra`;
        let valor = 2;

        expect( palindromo(valor) ).toBe(mensaje);q
    })

});