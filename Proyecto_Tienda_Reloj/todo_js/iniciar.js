const inicio = document.getElementById("InicioSecion");

inicio.addEventListener("submit",function(event){
    event.preventDefault();

    const email = document.getElementById("Email").value.trim();
    const contra = document.getElementById("password").value.trim();

    //recordar el .lenght es para que el texto me lo tome como un listado de numeros los caracteres
    //  para hacerlo mas facil con el IF
    if (contra.length < 9) {
        alert("La contraseña es demasiado corta (mínimo 9 caracteres)");
        return;
    } else if (contra.length > 16) {
        alert("La contraseña es demasiado larga (máximo 16 caracteres)");
        return;
    }
    localStorage.getItem("logueado","true");
    setTimeout(() => {
       window.location.href="home.html";
    }, 700);
});