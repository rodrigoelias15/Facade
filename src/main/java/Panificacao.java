public class Panificacao extends Setor{
    private static Panificacao panificacao = new Panificacao();

    private Panificacao(){};

    public static Panificacao getInstancia(){
        return panificacao;
    }
}
