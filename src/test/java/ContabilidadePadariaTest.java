import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContabilidadePadariaTest {
    @Test
    void deveRetornarPendenciaContabilidadeSetorPanificacao() {
        ContabilidadePadaria contabilidade = new ContabilidadePadaria();
        Panificacao.getInstancia().addContabilidadePendente(contabilidade);
        assertEquals(false, contabilidade.fecharCaixa());
    }

    @Test
    void deveRetornarPendenciaContabilidadeSetorConfeiraria() {
        ContabilidadePadaria contabilidade = new ContabilidadePadaria();
        Confeitaria.getInstancia().addContabilidadePendente(contabilidade);
        assertEquals(false, contabilidade.fecharCaixa());
    }

    @Test
    void deveRetornarContabilidadeSemPendencia() {
        ContabilidadePadaria contabilidade = new ContabilidadePadaria();
        assertEquals(true, contabilidade.fecharCaixa());
    }
}