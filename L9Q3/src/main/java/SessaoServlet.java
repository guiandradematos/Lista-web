import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessaoServlet")
public class SessaoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obter a sessão, se existir; caso contrário, criar uma nova
        HttpSession session = request.getSession(true);

        // Obter ou gerar o ID da sessão
        String sessionId = session.getId();

        // Obter a data e hora da criação da sessão
        Date creationTime = new Date(session.getCreationTime());

        // Obter a data e hora do último acesso à sessão
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        // Incrementar o contador de sessões
        int sessionCount = 1;
        if (session.getAttribute("sessionCount") != null) {
            sessionCount = (int) session.getAttribute("sessionCount") + 1;
        }
        session.setAttribute("sessionCount", sessionCount);

        // Exibir informações da sessão
        response.getWriter().println("<h2>ID da Sessão:</h2> " + sessionId);
        response.getWriter().println("<h2>Data e Hora de Criação da Sessão:</h2> " + formatarDataHora(creationTime));
        response.getWriter().println("<h2>Data e Hora do Último Acesso à Sessão:</h2> " + formatarDataHora(lastAccessTime));

        // Mostrar mensagem após a 5ª sessão
        if (sessionCount >= 5) {
            response.getWriter().println("<h2>Mensagem após a 5ª Sessão:</h2> Você atingiu 5 sessões!");
        }
    }

    private String formatarDataHora(Date dataHora) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(dataHora);
    }
}
