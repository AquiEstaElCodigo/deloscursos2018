
package matematicas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Aritmetica {
    
    
    private ImageIcon icono; 
    private String resultado = "";
    
    public Aritmetica() {

        icono = new ImageIcon
        (Aritmetica.class.getResource("/imagenes/suma.png"));  
    }
    
    public void suma() {

        JOptionPane.showMessageDialog(null, 
          "La suma es una operación básica de la aritmética \n "
          + "de los números naturales, enteros, racionales, reales \n"
          + "y complejos; por su naturalidad, que se representa con \n"
          + "el signo \"+\", el cual se combina con facilidad matemática \n"
          + "de composición en la que consiste en combinar o añadir dos \n"
          + "números o más para obtener una cantidad final o total. ", 
          "¿Qué es la suma?", JOptionPane.INFORMATION_MESSAGE, icono);

        int num = Integer.parseInt( (String) JOptionPane.showInputDialog(null, 
                "Ingrese un número: ", "Suma", JOptionPane.DEFAULT_OPTION, 
                icono, null, null));
        
        int num2 = Integer.parseInt( (String) JOptionPane.showInputDialog(null, 
                "Ingrese otro número:", "Suma", JOptionPane.DEFAULT_OPTION, 
                icono, null, null));
        
        resultado = Integer.toString( (num + num2));
        
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, 
                "Suma", JOptionPane.DEFAULT_OPTION, icono);
        
        
    }

    public static void resta() {

        
    }

    public static void multiplicacion() {

    }

    public static void division() {

    }

    public static void potencia() {

    }

    public static void raiz() {

    }

    
}
