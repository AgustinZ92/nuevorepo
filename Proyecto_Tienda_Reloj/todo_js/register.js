const registrar = document.getElementById("Registrar");

registrar.addEventListener("submit",function(event){
    event.preventDefault();

    const nombre=document.getElementById("nombre").value;
    const apellido=document.getElementById("apellido").value;
    const edad=document.getElementById("edad").value;
    const email=document.getElementById("email").value;
    const contraseña=document.getElementById("contraseña").value;
    const repetir=document.getElementById("repetir").value;

    let valor =true;
    
    if(edad<18){
        alert("Tenes que ser mayor de edad");
        return;
    }else if(edad>150){
            alert("Una edad muy exagerada");
            return;
    }
    
    }
    if(repetir!=contraseña){
        repetir.ClasList.add("error");
        return;
    }
    const datos= {
        nombre: nombre,
        apellido: apellido,
        edad:edad,
        email: email,
        contraseña: contraseña,
        repetir: repetir
    };

    console.log("Prueba de datos:",datos);
});