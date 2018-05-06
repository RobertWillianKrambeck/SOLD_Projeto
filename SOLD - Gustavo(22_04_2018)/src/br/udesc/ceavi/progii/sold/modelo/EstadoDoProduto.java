package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public enum EstadoDoProduto {
    
    VENDIDO("Vendido"),
    AVENDA("A Venda"),
    LEILAO("Leilão"),
    SENDOPAGO("Sendo pago");
    
    private final String estadoProduto;

    private EstadoDoProduto(String estadoProduto) {
        this.estadoProduto = estadoProduto;
    }

    @Override
    public String toString() {
        return this.estadoProduto;
    }
    
}
