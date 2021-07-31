function postServer(){
    let request = new XMLHttpRequest();
    request.open("POST", "http://localhost:8088/server");
    request.send(JSON.stringify({
        name: "teste do js",
        description: "vamo que vamo"
    }));

    console.log(request)
}
