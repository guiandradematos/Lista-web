<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formul�rio JSP</title>
</head>
<body>
    <form action="ConcatenarDadosServlet" method="post">
        Nome: <input type="text" name="nome" required><br>
        Estado Civil:
        <select name="estadoCivil">
            <option value="solteiro">Solteiro(a)</option>
            <option value="casado">Casado(a)</option>
            <!-- Adicione outras op��es de estado civil, se necess�rio -->
        </select><br>
        Faixa Et�ria:
        <select name="faixaEtaria">
            <option value="3-10">3 a 10 anos</option>
            <option value="11-25">11 a 25 anos</option>
            <option value="36-55">36 a 55 anos</option>
            <option value="56-100">56 a 100 anos</option>
        </select><br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>