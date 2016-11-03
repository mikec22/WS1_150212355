<%-- 
    Document   : ex4
    Created on : Sep 5, 2016, 4:30:52 PM
    Author     : a1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <input type="text" id="songTextInput" size="40" placeholder="Song name">
            <input type="button" id="addButton" value="Add Song">
        </form>
        <hr style="border-color:red" />
        <form>
            <input type="radio" name="size" value="small">Small<br>
            <input type="radio" name="size" value="Medium">Medium<br>
            <input type="radio" name="size" value="Large">Large
        </form>
        <hr style="border-color:red"/>
        <form action="">
            <label>Select your favorite car</label>
            <select name="cars">
                <option value="volvo">Volvo</option>
                <option value="Saab">Saab</option>
                <option value="fiat" selected="selected">Fiat</option>
                <option value="audi">Audi</option>
            </select>
        </form>
        <hr style="border-color:red"/>
        <form>
            <input type="checkbox" name="vehicle" value="bike"/>bicycle<br>
            <input type="checkbox" name="vehicle" value="car"/>automobile<br>
            <input type="checkbox" name="vehicle" value="bus"/>bus<br>
            
            <input type="submit" value="Submit">
        </form>
        <hr style="border-color:red"/>
    </body>
</html>
