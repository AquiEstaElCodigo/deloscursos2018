<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="clases.MetodosParaCalular" %>
<%@page  import="clases.MetodosParaMensajes" %>
<!DOCTYPE html>
<html>
    <%
       String variable1 = request.getParameter("variableA");
       String variable2 = request.getParameter("variableB"); 
       String variable3 = request.getParameter("operacion");
       
       
       
       MetodosParaMensajes mostrar = new MetodosParaMensajes();
       int a = Integer.parseInt(variable1);
       int b = Integer.parseInt(variable2);
       int c = Integer.parseInt(variable3);
       
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <!-- Primera parte-->
        <title><%= mostrar.tituloDelSitio() %></title>
    </head>
    <body>
        <h1> <%=mostrar.tituloDelSitio() %></h1>
        
        <!-- Segunda parte-->
        <ol>
            <li><%= mostrar.mensajesOperaciones(0) %> <%= MetodosParaCalular.sumar(a, b) %> </li>
            <li><%= mostrar.mensajesOperaciones(1) %> <%= MetodosParaCalular.restar(a, b) %></li>
            <li><%= mostrar.mensajesOperaciones(2) %> <%= MetodosParaCalular.dividir(a, b) %></li>
            <li><%= mostrar.mensajesOperaciones(3) %> <%= MetodosParaCalular.multiplicar(a, b) %></li>  
           
        </ol>
            <h2>Resultado (RadioButton, lista desplegable):</>
            <h3><%= MetodosParaCalular.calcularRadioButton(a, b, c) %></h3>
            
            
    </body>
</html>
