package exercicio18;

import java.sql.Date;

public class NotaFiscal {

    private int numeroDaNota;
    private int serie;
    private Date dataDeEmissao;
    private double valor;
    

    public NotaFiscal(int numeroDaNota, int serie, Date dataDeEmissao, double valor) {
        this.numeroDaNota = numeroDaNota;
        this.serie = serie;
        this.dataDeEmissao = dataDeEmissao;
        this.valor = valor;
    }

    public int getNumeroDaNota() {
        return numeroDaNota;
    }

    public void setNumeroDaNota(int numeroDaNota) {
        this.numeroDaNota = numeroDaNota;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Date getDataDeEmissao() {
        return dataDeEmissao;
    }

    public void setDataDeEmissao(Date dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
}