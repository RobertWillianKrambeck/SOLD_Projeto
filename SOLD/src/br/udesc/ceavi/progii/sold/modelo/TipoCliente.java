package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public enum TipoCliente {
    
    PREMIUM("Premium"),
    FREE("Free"),
    OUTROS("Outros");
    
    private final String cliente;

    private TipoCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return this.cliente;
    }
}
