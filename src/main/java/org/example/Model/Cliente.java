package org.example.Model;

public class Cliente extends BaseEntity{

    private String nome;

    private long cpf;

    private long numCNH;


    public Cliente(long id, String nome,long cpf, long numCNH){
        super(id);
        this.nome = nome;
        this.cpf = cpf;
        this.numCNH = numCNH;
    }

    public Cliente(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getNumCNH() {
        return numCNH;
    }

    public void setNumCNH(long numCNH) {
        this.numCNH = numCNH;
    }

}
