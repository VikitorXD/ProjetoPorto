package org.example.Model;

public class Vehicle {

    public int ID;
    public String modelo;
    public String cor;
    public String largura;
    public String altura;
    public int numeroEixos;
    public boolean carga;
    public Cliente cliente;
    public double peso;

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String Cor) {
        this.cor = cor;
    }

    public String getLargura() {
        return largura;
    }

    public void setlargura(String largura) {
        this.largura = largura;
    }

    public String getaltura() {
        return altura;
    }

    public void setaltura(String altura) {
        this.altura = altura;
    }

    public int getnumeroEixos() {
        return numeroEixos;
    }

    public void setnumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehicle( String modelo, int numeroEixos, double peso) {
        this.modelo = modelo;
        this.numeroEixos = numeroEixos;
        this.peso = peso;
    }

    public Vehicle() {

    }
}
