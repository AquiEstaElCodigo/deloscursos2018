package clases;


public class MetodosParaCalular {

    //Segunda parte
    public static int sumar(int a,int b){
        
        return (a + b);
    }
    
    public static int restar(int a, int b){
        
        return (a - b);
    }
    
     public static int dividir(int a, int b){
        
        return (a / b);
    }
     
     
      public static int multiplicar(int a, int b){
        
        return (a * b);
    }
        
    //segunda parte radiobuttons y lista desplegable
      
    public static String calcularRadioButton(int a, int b, int opcion){
        
       String operacionSalida = "";
         
        switch(opcion){
            
            case 1:
                operacionSalida = Integer.toString( (a + b) );
                break;
                
            case 2:
                operacionSalida = Integer.toString( (a - b) );
                break;
            case 3:
                operacionSalida = Integer.toString( (a / b) ); 
                break;
            case 4:
                operacionSalida = Integer.toString( (a * b) );
                break;
        }
        
        return operacionSalida;
    }
    
    
    
}
