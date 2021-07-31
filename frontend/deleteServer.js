function deleteServer(serverId) {
    let request = new XMLHttpRequest();
    request.open("DELETE", `http://localhost:8088/server/${serverId}`);
    request.onload = function () {
      if (request.status === 200) {
        alert("Servidor Deletado");
        document.location.reload();
      } else {
        alert("Servidor Não Foi Deletado");
      }
    };
    request.send();
  }