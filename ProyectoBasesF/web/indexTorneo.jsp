<!DOCTYPE html5>

<html>
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Equipos</title>
<link href="styletorneo.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="wrapper">
<div id="header">
<div id="logo">
<h1><a href="#">BallonBases</a></h1>			
</div>
<div id="search">
<form method="get" action="">
<fieldset>
<input type="submit" id="search-submit" value="GO" />
</fieldset>
</form>
</div>
</div>
<!-- end #header -->
<div id="menu">
<ul>
<li><a href="index.jsp">Inicio</a></li>
<li class="current_page_item"><a href="indexTorneo.jsp">Torneos</a></li>
<li ><a href="#">Equipos</a></li>
<li><a href="#">Jugadores</a></li>

</ul>
</div>
<!-- end #menu -->
<div id="page">
<div id="page-bgtop">
<div id="page-bgbtm">
<div id="content">
<div class="post">
<h2 class="title"><a href="#">Creador de torneos</a></h2>
<div class="entry">							
<p>
En esta pesta�a podras crear un nuevo torneo con tan solo introducir algunos datos y asi poder empezar a disfrutar de la competencia sana en el maravilloso mundo del baloncesto.
</p>
</div>
</div>
<div class="post">
<h2 class="title"><a href="#"> Crear un torneo nuevo </a></h2>

<div class="entry">
<p><class= " alignleft border" />             
<form action=Hola>
Nombre del torneo:<br>
<input type="text" id="tnombre" name="torneonombre" placeholder="Ingresar nombre torneo">
<br><br>
Lugar:<br>
<input type="text" id="tlugar" name="torneolugar" placeholder="Ingrese el lugar ">
<br><br>
Fixture:<br>
<select name="Fixture">
<option value="1">Todos contra todos</option>
<option value="2">Eliminacion directa</option>

</select><br><br>


Categoria:<br>
<select name="Torneo">
<option value="1">Masculino/20</option>
<option value="2">Femenino/20</option>
<option value="3">Masculino/15</option>

</select><br><br>
<button class="button">Crear torneo</button>
</form> 
</div>
</div>


<div class="post">

<h2 class="title"><a href="#">Lista de torneos</a></h2>
<div class="entry">
<p><class=" alignleft border" />


<table style="width:170%">
<tr>
    <th>Nombre Torneo</th>
    <th>Lugar</th> 
    <th>Fixture</th>
    <th>Categoria</th>
  </tr>
  <tr>
    <td>null</td>
    <td>null</td>
    <td>null</td>
    <td>null</td>
  </tr>
  
</table> </p>
</div>
</div>
<div style="clear: both;">&nbsp;</div>
</div>
<!-- end #content -->
<div id="sidebar">
<ul>

<li>
<IMG SRC="images/baloncesto1.gif">
</li>

</ul>
</div>
<!-- end #sidebar -->
<div style="clear: both;">&nbsp;</div>
</div>
</div>
</div>
<!-- end #page -->
</div>
<div id="footer">

</div>
<!-- end #footer -->
</body>
</html>
