import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VerificarPalindromoServlet")
public class VerificarPalindromoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obter parâmetros do formulário via POST
        String entrada = request.getParameter("entrada");

        // Verificar se a entrada é um palíndromo
        boolean ehPalindromo = verificarPalindromo(entrada);

        // Exibir resultado
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Verificar Palíndromo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Resultado:</h2>");
        out.println("Entrada: " + entrada + "<br>");
        out.println("É Palíndromo? " + (ehPalindromo ? "Sim" : "Não") + "<br>");
        out.println("</body>");
        out.println("</html>");
    }

    private boolean verificarPalindromo(String entrada) {
        String entradaFormatada = entrada.replaceAll("\\s", "").toLowerCase();
        int comprimento = entradaFormatada.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (entradaFormatada.charAt(i) != entradaFormatada.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}