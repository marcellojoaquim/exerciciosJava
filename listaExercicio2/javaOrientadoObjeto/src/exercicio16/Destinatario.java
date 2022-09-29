package exercicio16;

public class Destinatario {
    private String emailDestinatario;

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public static Destinatario buscar(Destinatario destinatario){
      
        return destinatario;
    }

    public void adicionar(){
        System.out.println("Chamando o metodo adicionar da classe Destinatario");
    }

    public void apagar(){
        System.out.println("Chamando o metodso apagar da classe Destinatario");
    }
   
}
