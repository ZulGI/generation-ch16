const $formulario = document.getElementById('user-form');




$formulario.addEventListener('submit', (e) => {
    e.preventDefault();
    
    let nombre = document.getElementById('nombre').value;
    let correo = document.getElementById('correo').value;
    let prioridad = document.getElementById('prioridad').value;
    let password= document.getElementById('password').value;
    let password2 = document.getElementById('password2').value;
    
    if (nombre === "" && correo === "" && prioridad === "" && password === "" && password2 === "") return alert("Todos los espacios están vacíos"); 
    if (password !== password2) return console.error("Las contraseñas no coinciden"); 

    
    


    const datos = Object.fromEntries(
        new FormData(e.target)
    )

    console.log(datos);
    

    $formulario.reset();


    fetch('http://localhost:8080/usuario',  {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            nombre: datos.nombre,
            correo: datos.correo,
            prioridad: Number(datos.prioridad),
            password: datos.password
        }),
    })

        .then(resp => {
            if( resp.ok) {
                  
                  url = window.location;
                  const path = url.pathname.substring(0, url.pathname.lastIndexOf('/') + 1)
                  location.href = path +  'index.html';
            }
        })
        
        .catch((error) => {
            console.error('Error:', error);
        }); 

});
