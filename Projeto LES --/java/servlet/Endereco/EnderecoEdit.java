package servlet.Endereco;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import DAO.EnderecoDAO;
import VO.Endereco;

/**
 * Servlet implementation class ProdutoEdit
 */
public class EnderecoEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnderecoEdit() {
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
			Endereco vo = new Endereco();
			
			EnderecoDAO dao = new EnderecoDAO(vo);
			vo= dao.Loadendereco();
			
			request.setAttribute("endereco", vo);
			request.getRequestDispatcher("/endereco/endereco.jsp").forward(request, response);
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
