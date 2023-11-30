<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tabuada Resultado</title>
</head>
<body>

    <h2>Tabuada do Número <%= request.getParameter("numero") %>:</h2>

    <%
        // Recuperando o número da requisição
        String numeroStr = request.getParameter("numero");

        if (numeroStr != null && !numeroStr.isEmpty()) {
            try {
                // Convertendo para inteiro
                int numero = Integer.parseInt(numeroStr);

                // Exibindo a tabuada
                out.println("<table border=\"1\">");
                out.println("<tr><th>Multiplicador</th><th>Resultado</th></tr>");

                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    out.println("<tr><td>" + i + "</td><td>" + resultado + "</td></tr>");
                }

                out.println("</table>");
            } catch (NumberFormatException e) {
                out.println("<p>Por favor, insira um número válido.</p>");
            }
        } else {
            out.println("<p>Por favor, informe um número.</p>");
        }
    %>

    <br>
    <a href="index.jsp">Voltar</a>

</body>
</html>