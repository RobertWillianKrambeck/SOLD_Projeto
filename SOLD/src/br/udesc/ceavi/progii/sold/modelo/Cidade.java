package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
import java.util.ArrayList;
import java.util.List;

public class Cidade {
    
    private int id;
    private String nomeDaCidade;
    private String sigla;
    private String uf;
    private List<Bairro> bairros = new ArrayList<Bairro>();

    public Cidade(int id, String nomeDaCidade, String sigla, String uf) {
        this.id = id;
        this.nomeDaCidade = nomeDaCidade;
        this.sigla = sigla;
        this.uf = uf;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDaCidade() {
        return nomeDaCidade;
    }

    public void setNomeDaCidade(String nomeDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> Bairros) {
        this.bairros = Bairros;
    }
    
    
}
