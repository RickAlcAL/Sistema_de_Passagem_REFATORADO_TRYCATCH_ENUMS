package Applications.Main;

import Applications.Menu.MenuUsuario;
import Entities.ClasseEconomica.ClasseEconomica;
import Entities.ClasseExecutiva.ClasseExecutiva;
import Entities.Enums.RespostasSistema;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        MenuUsuario menu = new MenuUsuario();

        menu.menuUser();
    }
}
