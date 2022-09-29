package exercicio15;

public class Parceiro {
    
    private String tipoPessoa;
    private float desempenho;
    private Juridica juridica;
    private Fisica fisica;
    

    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public float getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }

    public void cadastrar(){
        System.out.println("Chamando metodo cadastrar da classe Parceiro");
    }
    public void bloquear(){
        System.out.println("Chamando método bloquear da classe Parceiro");
    }
    public void excluir(){
        System.out.println("Chamando método excluir da classe Parceiro");
    }

    
}
