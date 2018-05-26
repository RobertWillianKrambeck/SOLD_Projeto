package br.udesc.ceavi.progii.sold.modelo;

import java.util.Date;

/**
 *
 * @author Robert
 */
public class Pagamento {

    private Cliente cliente;
    private Date dataVencimento;
    private int id;
    private NotaFiscal notaFiscal;
    private final Negociacao negociacaoEmPagamento;

    public Pagamento(Cliente cliente, Date dataVencimento, int id, Negociacao negociacaoEmPagamento) {
        this.cliente = cliente;
        this.dataVencimento = dataVencimento;
        this.id = id;
        this.negociacaoEmPagamento = negociacaoEmPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Negociacao getNegociacaoEmPagamento() {
        return negociacaoEmPagamento;
    }

    @Override
    public String toString() {
        return "Data Vencimento: " + dataVencimento;
    }
}
