package exercicio18;

import java.util.List;

public class Funcionario extends Pessoa {

    private List<PedidoBasico> realizaPedidos;

    
    public void listarPediso(){
        System.out.println("Chamando método listar pedido da classe funcionário");
    }

    public void editarPedido(){
        System.out.println("chamando método editar pedido da classe funcionário");
    }

    public List<PedidoBasico> getrealizaPedidos() {
        return realizaPedidos;
    }

    public void setPedidoBasicos(List<PedidoBasico> realizaPedidos) {
        this.realizaPedidos = realizaPedidos;
    }

    
}
