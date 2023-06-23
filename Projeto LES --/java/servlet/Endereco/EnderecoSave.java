package servlet.Endereco;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import DAO.EnderecoDAO;
import VO.Endereco;
/**
 * Servlet implementation class EnderecoSave
 */
public class EnderecoSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnderecoSave() {
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
		Endereco c=new Endereco();
				
			String Logradouro = request.getParameter("logradouro");
			int Numero = Integer.parseInt(request.getParameter("numero"));
			String Complemento = request.getParameter("complemento");
			String Bairro = request.getParameter("bairro");
			String Cidade = request.getParameter("cidade");
			String Estado = request.getParameter("estado");
			String Cep = request.getParameter("cep");
			String IdEndereco = request.getParameter("idEndereco");
		@SuppressWarnings("unused")
			float preco = Float.parseFloat(request.getParameter("preco"));
			
			c.setLogradouro(Logradouro);
			c.setNumero(Numero);
			c.setComplemento(Complemento);
			c.setBairro(Bairro);
			c.setCidade(Cidade);
			c.setEstado(Estado);
			c.setCep(Cep);
			c.setIdEndereco(IdEndereco);

		EnderecoDAO dao= new EnderecoDAO();
		String ret;
		try {
		    if(IdEndereco=="" || IdEndereco==null) {
			    ret="Endereco Incluído com Sucesso";
	            dao.newendereco(c);
	        }else {
	        	ret="Endereco Alterado com Sucesso";
	            c.setIdEndereco(IdEndereco);
	          
	        }

			
		} catch (Exception e){
			ret="Erro na Inclusão<br>";
			ret += e.getMessage() + "<br>";
			ret+="<a href='home'>Voltar</a>";
		}		
		response.getWriter().append(ret);
	}

}
