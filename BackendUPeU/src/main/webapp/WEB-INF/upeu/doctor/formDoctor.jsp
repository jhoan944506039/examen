<%-- 
    Document   : formPeriodo
    Created on : 23-jun-2015, 10:23:00
    Author     : SistemasUpeu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>        
    </head>
    <body>
        <div>
            <c:url var="savedoctor"  value="guardarDoctor" />
            <fm:form modelAttribute="modeloDiente" method="post" action="${savedoctor}">
                <table>
                    <tr>
                        <td><label path="imagen"># colegiatura</label> </td>
                        <td><input  type="text" path="imagen" /></td>
                    </tr>
                    <tr>
                        <td><label path="imagen">Fecha Ing</label> </td>
                        <td><input  type="text" path="imagen" /></td>
                    </tr>
                    
                    <tr>
                        <td><label path="imagen">Estado</label> </td>
                        <td><input  type="text" path="imagen" /></td>
                    </tr>                                     
                    <tr>
                        <td><label path="imagen">Nombre</label> </td>
                        <td><input  type="text" path="imagen" /></td>
                            
                    </tr>
                    
                        <label path="imagen">Apellidos</label> </td>
                        <td><input  type="text" path="imagen" /></td>
                    </tr>
                    
                    </td>
                        <label path="imagen">DNI</label> </td>
                        <td><input  type="text" path="imagen" /></td>
                    </tr>
                    <tr>                        
                        <td colspan="2"><input type="submit" value="Enviar" > </td>
                    </tr>
                </table>                
            </form>         
        </div>
    </body>
