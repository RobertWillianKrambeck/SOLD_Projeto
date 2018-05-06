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

    public Negociacao(int id, int numeroDePessoas, float valorDoLance, Servico servicoEmLeilao) {
        this.id = id;
        this.numeroDePessoas = numeroDePessoas;
        this.valorDoLance = valorDoLance;
        this.servicoEmLeilao = servicoEmLeilao;
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
    
    
}
