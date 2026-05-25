function fetchData() {

    uname = document.getElementById("uname").value
    pass = document.getElementById("pass").value

    fetch(`http://localhost:8080/DemoDecWebProject/login?user=${uname}&pass=${pass}`)
        .then(res => res.text())
        .then(data => {

            console.log(data)
            document.getElementById("main").innerHTML = data
        }
        )


}


