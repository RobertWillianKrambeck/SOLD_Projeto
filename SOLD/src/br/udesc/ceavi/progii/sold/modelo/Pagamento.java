package br.udesc.ceavi.progii.sold.modelo;

import java.util.Date;

/**
 *
 * @author Robert
 */
public class Pagamento {
   
    private Cliente cliente;
    private Date  dataVencimento;
    private int id;
    private String metodoDePagamento;
    private NotaFiscal notaFiscal;
    private Produto produto;
    private float valor;

    public Pagamento(Cliente cliente, Date dataVencimento, int id, String metodoDePagamento, NotaFiscal notaFiscal, Produto produto, float valor) {
        this.cliente = cliente;
        this.dataVencimento = dataVencimento;
        this.id = id;
        this.metodoDePagamento = metodoDePagamento;
        this.notaFiscal = notaFiscal;
        this.produto = produto;
        this.valor = valor;
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

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
