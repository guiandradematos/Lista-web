<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Usu�rio</title>
</head>
<body>
    <form action="CadastroUsuarioServlet" method="post">
        <h2>Informa��es Pessoais:</h2>
        Nome: <input type="text" name="nome" required><br>
        Email: <input type="email" name="email" required><br>

        <h2>Informa��es Acad�micas:</h2>
        Curso: <input type="text" name="curso" required><br>

        <h2>Informa��es Profissionais:</h2>
        Empresa: <input type="text" name="empresa" required><br>

        <h2>Prefer�ncia de Cor:</h2>
        Cor Favorita: <input type="color" name="corFavorita" required><br>

        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
