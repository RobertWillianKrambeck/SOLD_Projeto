package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Produto {
    
    private int id;
    private Endereco localizacao;
    private String nome;
    private float valorDeArremate;

    public Produto(int id, Endereco localizacao, String nome, float valorDeArremate) {
        this.id = id;
        this.localizacao = localizacao;
        this.nome = nome;
        this.valorDeArremate = valorDeArremate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Endereco localizacao) {
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorDeArremate() {
        return valorDeArremate;
    }

    public void setValorDeArremate(float valorDeArremate) {
        this.valorDeArremate = valorDeArremate;
    }
    
    
    
}
