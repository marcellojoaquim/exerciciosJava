package exercicio18;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date dataPedido;
    private boolean status;
    private PagamentoNfe pagamentoNfe;
    private List<ItemPedido> itemPedidos;
    private BigDecimal valorTotal;

    
    
    public void statusPedido(){
        System.out.println("Chamando o método status do pedido da classe Pedido");
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public PagamentoNfe getPagamentoNfe() {
        return pagamentoNfe;
    }

    public void setPagamentoNfe(PagamentoNfe pagamentoNfe) {
        this.pagamentoNfe = pagamentoNfe;
    }

    
}
