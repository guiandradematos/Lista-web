import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcularIdadeServlet")
public class CalcularIdadeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Configurar o encoding para lidar com caracteres especiais
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Obter parâmetros do formulário via GET
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String fezAniversario = request.getParameter("fezAniversario");

        // Calcular a idade atual
        int idadeAtual = calcularIdade(anoNascimento, fezAniversario);

        // Exibir resultado
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Idade Atual</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Resultado:</h2>");
        out.println("Ano de Nascimento: " + anoNascimento + "<br>");
        out.println("Fez Aniversário Este Ano: " + fezAniversario + "<br>");
        out.println("Idade Atual: " + idadeAtual + " anos<br>");
        out.println("</body>");
        out.println("</html>");
    }

    private int calcularIdade(int anoNascimento, String fezAniversario) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        if ("nao".equals(fezAniversario)) {
            return anoAtual - anoNascimento - 1;
        } else {
            return anoAtual - anoNascimento;
        }
    }
}