import java.util.ArrayList;
import java.util.List;

public abstract class Setor {
    private List<ContabilidadePadaria> caixaComPendencia = new ArrayList<ContabilidadePadaria>();

    public void addContabilidadePendente(ContabilidadePadaria contabilidade) {
        this.caixaComPendencia.add(contabilidade);
    }

    public boolean verificarContabilidadeComPendencia(ContabilidadePadaria contabilidade) {
        return this.caixaComPendencia.contains(contabilidade);
    }
}
