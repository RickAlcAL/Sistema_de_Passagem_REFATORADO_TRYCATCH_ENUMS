package Entities.Passagem;

public class Passagem {
    protected String nomePassageiro;
    protected String numeroVoo;
    protected double precoOriginal= 500.00;

    public Passagem(String nomePassageiro, String numeroVoo) {
        this.nomePassageiro = nomePassageiro;
        this.numeroVoo = numeroVoo;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public double getPrecoOriginal() {
        return precoOriginal;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}
