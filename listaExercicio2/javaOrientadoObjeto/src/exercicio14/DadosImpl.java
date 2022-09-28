package exercicio14;

public class DadosImpl implements Dados {
    
    private ArrayList<Transporte> lista = new ArrayList<>();

    @Override
    public void adcionar(Transporte t) throws Exception {
        lista.add(t);
    }

    @Override
    public void excluir(Transporte t){
        lista.remove(t);
    }
}
