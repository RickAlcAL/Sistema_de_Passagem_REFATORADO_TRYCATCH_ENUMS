package Entities.ClasseExecutiva;

import Entities.Passagem.Passagem;

public class ClasseExecutiva extends Passagem {
    private String bagagemDireito = "1 mochila/bolsa de mão (até 10kg) e 2 malas de até 23kg despachadas.";
    private String inclusos= "Serviço de bordo vip e Sala vip do aeroporto";

    public ClasseExecutiva(String nomePassageiro, String numeroVoo) {
        super(nomePassageiro, numeroVoo);
        super.precoOriginal += getPrecoOriginal()*0.5;
    }

    @Override
    public String toString() {
        return "===================================\n"+
                "Classe Executiva\n" +
                String.format("Preco: R$ %.2f", precoOriginal) +
                "\nNumero do Voo: " + numeroVoo +
                "\nNome do Passageiro: " + nomePassageiro +
                "\nBagagem: " + bagagemDireito +
                "\nInclusos: " + inclusos +
                "\n===================================";
    }
}
