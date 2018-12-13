
function verArrays(){

    var ciudad = ["lima", "caracas", "Quito"];

    let resultado = "";
    for (let i = 0; i < ciudad.length; i++) {

        resultado += ciudad[i] + ", ";
        
    }
    alert(resultado);

    resultado = "";

    var dias = new Array("lunes", "martes", "miercoles");

    for (let i = 0; i < dias.length; i++) {
        
        resultado += dias[i] + ", ";
        
    }
    alert(resultado);

    let datos = [33, 200, 400, 656, 444];

    for (let index = 0; index < datos.length; index++) {
        
        console.log(datos[index]);
        
    }

    var persona = {nombre: "Richard", apellido: "Stallman", edad: "65"};

    for (let a = 0; a < persona.length; a++) {
        console.log(persona[a]);
        
    }




}
