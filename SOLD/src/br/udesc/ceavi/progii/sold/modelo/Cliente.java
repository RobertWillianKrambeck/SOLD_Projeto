package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Cliente extends Pessoa{
    
    private boolean tipoCliente;

    public Cliente(boolean tipoCliente, String cpf, String email, String nome, String telefone) {
        super(cpf, email, nome, telefone);
        this.tipoCliente = tipoCliente;
    }
    
    public boolean getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(boolean tipoCliente) {
        this.tipoCliente = tipoCliente;
    } 
    
}
