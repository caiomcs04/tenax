function listServer() {
  let contador = document.getElementById("servers");

  let request = new XMLHttpRequest();
  request.open("GET", "http://localhost:8088/server");
  request.send();

  request.onload = async function () {
    let data = JSON.parse(this.response);
    return contador.innerHTML = `Servidores cadastrados ${data.length}`
  };
}

listServer()
