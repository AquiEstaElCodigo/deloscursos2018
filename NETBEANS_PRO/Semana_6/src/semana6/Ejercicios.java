
package semana6;

import javax.swing.JOptionPane;


public class Ejercicios {
    
    
    public void ejemplo1(){
        
        int i = 0;
        
        do {
            
            JOptionPane.showMessageDialog(null, i);
            i++;
            
        } while (i < 3);
        
        
    }
    
    public void ejemplo2()
    {
        
        int i = 0;
        String resultado = "";
        do {
            
           resultado += i + "\t";
           i++;
            
        } while (i < 10);
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
      
    public void ejemploID()
    {
        
       String mensaje = JOptionPane.showInputDialog(null, "Ingrese un texto:");
       
       JOptionPane.showMessageDialog(null, mensaje);
        
    }
       
       
    
    
}
