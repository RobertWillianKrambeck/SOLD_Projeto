package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Servico {
    
    private int id;
    private String nome;
    private float valorDeInicial;
    private Endereco localizacao;
    private TipoServico categoriaServico;

    public Servico(int id, Endereco localizacao, String nome, float valorDeInicial, TipoServico categoriaServico) {
        this.id = id;
        this.localizacao = localizacao;
        this.nome = nome;
        this.valorDeInicial = valorDeInicial;
        this.categoriaServico = categoriaServico;
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

    public float getValorDeInicial() {
        return valorDeInicial;
    }

    public void setValorDeInicial(float valorDeInicial) {
        this.valorDeInicial = valorDeInicial;
    }

    public TipoServico getCategoriaServico() {
        return categoriaServico;
    }

    public void setCategoriaServico(TipoServico categoriaServico) {
        this.categoriaServico = categoriaServico;
    }
    
    
    
}
