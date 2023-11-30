import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConcatenationServlet")
public class ConcatenationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");

        
        String resultado = "Nome: " + nome + "<br>Estado Civil: " + estadoCivil + "<br>Faixa Etária: " + faixaEtaria;

        
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(resultado);
    }
}