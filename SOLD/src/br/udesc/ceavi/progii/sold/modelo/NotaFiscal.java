package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class NotaFiscal {

    private int id;
    private Negociacao negociacao;

    public NotaFiscal(int id, Negociacao negociacao) {
        this.id = id;
        this.negociacao = negociacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NotaFiscal: " + "\nID:" + id
                + "\nNegociacao: " + negociacao.toString();
    }

}
