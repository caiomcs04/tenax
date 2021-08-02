function putServer(serverId) {

    let name = document.getElementById('name')
    let description = document.getElementById('description')

    console.log('id: '+serverId)
    console.log('nome: '+name.value)
    console.log('descrição: '+description.value)


    let request = new XMLHttpRequest();
    request.open("PUT", `http://localhost:8088/server`,true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(
      JSON.stringify({
        id: serverId,
        name: name.value,
        description: description.value,
      })
    );
    request.onload = function () {
        console.log(request)
      if (request.status === 200) {
        alert("Servidor Editado");
        document.location.reload();
      } else {
        alert("Servidor Já Existe");
      }
    };
    request.send();
  }