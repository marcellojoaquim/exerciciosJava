package exercicio18;

public class ItemPedido {

    private int quantidade;
    private Produto produto;
    private Pedido contem;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getContem() {
        return contem;
    }

    public void setContem(Pedido contem) {
        this.contem = contem;
    }
}
