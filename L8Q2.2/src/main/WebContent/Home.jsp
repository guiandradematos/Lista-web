<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calcular Idade</title>
</head>
<body>
    <form action="CalcularIdadeServlet" method="get">
        Digite o ano de nascimento: <input type="text" name="anoNascimento" required><br>
        A pessoa j� fez anivers�rio este ano?
        <input type="radio" name="fezAniversario" value="sim" checked>Sim
        <input type="radio" name="fezAniversario" value="nao">N�o<br>
        <input type="submit" value="Calcular Idade">
    </form>
</body>
</html>