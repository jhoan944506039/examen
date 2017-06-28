 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>AngularJS MVC Spring UPeU</title>  
    <style>
      .username.ng-valid {
          background-color: lightgreen;
      }
      .username.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .username.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

      .email.ng-valid {
          background-color: lightgreen;
      }
      .email.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .email.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }

    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  </head>
  <body  class="ng-cloak">
      <div class="generic-container" ng-controller="UserController as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">User Registration Form </span></div>
              <div class="formcontainer">
                  
                  
                          
        <c:out value="${mensaje}"/>       
        <h1>Administracion de Personas!</h1>

        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarPersona"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
        Periodo <input type="text" class="myinput" id="dato" size="50" name="dato"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        <td>
            <input  type="button" value="Nuevo" onclick="document.location.href='/BackendUPeU/formPersona'" class="btn btn-success" >&nbsp;   
        </td>
        </tr>
        </table>
        </form>
        </div> 
            </div>
          </div>
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">List of Users </span></div>
              <div class="tablecontainer">
                          <c:if test="${!empty ListaPersona}">
                            <table border="1">
                                <tr>
                                    <th>idPersona</th>
                                    <th>Nombre</th>
                                    <th>ApellPater</th>
                                    <th>ApellidoMater</th>
                                    <th>Dni</th>
                                    <th>Direccion</th>
                                    <th>Telefono</th>
                                    <th>FechaNacimiento</th>
                                    <th>Usuario</th>
                                    <th>Password</th>
                                </tr>
                <c:forEach items="${listaPersona}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.Persona.id}"/></td>
                    <td><c:out value="${dato.Persona.nombres}"/></td>                                    
                    <td><c:out value="${dato.Persona.apellPaterno}"/> 
                        <c:out value="${dato.Persona.apellMater}"/></td>
                    <td><c:out value="${dato.Persona.Dni}"/></td>
                    <td><c:out value="${dato.Persona.Direccion}"/></td>
                    <td><c:out value="${dato.Persona.Telefono}"/></td>
                    <td><c:out value="${dato.Persona.FechaNacimiento}"/></td>
                    <td><c:out value="${dato.Persona.Usuario}"/></td>
                    <td><c:out value="${dato.Persona.Password}"/></td>
                    <td>
                        <a href="eliminarPersona?id=${dato.Persona}">Eliminar</a>&emsp14;                                        
                    </td>
                </tr>
                </c:forEach>
                            </table>
                            <th>
                            Holasss
                        </c:if>
              </div>
          </div>
      </div>

  </body>
</html>