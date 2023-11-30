import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtendo os valores dos parâmetros do formulário
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));

        // Realizando as operações matemáticas
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        // Certifique-se de não dividir por zero
        int divisao = (numero2 != 0) ? numero1 / numero2 : 0;
        int resto = (numero2 != 0) ? numero1 % numero2 : 0;

        // Exibindo os resultados
        response.getWriter().println("Número 1: " + numero1);
        response.getWriter().println("Número 2: " + numero2);
        response.getWriter().println("Soma: " + soma);
        response.getWriter().println("Subtração: " + subtracao);
        response.getWriter().println("Multiplicação: " + multiplicacao);
        response.getWriter().println("Divisão: " + divisao);
        response.getWriter().println("Resto: " + resto);
    }
}