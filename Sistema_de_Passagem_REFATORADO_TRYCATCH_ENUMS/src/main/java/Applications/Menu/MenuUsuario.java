package Applications.Menu;

import Entities.ClasseEconomica.ClasseEconomica;
import Entities.ClasseExecutiva.ClasseExecutiva;
import Entities.Enums.RespostasSistema;

import java.util.Scanner;

public class MenuUsuario {


    public void menuUser () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de passagens aéreas!");
        System.out.println("Digite seu nome completo:");
        String nome= sc.nextLine();
        System.out.println("Digite o número do voo:");
        String numeroVoo= sc.nextLine();

        String classe;
        do {
            System.out.println("Digite em qual classe gostaria de compara sua passagem (economica ou executiva):");
            classe = sc.nextLine().toLowerCase();

            if (!classe.equals("economica") && !classe.equals("executiva")) {
                System.out.println(RespostasSistema.RESPOSTA_INVALIDA);
            }
        } while (!classe.equals("economica") && !classe.equals("executiva"));

        if (classe.equals("economica")) {
            boolean despachar= false;
            char opcao;

            do {
                System.out.println("Deseja despachar mala? Custo adicional de R$120,00 (s/n)");
                opcao = sc.next().charAt(0);

                if (opcao!= 's' && opcao!= 'n') {
                    System.out.println(RespostasSistema.RESPOSTA_INVALIDA);
                }
            } while (opcao!= 's' && opcao!= 'n');

            if (opcao == 's') {
                despachar = true;
            }

            ClasseEconomica economica= new ClasseEconomica(nome, numeroVoo, despachar);
            economica.despacharMala();

            System.out.println(
                    RespostasSistema.PEDIDO_REALIZADO+ "\n" +
                            economica.toString()
            );
        }

        else {
            ClasseExecutiva executiva= new ClasseExecutiva(nome, numeroVoo);

            System.out.println(
                    RespostasSistema.PEDIDO_REALIZADO+ "\n" +
                            executiva.toString()
            );
        }

        sc.close();
    }
}
