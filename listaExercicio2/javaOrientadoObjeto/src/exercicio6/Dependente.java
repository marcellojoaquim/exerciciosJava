package exercicio6;
// EXERCICIO 6
import java.util.Date;

public class Dependente  {
	private int sequencial;
	private String nomeCompleto;
	private Date dataNascimento;
	private Integer sexo;
	private Boolean partipaPlano;
	private Funcionario funcionario;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int getSequencial() {
		return sequencial;
	}

	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Boolean getPartipaPlano() {
		return partipaPlano;
	}

	public void setPartipaPlano(Boolean partipaPlano) {
		this.partipaPlano = partipaPlano;
	}

}

