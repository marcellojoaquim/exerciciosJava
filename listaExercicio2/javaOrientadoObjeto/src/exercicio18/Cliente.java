package exercicio18;

import java.math.BigDecimal;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String nomeUsuario;
    private String cargo;
    private BigDecimal salario;
    private boolean status;
    private String senha;
    private Endereco endereco;
    private List<PedidoDelivery> realizaPedidos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<PedidoDelivery> getRealizaPedidos() {
        return realizaPedidos;
    }

    public void setRealizaPedidos(List<PedidoDelivery> realizaPedidos) {
        this.realizaPedidos = realizaPedidos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
