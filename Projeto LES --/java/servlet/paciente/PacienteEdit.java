package servlet.paciente;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import DAO.PacienteDAO;
import VO.Paciente;

/**
 * Servlet implementation class ProdutoEdit
 */
public class PacienteEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PacienteEdit() {
        super();
        // TODO Auto-generated constructor stub
    }	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		try {
			@SuppressWarnings("unused")
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			Paciente vo = new Paciente();
			
			PacienteDAO dao = new PacienteDAO(vo);
			vo= dao.LoadPaciente();
			
			request.setAttribute("Paciente", vo);
request.getRequestDispatcher("/Paciente/Paciente.jsp").forward(request, response);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
