package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class NotaFiscal {

    private int codigo;
    private double valorProduto;

    public NotaFiscal(int codigo, double valorProduto) {
        this.codigo = codigo;
        this.valorProduto = valorProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    
    
}
