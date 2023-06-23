package servlet.paciente;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import DAO.PacienteDAO;
import VO.Paciente;
/**
 * Servlet implementation class ProdutoSave
 */
public class PacienteSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PacienteSave() {
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
		Paciente c=new Paciente();
		String nome = request.getParameter("nome");
		String telefone= request.getParameter("21938712983");
		@SuppressWarnings("unused")
		float preco = Float.parseFloat(request.getParameter("preco"));
		String codigo = request.getParameter("codigo");		 
		c.setTelefone(telefone);
		c.setNome(nome);
		PacienteDAO dao= new PacienteDAO();
		String ret;
		try {
		    if(codigo=="" || codigo==null) {
			    ret="Produto Incluído com Sucesso";
	            dao.newPaciente(c);
	        }else {
	        	ret="Produto Alterado com Sucesso";
	            c.setCodigo(codigo);
	          
	        }
			ret+="<a href='ProdutoList'>Voltar</a>";
		} catch (Exception e){
			ret="Erro na Inclusão<br>";
			ret += e.getMessage() + "<br>";
			ret+="<a href='ProdutoList'>Voltar</a>";
		}		
		response.getWriter().append(ret);
	}

}
