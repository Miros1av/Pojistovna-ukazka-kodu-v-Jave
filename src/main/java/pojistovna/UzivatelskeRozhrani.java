package pojistovna;

import java.util.Scanner;

public class UzivatelskeRozhrani {

    DatabazeKlientu seznamKlientu = new DatabazeKlientu();
    Scanner scanner = new Scanner(System.in);

    /**
     * Vypíše možnosti volby pro uživatele
     */
    void VypisMenu() {
        System.out.println("ZVOLTE jednu z následujících možností:");
        System.out.println("- 1: Zobrazí všechny klienty.");
        System.out.println("- 2: Najde v databázi klienta podle příjmení.");
        System.out.println("- 3: Přidá nového klienta do databáze");
        System.out.println("- 4: Odstraní klienta z databáze.");
        System.out.println("- 5: Ukončí práci s databází.");
        System.out.println("------------------------------------------");
    }

    /**
     * Hlavní menu
     */
    public void startMenu() {

        String volba = "";

        while (!volba.equals("5")) {
            VypisMenu();

            System.out.println("Zvolte možnost");
            volba = scanner.nextLine().trim();

            switch (volba) {
                case "1":
                    seznamKlientu.vypisVsechnyKlienty();
                    break;

                case "2":
                    seznamKlientu.vyhledejPrijmeni();
                    break;

                case "3":
                    seznamKlientu.pridejKlienta();
                    break;

                case "4":
                    seznamKlientu.smazZaznam();
                    break;

                case "5":
                    System.out.println("Zavírám databázi.");
                    break;
            }
        }
    }
}
