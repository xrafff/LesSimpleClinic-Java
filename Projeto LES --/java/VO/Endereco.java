package VO;

public class Endereco {
	public String Logradouro;
	public int Numero;
	public String Complemento;
	public String Bairro;
	public String Cidade;
	public String Estado;
	public String Cep;
	public String IdEndereco;
	public String CodigoEndereco;
	
	public String getLogradouro() {
		return Logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	
	public int getNumero() {
		return Numero;
	}
	
	public void setNumero(int numero) {
		Numero = numero;
	}
	
	public String getComplemento() {
		return Complemento;
	}
	
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	
	public String getBairro() {
		return Bairro;
	}
	
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	
	public String getCidade() {
		return Cidade;
	}
	
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	
	public String getEstado() {
		return Estado;
	}
	
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	public String getCep() {
		return Cep;
	}
	
	public void setCep(String cep) {
		Cep = cep;
	}

	public String getIdEndereco(String idendereco) {
		return IdEndereco;
	}
	public void setIdEndereco(String idendereco) {
		IdEndereco=idendereco;
	}
	
}