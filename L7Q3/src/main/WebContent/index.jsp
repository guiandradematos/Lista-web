<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formul�rio</title>
</head>
<body>
    <h2>Formul�rio</h2>
    <form action="ConcatenationServlet" method="post">
        Nome: <input type="text" name="nome" required><br>
        
        Estado Civil:
        <select name="estadoCivil" required>
            <option value="solteiro">Solteiro(a)</option>
            <option value="casado">Casado(a)</option>
            <!-- Adicione mais op��es conforme necess�rio -->
        </select><br>

        Faixa Et�ria:
        <select name="faixaEtaria" required>
            <option value="3-10">3 a 10 anos</option>
            <option value="11-25">11 a 25 anos</option>
            <option value="36-55">36 a 55 anos</option>
            <option value="56-100">56 a 100 anos</option>
        </select><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>