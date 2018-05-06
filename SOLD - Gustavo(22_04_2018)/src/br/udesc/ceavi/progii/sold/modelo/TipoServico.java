package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public enum TipoServico {
    
    TRANSPORTE("Transporte"),
    LIMPESA("Limpesa"),
    CONCERTO("Concerto"),
    PRODUCAO("Produção");
    
    private final String servico;

    private TipoServico(String servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return this.servico;
    }
    
    
    
    
}
