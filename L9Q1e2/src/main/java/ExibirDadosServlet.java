import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExibirDadosServlet")
public class ExibirDadosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recuperar dados dos cookies
        String nome = CookieUtil.getCookieValue(request, "nome");
        String email = CookieUtil.getCookieValue(request, "email");
        String curso = CookieUtil.getCookieValue(request, "curso");
        String empresa = CookieUtil.getCookieValue(request, "empresa");
        String corFavorita = CookieUtil.getCookieValue(request, "corFavorita");

        // Exibir dados utilizando a tag <h2>
        response.getWriter().println("<h2>Informações Pessoais:</h2>");
        response.getWriter().println("Nome: " + nome + "<br>");
        response.getWriter().println("Email: " + email + "<br>");

        response.getWriter().println("<h2>Informações Acadêmicas:</h2>");
        response.getWriter().println("Curso: " + curso + "<br>");

        response.getWriter().println("<h2>Informações Profissionais:</h2>");
        response.getWriter().println("Empresa: " + empresa + "<br>");

        response.getWriter().println("<h2>Preferência de Cor:</h2>");
        response.getWriter().println("Cor Favorita: " + corFavorita + "<br>");

        // Utilizar o atributo style para alterar a cor do texto
        response.getWriter().println("<h2 style=\"color:" + corFavorita + "\">Texto com a cor da preferência</h2>");
    }
}