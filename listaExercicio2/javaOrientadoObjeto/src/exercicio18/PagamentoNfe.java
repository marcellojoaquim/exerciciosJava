package exercicio18;

import java.math.BigDecimal;
import java.util.Date;

public class PagamentoNfe {
    private BigDecimal valor;
    private Date dataPagamento;
    private NotaFiscal notaFiscal;
    
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    

}
