
package servlet.Endereco;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import DAO.EnderecoDAO;

/**
 * Servlet implementation class ProdutoFind
 */
public class EnderecoFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnderecoFind() {
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
		EnderecoDAO dao = new EnderecoDAO();
		request.setAttribute("lista", dao.Loadendereco());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
request.getRequestDispatcher("/produto/ProdutoList.jsp").forward(request, response);
	
	}

}
