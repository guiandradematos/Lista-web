import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VerificadorPalindromo")
public class VerificadorPalindromo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String palavra = request.getParameter("palavra");

        if (ehPalindromo(palavra)) {
            request.setAttribute("resultado", "A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            request.setAttribute("resultado", "A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        request.getRequestDispatcher("resposta.jsp").forward(request, response);
    }

    private boolean ehPalindromo(String palavra) {
       
        String reverso = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(reverso);
    }
}