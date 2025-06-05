<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Eventos - UpoCultura</title>
        
    </head>
    <body>
        <h2>Listado de Eventos</h2>
        <%-- Mostrar botón solo si el usuario es organizador --%>
        <s:form action="crearEventoForm">
            <s:submit value="Crear nuevo evento" />
        </s:form>
        <table border="1">
            <thead>
                <tr>
                    <th>Seleccionar</th>
                    <th>Título</th>
                    <th>Descripción</th>
                    <th>Ubicación</th>
                    <th>Fecha Inicio</th>
                    <th>Fecha Fin</th>
                    <th>Plazas</th>
                </tr>
            </thead>
            <tbody>
                <s:form action="">
                <s:iterator value="listaEventos">
                        <tr>
                            <!-- Radio button para seleccionar un evento -->
                            <td><input type="radio" name="selectedEvento" value="%{id}" /></td>
                            <td><s:property value="titulo" /></td>
                            <td><s:property value="descripcion" /></td>
                            <td><s:property value="ubicacion" /></td>
                            <td><s:property value="fechaInicio" /></td>
                            <td><s:property value="fechaFin" /></td>
                            <td><s:property value="plazas" /></td>
                        </tr>
                    </s:iterator>
                </s:form>
            </tbody>
        </table>

        <br/>
        <!-- Botón para editar -->
        <s:form action="editarEvento">
            <s:hidden name="selectedEventos" />
            <s:submit value="Editar" />
        </s:form>

        <!-- Botón para eliminar -->
        <s:form action="eliminarEvento">
            <s:hidden name="selectedEventos" />
            <s:submit value="Eliminar" />
        </s:form>

        <br/>
        <s:form action="logout">
            <s:submit value="Cerrar Sesión"/>
        </s:form>
    </body>
</html>

