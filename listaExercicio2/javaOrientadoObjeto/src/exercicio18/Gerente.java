package exercicio18;

import java.util.List;

public class Gerente {

    private List<Funcionario> listaFuncionario;
    private List<PedidoBasico> pedidoBasicos;
    private List<Cliente> cliente;
    


    public void listaFuncionario(){
        System.out.println("chamando método listar funcionarios");
        for (Funcionario funcionario : listaFuncionario) {
            System.out.println(funcionario);
        }
    }

    public void listaCliente(){
        System.out.println("Chamando método listar cliente");
    }

    public void criarFuncionario(){
        System.out.println("Chamando o método construtor de funcionário");
        new Funcionario();
    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public List<PedidoBasico> getPedidoBasicos() {
        return pedidoBasicos;
    }

    public void setPedidoBasicos(List<PedidoBasico> pedidoBasicos) {
        this.pedidoBasicos = pedidoBasicos;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    
    
}
