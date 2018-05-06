package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public enum TipoProduto {
    
    ELETRONICOS("Eletrônico"),
    RECICLADOS("Reciclados"),
    VEICULOS("Veículos"),
    FERRAMENTAS("Ferramentas"),
    ARTISTICOS("Artísticos"),
    COLECIONAVEIS("Colecionáveis"),
    ARTIGOSCASA("Artigos de casa");
    
    private final String produto;
    
    private TipoProduto(String produto){
        this.produto = produto;
    
    }
    
    @Override
    public String toString() {
        return this.produto;
    }
    
}
