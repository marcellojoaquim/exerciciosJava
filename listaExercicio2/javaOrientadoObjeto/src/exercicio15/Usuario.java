package exercicio15;

public class Usuario {
    
    private String login;
    private String senha;
    private String permissao;
    private Colaborador colaborador;

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public void editarPerfil(){
        System.out.println("Chamando o método editar perfil da classe Usuario");
    }

    public void alterarSenha(){
        System.out.println("Chamando o método alterar senha da classe Usuario");
    }

    public void criarUsuario(){
        System.out.println("Chamando o método criar usuario da classe Usuario");
    }

    public void apagarUsuario(){
        System.out.println("Chamando o método apagar usuario da classe Usuario");
    }

    
    
}
