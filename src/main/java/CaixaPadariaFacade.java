public class CaixaPadariaFacade {

    public static boolean verificarPendenciasContabilidade(ContabilidadePadaria contabilidade) {
        if (Panificacao.getInstancia().verificarContabilidadeComPendencia(contabilidade)) {
            return false;
        }
        if (Confeitaria.getInstancia().verificarContabilidadeComPendencia(contabilidade)) {
            return false;
        }
        return true;
    }
}
