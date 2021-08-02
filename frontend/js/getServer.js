function getServer() {
  let table = document.getElementById("table-body");

  let request = new XMLHttpRequest();
  request.open("GET", "http://localhost:8088/server");
  request.send();

  request.onload = async function () {
    let data = JSON.parse(this.response);

    data.forEach((serve) => {
      return (table.innerHTML += `<tr>
              <th scope="row" style="width:10%">${serve.id}</th>
              <td style="width:25%">${serve.name}</td>
              <td>${serve.description}</td>
              <td>
              <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#serverEdit" onclick="handleModal('${serve.name}','${serve.id}','${serve.description}')">
                  Editar
              </button>
              </td>
              <td>
                  <button type="button" class="btn btn-danger" onclick="deleteServer(${serve.id})">
                      Deletar
                  </button>
              </td>
            </tr>`);
    });
  };
}

getServer();
