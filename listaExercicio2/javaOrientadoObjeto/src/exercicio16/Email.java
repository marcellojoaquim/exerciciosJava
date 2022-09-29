package exercicio16;

import java.util.List;

public class Email {
    private String nomeDoEmail;
    private Texto texto;
    private Assunto assunto;
    private List<Destinatario> destinatario;
    private Arquivos arquivos;


    public Arquivos getArquivos() {
        return arquivos;
    }

    public void setArquivos(Arquivos arquivos) {
        this.arquivos = arquivos;
    }

    public Texto getTexto() {
        return texto;
    }

    public void setTexto(Texto texto) {
        this.texto = texto;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

    public String getNomeDoEmail() {
        return nomeDoEmail;
    }

    public void setNomeDoEmail(String nomeDoEmail) {
        this.nomeDoEmail = nomeDoEmail;
    }

    public List<Destinatario> getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(List<Destinatario> destinatario) {
        this.destinatario = destinatario;
    }

    public void escrever(){
        System.out.println("Chamando o metodo escrever da classe Email");
    }

    public void excluir(){
        System.out.println("Chamando o metodo excluir da classe Email");
    }

    public void anexar(){
        System.out.println("Chamando o metodo anexar da classe Email");
    }

    public void responder(){
        System.out.println("Chamando o metodo responder da classe Email");
    }

    
}
