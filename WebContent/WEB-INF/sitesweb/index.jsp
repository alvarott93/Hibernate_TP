<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Formation</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">


  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/Hibernate_TP/addforma">Ajouter une nouvelle formation <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Hibernate_TP/listforma">Lister les formations existantes</a>
      </li>
    </ul>
    </div>
</nav>

<a href="/Hibernate_TP/addforma"> Ajouter une nouvelle formation</a>
<a href="/Hibernate_TP/listforma"> Lister les formations existantes</a>

<h3>${message}</h3>




</body>
</html>


