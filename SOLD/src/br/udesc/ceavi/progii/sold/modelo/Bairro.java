package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
import java.util.ArrayList;
import java.util.List;

public class Bairro {
    private int id;
    private String cep;
    private String nome;
    private List<Rua> ruas;

    public Bairro() {
    }

    public Bairro(String cep, String nome) {
        this.ruas = new ArrayList<>();
        this.cep = cep;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Rua> getRuas() {
        return ruas;
    }

    public void setRuas(List<Rua> Ruas) {
        this.ruas = Ruas;
    }
    
    
}
