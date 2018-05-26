package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public enum TipoCliente {
    
    PREMIUM("Premium"),
    FREE("Free"),
    OUTROS("Outros");
    
    private final String tipoCliente;

    private TipoCliente(String cliente) {
        this.tipoCliente = cliente;
    }

    @Override
    public String toString() {
        return this.tipoCliente;
    }
}
