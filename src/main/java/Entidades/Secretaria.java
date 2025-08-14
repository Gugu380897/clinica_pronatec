package Entidades;

public class Secretaria {
    private Integer id;
    private String nome_secretaria;
    private String telefone;
    private String cpf;
    private String rg;
    private String endereco;
    private String sexo;
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome_secretaria
     */
    public String getNome_secretaria() {
        return nome_secretaria;
    }

    /**
     * @param nome_secretaria the nome_secretaria to set
     */
    public void setNome_secretaria(String nome_secretaria) {
        this.nome_secretaria = nome_secretaria;
    }
}
