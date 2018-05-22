package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Endereco {
    
    private int id;
    private Cidade cidade;
    private int numeroCasa;
    private String Complemtento;

    public int getId() {
        return id;
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

    public void setComplemtento(String Complemtento) {
        this.Complemtento = Complemtento;
    }

    public String getComplemtento() {
        return Complemtento;
    }
}
