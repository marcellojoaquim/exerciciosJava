package exercicio4;
//EXERCICIO 4
public class Ferramenta extends ItemDeLoja {
    private String categoria;
    private int serial;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void separar(){
        categoria = "Outros";
    }

    public void separar(String valor){
        categoria = valor;
    }

    @Override
    public int getIdentificador(){
        return serial;
    }
    
}
