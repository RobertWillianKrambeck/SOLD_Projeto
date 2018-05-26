package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Negociacao {

    private int id;
    private int numeroDePessoas;
    private float valorDoLance;
    private Servico servicoEmLeilao;
    private Produto produtoEmLeilao;

    public Negociacao(int id, int numeroDePessoas, float valorDoLance, Servico servicoEmLeilao) {
        this.id = id;
        this.numeroDePessoas = numeroDePessoas;
        this.valorDoLance = valorDoLance;
        this.servicoEmLeilao = servicoEmLeilao;
    }

    public Negociacao(int id, int numeroDePessoas, float valorDoLance, Produto produtoEmLeilao) {
        this.id = id;
        this.numeroDePessoas = numeroDePessoas;
        this.valorDoLance = valorDoLance;
        this.produtoEmLeilao = produtoEmLeilao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public float getValorDoLance() {
        return valorDoLance;
    }

    public void setValorDoLance(float valorDoLance) {
        this.valorDoLance = valorDoLance;
    }

    public Servico getServicoEmLeilao() {
        return servicoEmLeilao;
    }

    public void setServicoEmLeilao(Servico servicoEmLeilao) {
        this.servicoEmLeilao = servicoEmLeilao;
    }

    public Produto getProdutoEmLeilao() {
        return produtoEmLeilao;
    }

    public void setProdutoEmLeilao(Produto produtoEmLeilao) {
        this.produtoEmLeilao = produtoEmLeilao;
    }

    /**
     * toString de Serviço
     *
     * @return O toString quando há um Servico
     */
    @Override
    public String toString() {
        return "######################Negociação#####################\n" + "Numero De Pessoas: " + numeroDePessoas
                + "         Valor Do Lance: " + valorDoLance + "R$" + "\n";
    }

    public String produtoServico() {
        String item = null;
        if (produtoEmLeilao == null) {
            item = servicoEmLeilao.toString();
        } else if (servicoEmLeilao == null) {
            item = produtoEmLeilao.toString();
        }
        return item;
    }
}
