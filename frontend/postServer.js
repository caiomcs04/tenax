function postServer() {
  let request = new XMLHttpRequest();
  let  name = document.getElementById('name');
  let description = document.getElementById("description")

  request.open("POST", "http://localhost:8088/server", true);
  request.setRequestHeader("Content-type", "application/json");
  request.send(
    JSON.stringify({
      name: name.value,
      description: description.value,
    })
  );
  console.log(request)
  request.onload = function () {
    console.log(request.responseText.includes("already exist"))

      if(request.status === 200){
          alert("Servidor cadastrado")
          window.location.replace("/index.html");
      }else if(request.responseText.includes("already exist")){
          alert("Servidor já existe. Favor cadastrar outro Servidor")
      }else{
        alert("Servidor não cadastrado")
      }
      console.log(request)

  };
}
