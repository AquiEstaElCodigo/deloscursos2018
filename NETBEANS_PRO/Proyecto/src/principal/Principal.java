
package principal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import matematicas.Aritmetica;

public class Principal 
{
    
    private ImageIcon icono, login; 
    private Aritmetica ejecutar;
    
    public Principal() {

        ejecutar = new Aritmetica();
        icono = new ImageIcon (Principal.class.getResource("/imagenes/logo.png")); 
         login = new ImageIcon
        (Principal.class.getResource("/imagenes/login.png")); 
        
    }

    public static void main(String[] args) {
        Principal ver = new Principal();

        ver.menuPrincipal();

    }

    public void menuPrincipal(){

        
        JOptionPane.showInputDialog(null, "Ingrese usuario:", 
                "Acceso de Usuarios", JOptionPane.DEFAULT_OPTION, login, null, null);
        
          JOptionPane.showInputDialog(null, "Ingrese contraseña:", 
                "Acceso de Usuarios", JOptionPane.DEFAULT_OPTION, login, null, null);
        
        
        
        int opcion = Integer.parseInt((String) JOptionPane.showInputDialog(null, 
        "--------------- BIENVENIDO --------------- \n"
                + "SELECCIONE ALGUNA DE LAS SIGUIENTES OPCIONES: \n"
                + "1.- Suma.\n"
                + "2.- Resta.\n"
                + "3.- Multiplicación.\n"
                + "4.- División.\n"
                + "5.- Raíz cuadrada.\n"
                + "6.- Potencia.\n"
                + "7.- Interes simple.\n"
                + "8.- Sumatoira. \n"
                + "9.- Jugar.\n"
                + "10].- Salir.\n", "Menú de opciones", JOptionPane.DEFAULT_OPTION,
                icono, null, null));
        
   
        switch(opcion){
            
            case 1:
                ejecutar.suma();
                break;
            default:
                System.out.println("Incorrecto");
        }
        
        
    }//.
    
    
}
