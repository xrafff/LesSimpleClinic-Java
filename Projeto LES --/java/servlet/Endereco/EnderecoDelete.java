package servlet.Endereco;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import VO.Endereco; // corrigido para maiúsculo, conforme a classe
import DAO.EnderecoDAO;
/**
 * Servlet implementation class EnderecoDelete
 */
public class EnderecoDelete extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnderecoDelete() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String IdEndereco = request.getParameter("id");
        Endereco vo = new Endereco(); 
        vo.setIdEndereco(IdEndereco); 
        EnderecoDAO dao = new EnderecoDAO(); 
        String ret;
        try {
            dao.deleteendereco(vo,null);  
            ret = "Endereco Excluido Com Sucesso<br>";
            ret += "<a href='EnderecoList'>Voltar</a>"; 
        } catch (Exception e) {
            ret = "Erro na Exclusao<br>";
            ret += e.getMessage() + "<br>";
            ret += "<a href='EnderecoList'>Voltar</a>"; 
        }
        response.getWriter().append(ret);
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}