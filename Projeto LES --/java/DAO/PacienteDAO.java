package DAO;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import VO.Endereco;
import VO.Paciente;

public class PacienteDAO extends BaseDAO{
	
	private Paciente vo; 
	
	public PacienteDAO() {
		
	}
	public PacienteDAO(Paciente vo) {
		this.vo = vo;
	}
	
	public Paciente getPacienteVo()
	{
		return vo;
	}
	
	public void setPacienteVo(Paciente vo) {
		this.vo = vo;
	}
		
	public Paciente LoadPaciente() {
		this.vo.setEmail("paciente@gugui.com.br");
		this.vo.setTelefone("0");
		this.vo.setNome("fulano de tal ");
        this.vo.setValidadeCartao("10/24");
        this.vo.setRG("123123");
        this.vo.setCPF("123123123213");
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua do Paciente");
		endereco.setNumero(123);
		endereco.setBairro("Bairro do Paciente");
		endereco.setCidade("Cidade do Paciente");
		endereco.setEstado("Estado do Paciente");
		endereco.setCep("12345678");
		endereco.setIdEndereco("1");
        this.vo.setCartao("99999999999");
		this.vo.setIdPaciente("1");

		return vo;
	}
	
	public List<Paciente> getPacientes() {
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		pacientes.add(this.vo);
		pacientes.add(this.vo);
		pacientes.add(this.vo);
		
		return pacientes;
	}
	
	public void newPaciente(Paciente p) throws Exception {
		abrir();		
	    String query = "insert into paciente (nome, email, telefone, cartao, validadecartao, datanasc, cpf, rg, senha) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    PreparedStatement preparedStmt = getConn().prepareStatement(query);
	    preparedStmt.setString(1, p.getNome());
	    preparedStmt.setString(2, p.getEmail());
	    preparedStmt.setString(3, p.getTelefone());
	    preparedStmt.setString(4, p.getCartao());
	    preparedStmt.setString(5, p.getValidadeCartao());
	    preparedStmt.setString(6, p.getDataNasc());
	    preparedStmt.setString(7, p.getCPF());
	    preparedStmt.setString(8, p.getRG());
		preparedStmt.setString(8, p.getIdPaciente());
	    	    preparedStmt.execute();
	    fechar();
	}
	
	public void delete() throws Exception {
		abrir();
	    String query = "delete from Paciente where id=?";
	    PreparedStatement preparedStmt = getConn().prepareStatement(query);
	    preparedStmt.setString(1,vo.getIdPaciente());    
	    preparedStmt.execute();
	    fechar();	
	}
	
	public void deletePaciente(Paciente paciente, List<Paciente> pacientes) {
		pacientes.remove(paciente);		
	}
	
	public void edit(Paciente p) throws Exception {
		abrir();
				
		String query = "UPDATE paciente SET nome=?, email=?, telefone=?, cartao=?, validadecartao=?, cpf=?, rg=?, senha=? WHERE id=?";
		PreparedStatement preparedStmt = getConn().prepareStatement(query);
		preparedStmt.setString(1, p.getNome());  
		preparedStmt.setString(2, p.getEmail());  
		preparedStmt.setString(3, p.getTelefone()); 
		preparedStmt.setString(4, p.getCartao()); 
		preparedStmt.setString(5, p.getValidadeCartao()); 
		preparedStmt.setString(6, p.getCPF()); 
		preparedStmt.setString(7, p.getRG()); 
		preparedStmt.setString(9, p.getIdPaciente()); 
		preparedStmt.execute();
		fechar();
	}
}
