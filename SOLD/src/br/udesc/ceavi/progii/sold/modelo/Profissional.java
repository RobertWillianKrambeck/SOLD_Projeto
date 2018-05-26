package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public class Profissional extends Pessoa {

    private String descricao;
    private int numeroDaCarteira;

    public Profissional(String cpf, String email, String nome, String telefone) {
        super(cpf, email, nome, telefone);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroDaCarteira() {
        return numeroDaCarteira;
    }

    public void setNumeroDaCarteira(int numeroDaCarteira) {
        this.numeroDaCarteira = numeroDaCarteira;
    }

    @Override
    public String toString() {
        return "Profissional:"
                + "\nDescricao: " + descricao
                + "\nNumero Da Carteira: " + numeroDaCarteira;
    }
}
