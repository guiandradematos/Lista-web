import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int num3 = Integer.parseInt(request.getParameter("num3"));

      
        int soma = num1 + num2 + num3;
        int subtracao = num1 - num2 - num3;
        int multiplicacao = num1 * num2 * num3;

        
        int divisao = (num2 != 0 && num3 != 0) ? num1 / num2 / num3 : 0;

        
        int restoDivisaoInteira = (num2 != 0 && num3 != 0) ? num1 % num2 % num3 : 0;

        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Resultado</title></head><body>");
        out.println("<h2>Números Recebidos:</h2>");
        out.println("<p>Número 1: " + num1 + "</p>");
        out.println("<p>Número 2: " + num2 + "</p>");
        out.println("<p>Número 3: " + num3 + "</p>");

        out.println("<h2>Resultados das Operações:</h2>");
        out.println("<p>Soma: " + soma + "</p>");
        out.println("<p>Subtração: " + subtracao + "</p>");
        out.println("<p>Multiplicação: " + multiplicacao + "</p>");
        out.println("<p>Divisão: " + divisao + "</p>");
        out.println("<p>Resto da Divisão Inteira: " + restoDivisaoInteira + "</p>");

        out.println("</body></html>");
    }
}