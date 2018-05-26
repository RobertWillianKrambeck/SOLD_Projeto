package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
import java.util.ArrayList;
import java.util.List;

public class Bairro {
    private final int id;
    private String cep;
    private String nome;
    private List<Rua> ruas;
    private int aux;

    public Bairro(int id) {
        this.id = id;
    }

    public Bairro(String cep, String nome,int id) {
        this.ruas = new ArrayList<>();
        this.cep = cep;
        this.nome = nome;
        this.id = id;
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

    public Rua getRua(int aux) {
        return ruas.get(aux);
    }

    @Override
    public String toString() {
        return "Bairro:" + nome + "\nCEP:" + cep + "\nRua:" + getRua(aux).getNome();
    }

}
