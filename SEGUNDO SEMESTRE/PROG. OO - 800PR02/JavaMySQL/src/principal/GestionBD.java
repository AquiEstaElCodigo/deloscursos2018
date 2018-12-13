
package principal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class GestionBD {
    

    String nombreBD = "empresa";
      
    String url = "jdbc:mysql://localhost:8889/"+nombreBD;
    
    String driver = "com.mysql.jdbc.Driver";
    
    String user = "adminempresa";
    
    String pass = "passempresa";
    
    Connection conexion = null;
    
    Statement sentencia = null;
    
    
    public void conectar(){
        
        try{
            
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            
            System.out.println("Conectados!!");
            
            conexion.close();
            
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Error: " + e);
            
        }    
        
    }//.
    
    public void insertarDatos(){
        
        
        try{
        
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            
            sentencia = conexion.createStatement();
            
            String sql = "INSERT INTO cliente(NOMBRE, APELLIDO, EDAD) " +
                    "VALUES('Richard','Stallman','70')";
            
            sentencia.executeUpdate(sql);
            
            System.out.println("Datos ingresados!!");
            
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Error: " + e.getMessage());
        }
          
    }//.
    
    
    ResultSet resultados;
    
    public void mostrarDatos(){
        
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            sentencia = conexion.createStatement();
            
            String sql = "SELECT * FROM cliente";
            resultados = sentencia.executeQuery(sql);
            
            while(resultados.next()){
                
                int id = resultados.getInt("ID");
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int edad = resultados.getInt("edad");
                
                System.out.println("ID: " + id + 
                        "\nNOMBRE: " + nombre + 
                        "\nAPELLIDO: " + apellido +
                        "\nEDAD: " + edad);
                
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }//.
    
   
    /*
     * 
     * 
     * 
     *       -----           SEGUNDA PARTE CON GUI          -----
     * 
     * 
     *
     */
    
    
     public void insertarDatosII(String nombre, String apellido, int edad){
        
        
        try{
        
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            
            sentencia = conexion.createStatement();
            
            String sql = "INSERT INTO cliente(NOMBRE, APELLIDO, EDAD) " +
                    "VALUES('"+nombre+"','"+apellido+"','"+edad+"')";
            
            sentencia.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Datos ingresados!!");
            
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Error: " + e.getMessage());
        }
          
    }//.
    
     
     public void verDatosII(JTable tablaClientes){
         
           try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            sentencia = conexion.createStatement();
            
            String sql = "SELECT * FROM cliente";
            resultados = sentencia.executeQuery(sql);
            
            int fila = 0;
            
            while(resultados.next()){
                
                tablaClientes.setValueAt(resultados.getInt("id"), fila, 0 );
                tablaClientes.setValueAt(resultados.getString("nombre"), fila, 1);
                tablaClientes.setValueAt(resultados.getString("apellido"), fila, 2);
                tablaClientes.setValueAt(resultados.getInt("edad"), fila, 3 );
                
               fila++;
                
            }
            
            resultados.close();
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Error: " + e.getMessage());
        }
         
         
         
     }//.
     
     
     
    
}
