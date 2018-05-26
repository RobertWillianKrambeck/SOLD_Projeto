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
    private Estado uf;
    private List<Bairro> bairros;

    public Cidade(int id, String nomeDaCidade, String sigla, Estado uf) {
        this.bairros = new ArrayList<>();
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

    public Estado getUf() {
        return uf;
    }

    public void setUf(Estado uf) {
        this.uf = uf;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> Bairros) {
        this.bairros = Bairros;
    }

    @Override
    public String toString() {
        return "Cidade: " + nomeDaCidade + "\nEstado: " + uf.toString() + "\nBairro:" + bairros.toString();
    }
}
