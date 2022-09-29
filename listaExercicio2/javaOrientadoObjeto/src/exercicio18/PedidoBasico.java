package exercicio18;

public class PedidoBasico extends Pedido {

    private String nome;
    private Funcionario funcionario;
    private Gerente gerente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Gerente getGerente() {
        return gerente;
    }
    
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public PedidoBasico(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public PedidoBasico(String nome, Gerente gerente) {
        this.nome = nome;
        this.gerente = gerente;
    }

    

}
