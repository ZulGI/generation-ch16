/* Escriba un programa de JavaScript para construir el siguiente patrón, usando un bucle for anidado. 
 
*  
* *  
* * *  
* * * *  
* * * * * 

*/ 

/* for(let i=0; i<=5; i++){
  for(let j=0; j<i; j++){
    console.log("*");
  }
  console.log("\n");
} */

/***************** Apuntes en clase ************************/

for(let i=0; i<5; i++){
  console.log("For principal" + i);
  for(let j=0; j<10; j++){
    console.log("For interno" + j);
  }
}