package DAO;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import VO.Endereco;

public class EnderecoDAO extends BaseDAO{
	
	public Endereco vo; 
	
	public EnderecoDAO() {
		
	}
	public EnderecoDAO(Endereco vo) {
		this.vo = vo;
	}
	
	public Endereco getEnderecoVo()
	{
		return vo;
	}
	
	public void setEnderecoVo(Endereco vo) {
		this.vo = vo;
	}
		
	public Endereco Loadendereco() {
		
		
		this.vo.setLogradouro("rua tal");
		this.vo.setNumero(123);
		this.vo.setComplemento("apto 123");
		this.vo.setBairro("bairro tal");
		this.vo.setCidade("cidade tal");
		this.vo.setEstado("estado tal");
		this.vo.setCep("12345678");
		this.vo.setIdEndereco("0");
		return vo;
	}
	
	public List<Endereco> getenderecos() {
		
		List<Endereco> enderecos = new ArrayList<Endereco>();
		
		enderecos.add(this.vo);
		enderecos.add(this.vo);
		enderecos.add(this.vo);
		
		return enderecos;
	}
	public void newendereco(Endereco c) throws Exception {
		
		  abrir();		
	      String query = " insert into endereco (Logradouro,Numero,Complemento, Bairro,Cidade, Estado,Cep)"
	        + " values (?,?,?,?,?,?)";
	PreparedStatement preparedStmt = getConn().prepareStatement(query);
		preparedStmt.setString(1, c.getLogradouro());
		preparedStmt.setInt(2, c.getNumero());
		preparedStmt.setString(3, c.getComplemento());
		preparedStmt.setString(4, c.getBairro());
		preparedStmt.setString(5, c.getCidade());
		preparedStmt.setString(6, c.getEstado());
		preparedStmt.setString(7, c.getCep());
		preparedStmt.setString(8, c.getIdEndereco(query));
	    preparedStmt.execute();
	      fechar();
		
	}
	public void delete() throws Exception {
		  abrir();
	      String query = " delete from endereco where id=?";
	   PreparedStatement preparedStmt = getConn().prepareStatement(query);
	      preparedStmt.setString(1, vo.getCep());   
	      preparedStmt.execute();
	      fechar();	
	}
	
	
	public void deleteendereco(Endereco endereco, List<Endereco> enderecos) {
		enderecos.remove(endereco);
	}
	public void edit(Endereco c)  throws Exception {
		abrir();
			
		String query = "update endereco set Logradouro=?, Numero=?, Complemento=?, Bairro=?, Cidade=?, Estado=?, Cep=? where id=?";
		PreparedStatement preparedStmt = getConn().prepareStatement(query);
		preparedStmt.setString(1, c.getLogradouro());  
		preparedStmt.setInt(2, c.getNumero());  
		preparedStmt.setString(3, c.getComplemento()); 
		preparedStmt.setString(4, c.getBairro()); 
		preparedStmt.setString(5, c.getCidade()); 
		preparedStmt.setString(6, c.getEstado()); 
		preparedStmt.setString(7, c.getCep()); 
		preparedStmt.setString(8, c.getIdEndereco(query));
	      preparedStmt.execute();
	      fechar();
		
}}
	