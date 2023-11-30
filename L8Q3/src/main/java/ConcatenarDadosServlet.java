import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConcatenarDadosServlet")
public class ConcatenarDadosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obter parâmetros do formulário
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");

        // Concatenar os dados
        String resultado = "Nome: " + nome + "<br>Estado Civil: " + estadoCivil + "<br>Faixa Etária: " + faixaEtaria;

        // Enviar a resposta de volta ao cliente (pode ser uma página JSP ou HTML)
        response.setContentType("text/html");
        response.getWriter().println("<html><body><h2>Dados Recebidos:</h2><p>" + resultado + "</p></body></html>");
    }
}