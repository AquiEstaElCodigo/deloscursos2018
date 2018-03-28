<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="clases.MetodosParaMensajes" %>
<!DOCTYPE html>
<html>
    <%
        String variable1 = request.getParameter("variableA");
        String variable2 = request.getParameter("variableB"); 
        String variable3 = request.getParameter("variableC"); 
        String variable4 = request.getParameter("variableD"); 
        String [] pasatiempos = request.getParameterValues("pasatiempo");
        
        MetodosParaMensajes mostrar = new MetodosParaMensajes();
   
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=mostrar.tituloDelSitio()%></title>
    </head>
    <body>
        <!-- EJERCICIO FORMULARIO DE REGISTRO -->
        
        <h1> <%=mostrar.tituloDelSitio() %></h1>
        <h2>Datos Recibidos</h2>
        <ul>
        <%
        out.println("<li>" +variable1+"</li>"); 
        out.println("<li>" +variable2+"</li>"); 
        out.println("<li>" +variable3+"</li>"); 
        out.println("<li>" +variable4+"</li>"); 
        
        for(int i = 0; i < pasatiempos.length; i++){
            out.println("<li>" +pasatiempos[i]+"</li>"); 
        }
        
        
        
        
        %>
        </ul>
        <p><%=mostrar.pasaTiempos(pasatiempos) %></p>
        
        
    </body>
</html>
