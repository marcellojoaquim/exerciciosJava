package exercicio17;

import java.sql.Date;
import java.sql.Time;

public class Evento {
    
    private String nome;
    private String descricao;
    private Time horaInicio;
    private Time horaFim;
    private Date dataInicio;
    private Date dataFim;
    private NivelPrioridade prioridade;
    
    public void compartilharEvento(){
        System.out.println("Compartilhando evento....");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public NivelPrioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(NivelPrioridade prioridade) {
        this.prioridade = prioridade;
    }

}
