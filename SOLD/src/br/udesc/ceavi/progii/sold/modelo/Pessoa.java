package br.udesc.ceavi.progii.sold.modelo;

/**
 *
 * @author Robert
 */
public abstract class Pessoa {

    private String cpf;
    private String email;
    private String nome;
    private String telefone;

    public Pessoa(String cpf, String email, String nome, String telefone) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\nCPF: " + cpf + "\nEmail:" + email + "\nTelefone:" + telefone;
    }

}
