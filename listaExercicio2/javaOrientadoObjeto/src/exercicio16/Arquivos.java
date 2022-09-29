package exercicio16;

public class Arquivos {
    
    private String nomeArquivo;
    private String formato;
    private int tamanho;

    
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void anexar(){
        System.out.println("Chamando o metodo anexar da classe Arquivos");
    }

    public void remover(){
        System.out.println("Chamando o metodo remover da classe Arquivos");
    }
}
