package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert e Gustavo C. Santos
 * @version 1.5
 */
public class Produto {

    private int id;
    private Endereco localizacao;
    private String nome;
    private float valorDeArremate;
    private float valorDeInicial;
    private EstadoDoProduto estadoDoProduto;
    private Cliente donoDoProduto;
    private TipoProduto categoria;

    public Produto(int id, Endereco localizacao, String nome, float valorDeArremate, float valorDeInicial, EstadoDoProduto estadoDoProduto, Cliente donoDoProduto, TipoProduto categoria) {
        this.id = id;
        this.localizacao = localizacao;
        this.nome = nome;
        this.valorDeArremate = valorDeArremate;
        this.valorDeInicial = valorDeInicial;
        this.estadoDoProduto = estadoDoProduto;
        this.donoDoProduto = donoDoProduto;
        this.categoria = categoria;
    }

    public Produto(int id, String nome, float valorDeArremate, float valorDeInicial, EstadoDoProduto estadoDoProduto, Cliente donoDoProduto, TipoProduto categoria) {
        this.id = id;
        this.nome = nome;
        this.valorDeArremate = valorDeArremate;
        this.valorDeInicial = valorDeInicial;
        this.estadoDoProduto = estadoDoProduto;
        this.donoDoProduto = donoDoProduto;
        this.categoria = categoria;
    }

    public Produto() {
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

    public float getValorDeInicial() {
        return valorDeInicial;
    }

    public void setValorDeInicial(float valorDeInicial) {
        this.valorDeInicial = valorDeInicial;
    }

    public EstadoDoProduto getEstadoDoProduto() {
        return estadoDoProduto;
    }

    public void setEstadoDoProduto(EstadoDoProduto estadoDoProduto) {
        this.estadoDoProduto = estadoDoProduto;
    }

    public Cliente getDonoDoProduto() {
        return donoDoProduto;
    }

    public TipoProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoProduto categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "#######################Produto#######################"
                + "\nNome: " + nome + "              ID: " + id
                //                + "\nLocalizacao: " + localizacao.toString()
                + "\nValor de Arremate: " + valorDeArremate + "R$" + "   Valor de Inicial: " + valorDeInicial + "R$"
                + "\nEstado Do Produto: " + estadoDoProduto.toString() + "\nCategoria: " + categoria.toString() + "\n";
    }

}
