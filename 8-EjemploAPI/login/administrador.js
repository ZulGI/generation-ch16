const $loadUsers = document.querySelector("#loadUsers");

$loadUsers.addEventListener("click", () => {
  const token = localStorage.getItem("token") || null;

  fetch("http://localhost:8080/usuario", {
    method: "GET",
    headers: {
      "Content-type": "application/json",
      Authorization: token,
    },
  })
    .then((resp) => {
        console.log(resp);
      if (resp.status == 403) {
        localStorage.removeItem("token");
        url = window.location;
        const path = url.pathname.substring(
          0,
          url.pathname.lastIndexOf("/") + 1
        );
        location.href = path + "index.html";
      }

      return resp.json();
    })
    .then((usuarios) => {
        
      usuarios.forEach((el) => {
        if (el === null) {
          el = "";
        } else {
          const productList = document.getElementById("tabla");
          const element = document.createElement("tr");
          element.innerHTML = `
                <tr>
                <td>${el.id}</td>
                <td>${el.nombre}</td>
                <td>${el.correo}</td>
                <td>${el.prioridad}</td>
    
               
              `;
          productList.appendChild(element);
        }
      });
    });
});
