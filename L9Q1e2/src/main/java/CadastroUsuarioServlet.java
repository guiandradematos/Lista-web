import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroUsuarioServlet")
public class CadastroUsuarioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recuperar parâmetros do formulário
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String curso = request.getParameter("curso");
        String empresa = request.getParameter("empresa");
        String corFavorita = request.getParameter("corFavorita");

        // Salvar dados no cookie
        CookieUtil.setCookie(response, "nome", nome);
        CookieUtil.setCookie(response, "email", email);
        CookieUtil.setCookie(response, "curso", curso);
        CookieUtil.setCookie(response, "empresa", empresa);
        CookieUtil.setCookie(response, "corFavorita", corFavorita);

        // Redirecionar para a página de exibição dos dados
        response.sendRedirect("ExibirDadosServlet");
    }
}