
package servlet.paciente;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import DAO.PacienteDAO;

/**
 * Servlet implementation class ProdutoFind
 */
public class PacienteFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PacienteFind() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		@SuppressWarnings("unused")
		String nome = request.getParameter("nome");
		PacienteDAO dao = new PacienteDAO();
		request.setAttribute("lista", dao.LoadPaciente());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
request.getRequestDispatcher("/produto/ProdutoList.jsp").forward(request, response);
	
	}

}
