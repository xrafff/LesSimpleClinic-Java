package servlet.paciente;

import java.io.IOException;
import DAO.PacienteDAO;
import VO.Paciente;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProdutoDelete
 */
public class PacienteDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @return 
     * @see HttpServlet#HttpServlet()
     */
    public PacienteDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("id");
		Paciente vo = new Paciente ();
		vo.setCodigo(codigo);
		PacienteDAO dao = new PacienteDAO(vo);
		String ret;
		try {
			dao.deletePaciente(vo, null);
			ret="Paciente Excluido Com Sucesso<br>";
			ret+="<a href='home'>Voltar</a>";
		} catch (Exception e){
			ret="Erro na Exclusao<br>";
			ret += e.getMessage() + "<br>";
			ret+="<a href='ProdutoList'>Voltar</a>";
		}		
		response.getWriter().append(ret);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}