package exercicio2;
/*EXERCICIO 2
 Neste exercicio eu fiquei em dúvida com relação a geração do getId uma vez que já existe o getCode que
 retona o id. Não gerei o getId.
*/
import java.util.Date;

public class Produto {
    
    private int id;
    private String nome;
    private String descricao;
    private Date vallidade;


    public void setId(int id) {
        this.id = id;
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

    public Date getVallidade() {
        return vallidade;
    }

    public void setVallidade(Date vallidade) {
        this.vallidade = vallidade;
    }

    public int getCod(){
        return id;
    }
}
