
package clases;


public class MetodosParaMensajes {

    //mensajes primera parte
    public String tituloDelSitio(){
        
        
        return "Ejemplo de Directiva";
    }
    
    //mensajes segunda parte
    public String mensajesOperaciones(int indice){
        
        String[] mensajes = new String[5];
        
        mensajes[0] = "Resultado suma: ";
        mensajes[1] = "Resultado resta: ";
        mensajes[2] = "Resultado división: ";
        mensajes[3] = "Resultado multiplicación: ";
        
        String salida = mensajes[indice];
        
        return salida;
    }
    
    //Mensajes formulario registro
    public String pasaTiempos(String[] selecionados){
        
        for (int i = 0; i < selecionados.length; i++) {
            
            return "" + selecionados[i];
        }
        
        return "";
        
    }
    
    
    
    
    
}
