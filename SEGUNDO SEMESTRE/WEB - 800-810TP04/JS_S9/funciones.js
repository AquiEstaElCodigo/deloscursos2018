
function ejercicio1(){

    var resultado = "";
    var i;
    for(i = 0; i < 11; i++){

        resultado += "<td>" + i + "</td>";
    }

    document.getElementById("e1").innerHTML = resultado;
}

function ejercicio5(){

    var resultado = "";

    for (let i = 0; i < 11; i++) {
        
        resultado += "<td><img src='https://static.getjar.com/icon-50x50/73/945954_thm.png'></td>"; 
    }

    document.getElementById("e5").innerHTML = resultado;

}
