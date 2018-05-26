package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Cliente extends Pessoa{
    
    private TipoCliente tipoCliente;

    public Cliente(TipoCliente tipoCliente, String cpf, String email, String nome, String telefone) {
        super(cpf, email, nome, telefone);
        this.tipoCliente = tipoCliente;
    }
    
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    } 

    @Override
    public String toString() {
        return super.toString() + "    Pacote:" + this.tipoCliente.toString();
    }
    
}
