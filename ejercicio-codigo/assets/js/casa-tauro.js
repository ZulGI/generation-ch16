

let carreritas = ['Lucia', 'Roberto','Maria', 'Jesus', 'Andrea', 'Jose'];
console.log("Clasificación actual: ", carreritas);

carreritas.splice(4, 1);
carreritas.splice(2, 0, 'Andrea');
//console.log("Clasificación actual: ", carreritas);

carreritas.splice(5, 1);
carreritas.shift();
carreritas.unshift('Lucia', 'Cristobal', 'Fernanda', 'Armando');

carreritas.unshift('Federico');
console.log("Clasificación Final: ", carreritas);
