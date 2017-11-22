<%-- 
    Document   : index
    Created on : 22/11/2017, 12:45:30 AM
    Author     : samue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>BallonBases</title>
<link href="styletorneo.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">BallonBases </a></h1>			
		</div>
		
	</div>
	<!-- end #header -->
	<div id="menu">
		<ul>
			<li ><a href="#">Inicio</a></li>
			<li class="current_page_item"><a href="#">Torneos</a></li>
			<li><a href="#">Equipos</a></li>
			<li><a href="#">Jugador</a></li>
			<li><a href="#"></a></li>
		</ul>
      
            <br>
    <br>
    <br>
    <br>
    <br>
   
    <br>
    <br>
    
    
    <div id="all">
    
    <div id="agregarT">
<h3>Agregar un torneo</h3>

<div>
  <form action="/action_page.php">
    <label for="fname">Nombre torneo</label>
    <input type="text" id="name" name="name" >

    <label for="lname">Lugar </label>
    <input type="text" id="lugar" name="lugar" >

    <label for="ficture">Fixture</label>
    <select id="fixture" name="fxcture">
      <option value="Todos contra todos">Todos contra todos</option>
      <option value="Elimincacion directa">Eliminación directa</option>
    </select>
    
    <label for="ficture">Categoria</label>
    <select id="Categoria" name="Categoria">
      <option value="Masculino 20años">Masculino 20años</option>
      <option value="Femenino 20años">Femenino 20años</option>
      <option value="Masculino 15años">Masculino 15años</option>
    </select>
    <input type="submit" value="Submit">
  </form>
</div>
 </div>
<br>
<br>
<br>



     <div class="field" id="searchform">
     <input type="text" id="searchterm" placeholder="Busca un jugador " />
     <button type="button" id="search"> Buscar </button>
     </div>
           

<br>
<br>
<br>
<br>

<table>
  <tr>
    <th>Nombre</th>
    <th>Lugar</th>
    <th>Fixture</th>
    <th>Categoria</th>
  </tr>
  <tr>
    <td>Alfreds Futterkiste</td>
    <td>Maria Anders</td>
    <td>Germany</td>
    <td>Italy</td>
  </tr>
  <tr>
    <td>Centro comercial Moctezuma</td>
    <td>Francisco Chang</td>
    <td>Mexico</td>
    <td>Italy</td>
  </tr>
  <tr>
    <td>Ernst Handel</td>
    <td>Roland Mendel</td>
    <td>Austria</td>
    <td>Italy</td>
  </tr>
  <tr>
    <td>Island Trading</td>
    <td>Helen Bennett</td>
    <td>UK</td>
    <td>Italy</td>
  </tr>
  <tr>
    <td>Laughing Bacchus Winecellars</td>
    <td>Yoshi Tannamuri</td>
    <td>Canada</td>
    <td>Italy</td>
  </tr>
  <tr>
    <td>Magazzini Alimentari Riuniti</td>
    <td>Giovanni Rovelli</td>
    <td>Italy</td>
    <td>Italy</td>
  </tr>
</table>




    </div>


<script class="cssdeck" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>



	


</body>
</html>