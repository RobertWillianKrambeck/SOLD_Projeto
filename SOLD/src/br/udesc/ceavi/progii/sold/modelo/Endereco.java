package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Endereco {
    
    private Cidade cidade;
    private int numeroCasa;

    public Endereco(Cidade cidade, int numeroCasa) {
        this.cidade = cidade;
        this.numeroCasa = numeroCasa;
    }
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
}
