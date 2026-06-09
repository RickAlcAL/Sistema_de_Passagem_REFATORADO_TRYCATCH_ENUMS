package Entities.ClasseEconomica;

import Entities.Passagem.Passagem;

public class ClasseEconomica extends Passagem {
    private String bagagemDireito = "1 mochila/bolsa de mão (até 10kg).";
    private boolean malaDespachada;

    public ClasseEconomica(String nomePassageiro, String numeroVoo, boolean malaDespachada) {
        super(nomePassageiro, numeroVoo);
        this.malaDespachada = malaDespachada;
    }

    public void despacharMala() {
        if (malaDespachada) {
            super.precoOriginal += 120.00;
        }
    }

    @Override
    public String toString() {
        return "===================================\n"+
                "Classe Economica\n" +
                String.format("Preco: R$ %.2f", precoOriginal) +
                "\nNumero do Voo: " + numeroVoo +
                "\nNome do Passageiro: " + nomePassageiro +
                "\nBagagem: " + bagagemDireito +
                "\n===================================";
    }
}
