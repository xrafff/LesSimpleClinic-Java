package VO;

public class Paciente extends Endereco {
    public String nome;
    public String email;
    public String telefone;
    public String cartao;
    public String validadeCartao;
    public String cpf;
    public String rg;
	public Endereco endereco; 
	public String DataNasc;
	public String IdPaciente;
    public String codigo;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getRG() {
        return rg;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }
	public String getDataNasc() {
		return DataNasc;
	}
	
	public void setDataNasc(String DataNasc) {
		this.DataNasc = DataNasc;
	}
	public String getIdPaciente() {
		return IdPaciente;
	}
	
	public void setIdPaciente(String idPaciente) {
		IdPaciente = idPaciente;
	}

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}






