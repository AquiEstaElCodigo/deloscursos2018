
function mostrarAlerta(){

    alert("Hola Mundo!!");


}

//Ejercicios switch
function mostrarEjercicio1(){

   var dia = parseInt(prompt("ingrese un número"));

    switch(dia){
        case 1:
        alert("lunes");
        break;
        case 2:
        alert("martes");
        break;
        case 3:
        alert("miercoles");
        break;
        case 4:
        alert("jueves");
        break;
        case 5:
        alert("viernes");
        break;
        default:
        alert("numero incorrecto!");

    }

}

function mostrarImagen(){

    var len = prompt("ingrese un lenguaje de programación:");

    switch(len){

        case "java":
            
        break;
        case "cplus":
            
        break;
        case "js":
            location.href="https://i.blogs.es/544e7d/650_1000_javascript_logo/450_1000.png";
        break;
        default:
        alert("lenguaje no válido");


    }
}


//Ejercicios while

function e_while_1(){

    var i = 0;
    var mensaje  = ""; 
    
    while(i < 10){
        mensaje = mensaje + i + "<br>";
        i++;
    }    
    document.getElementById("eje1").innerHTML = mensaje;

}