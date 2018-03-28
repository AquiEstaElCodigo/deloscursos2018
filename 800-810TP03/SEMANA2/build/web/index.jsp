
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="clases.MetodosParaMensajes" %>
<!DOCTYPE html>
<html>
     <% MetodosParaMensajes mostrar = new MetodosParaMensajes(); %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=mostrar.tituloDelSitio()%></title>
    </head>
    <body>
        <h1> <%=mostrar.tituloDelSitio() %></h1>
        
        <p><%=mostrar.tituloDelSitio() %></p>
        
        <img 
        src="https://upload.wikimedia.org/wikipedia/commons/e/ef/Netbeans-Duke.png" 
        heigh="350" width="400" alt="<%=mostrar.tituloDelSitio() %>"/>
        
        <table border="1">
            <tr>
                <td>Mensaje:</td>
                <td><%=mostrar.tituloDelSitio() %></td>
                <td>...en JSP</td>
            <tr>
        </table>
        <!-- 
        <h2>Calculadora básica</h2>
        -->        
        
        <h2>Registro de usuarios</h2>
        <form action="recibe2.jsp" method="get">
            <div>
                <label>Nombre: </label>
                <input type="text" name="variableA"><br>
                <label>Apellido: </label>
                <input type="text" name="variableB"><br>
                <!-- Segunda parte RADIO BUTTON
                <input type="radio" id="operacion" name="operacion" value="1">
                <label for="operacion">Sumar</label><br> 

                <input type="radio" id="operacion" name="operacion" value="2">
                <label for="operacion">Restar</label><br> 
                
                <input type="radio" id="operacion" name="operacion" value="3">
                <label for="operacion">Dividir</label><br> 
                
                <input type="radio" id="operacion" name="operacion" value="4">
                <label for="operacion">Multiplicar</label><br> 

                -->
                
                 <!-- Tercera parte LISTA DESPLEGABLE
                
                 <select name="operacion">
                     <option value="1">Sumar</option>
                     <option value="2">Restar</option>
                     <option value="3">Dividir</option>
                     <option value="4">Multiplicar</option>
                 </select>
                -->
                 
                 <!-- Cuarta parte LISTA DESPLEGABLE 
                  <select name="operacion" size="4">
                     <option value="1">Sumar</option>
                     <option value="2">Restar</option>
                     <option value="3">Dividir</option>
                     <option value="4">Multiplicar</option>
                 </select>
                
                <br><button type="submit" >Calcular</button>
                 --> 
                 <!--  ============= FIN CALCULADORA ============= -->
                 
                 <!--  ========== EJEMPLO REGISTRO USUARIOS ========== -->
                 
                 <label>edad: </label>
                <input type="text" name="variableC"><br>
                 <label>email: </label>
                <input type="text" name="variableD"><br>
                 
                 
                 <label>Pasatiempos:</label><br>
                 <label><input type="checkbox" id="chk1" name="pasatiempo" value="1">Anime</label><br>
                 <label><input type="checkbox" id="chk2" name="pasatiempo" value="2">Video Juegos</label><br>
                 <label><input type="checkbox" id="chk3" name="pasatiempo" value="3">Leer</label><br>
                 <label><input type="checkbox" id="chk4" name="pasatiempo" value="4">Escribir</label><br>
                 <label><input type="checkbox" id="chk5" name="pasatiempo" value="5">Ver televisión</label><br>
                 <label><input type="checkbox" id="chk6" name="pasatiempo" value="6">Deportes</label><br>
                 <label><input type="checkbox" id="chk7" name="pasatiempo" value="7">Dormir</label><br>
                 
                 <br><button type="submit" >Aceptar</button>
                 
            </div>
        </form>
        
    </body>
</html>
