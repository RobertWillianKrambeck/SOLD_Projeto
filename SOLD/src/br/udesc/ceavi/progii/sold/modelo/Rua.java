package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Rua {
    private String nome;
    private int id;

    public Rua(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
}
