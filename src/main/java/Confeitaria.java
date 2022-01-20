public class Confeitaria extends Setor{
    private static Confeitaria confeitaria = new Confeitaria();

    private Confeitaria(){};

    public static Confeitaria getInstancia(){
        return confeitaria;
    }
}
