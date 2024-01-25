package pojistovna;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabazeKlientu {
    ArrayList<Klient> seznamKlientu;
    Scanner scanner = new Scanner(System.in);

    /**
     * Fiktivní databáze klientů
     */
    Klient Pepa = new Klient("Josef", "NOVÁK", "830516/1517", "+420 777 365 458", "Životní pojistka");
    Klient Lada = new Klient("Lada", "KRÁLOVÁ", "815530/2524", "724 58 48 54", "Životní pojistka");
    Klient Tonda = new Klient("Antonín", "SLAVÍČEK", "811116/6811", "+420 733 32 58 42","Pojištění auta");
    Klient Honza = new Klient("Jan", "PECKA", "750215/2526", "608 354 558","Pojištění auta");
    Klient Jan = new Klient("Jan", "FOUSEK", "780514/1419", "545 325 845","Pojištění nemovitosti");

    public DatabazeKlientu() {
        seznamKlientu = new ArrayList<>();
        seznamKlientu.add(Pepa);
        seznamKlientu.add(Lada);
        seznamKlientu.add(Tonda);
        seznamKlientu.add(Honza);
        seznamKlientu.add(Jan);
    }

    /**
     * Vypíše všechny vložené klienty
     */
    void vypisVsechnyKlienty() {
        if (!(seznamKlientu.isEmpty())) {
            for (int i = 0; i < seznamKlientu.size(); i++) {
                System.out.println("Klient " + "[ " + (i + 1) + " ]  " + "Jméno: " + seznamKlientu.get(i).getJmeno() + " " + seznamKlientu.get(i).getPrijmeni().toUpperCase() + " - Rodné číslo: " + seznamKlientu.get(i).getRodneCislo() + " - Telefonní číslo: " + seznamKlientu.get(i).getTelefon() + " - Druh pojistky: " + seznamKlientu.get(i).getDruhPojistky());
                //+1 je drobná korekce, aby klienti byli číslováni od jedné a ne od nuly
            }
        }
        else {
            System.out.println("Databáze klientů je prázdná.");
        }
        System.out.println("------------------------------------------");
    }

    /**
     * Vyhledá klienta podle příjmení a pokud ho najde, vypíše ho
     */
    void vyhledejPrijmeni() {
        System.out.println("Zadejte příjmení včetně háčků a čárek: ");
        String prijmeni = scanner.nextLine().trim().toUpperCase();

        for (Klient klient : seznamKlientu) {
            if (klient.getPrijmeni().equals(prijmeni)) {
                System.out.println(klient);
            }
        }
        System.out.println("------------------------------------------");
    }

    /**
     * Vloží nového klienta
     */
    void pridejKlienta() {
        System.out.println("Zadejte jméno:");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte příjmení:");
        String prijmeni = scanner.nextLine().trim().toUpperCase();
        System.out.println("Zadejte rodné číslo celé i s lomítkem:");
        String rodneCislo = scanner.nextLine().trim();
        System.out.println("Zadejte telefonní číslo:");
        String telefon = scanner.nextLine().trim();
        System.out.println("Zadejte druh pojistky:");
        String druhPojistky = scanner.nextLine().trim();

        Klient klient = new Klient(jmeno, prijmeni, rodneCislo, telefon, druhPojistky);
        seznamKlientu.add(klient);

        System.out.println("Záznam byl vytvořen");
        System.out.println("------------------------------------------");
    }

    /**
     * Smaže vloženého klienta
     */
    void smazZaznam() {
        vypisVsechnyKlienty();

        boolean jeSpravne = false; //Kontolní boolean, který slouží k potvrzení zadání správného vstupu,

        while (!jeSpravne) {
            try {
                System.out.println("Zadejte index klienta, kterého si přejete vymazat?");
                System.out.println("(číslo v hranaté závorce před jménem klient)");
                int id = Integer.parseInt(scanner.nextLine().trim());
                seznamKlientu.remove(id-1); // Vymazání záznamu, -1 oprava kvůli korekci v číslování u vypsání klientů
                jeSpravne = true; // Nastavení booleanu jeSpravne na true, které ukončí cyklus while
                System.out.println("Záznam byl smazán");
                System.out.println("------------------------------------------");

            } catch (Exception e) {
                System.out.println("Zadaná hodnota neodpovídá indexu žádného ze záznámů.");
                System.out.println("------------------------------------------");
                jeSpravne = true;
            }
        }
    }
}