<!DOCTYPE html>
<html>
<head>
    <title>Resposta - Verificador de Pal�ndromo</title>
</head>
<body>
    <h1>Resultado</h1>
    <%
        
        String palavra = request.getParameter("palavra");

        
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        
        boolean ehPalindromo = true;
        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }
    %>
    <p>A palavra <%= palavra %> <%= ehPalindromo ? "�" : "n�o �" %> um pal�ndromo.</p>
</body>
</html>