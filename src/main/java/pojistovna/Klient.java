package pojistovna;

public class Klient {
    /**
     * Křestní jméno klienta
     */
    private String jmeno;

    /**
     * Příjmení klienta
     */
    private String prijmeni;

    /**
     * Rodné číslo klienta
     */
    private String rodneCislo;

    /**
     * Telefonní kontakt na klienta
     */
    private int telefon;

    /**
     * Druh uzavřené pojistky
     */
    private String druhPojistky;

    /**
     * Inicializuje instanci - Vytvoří nového klienta
     * @param jmeno - jméno klienta
     * @param prijmeni - příjmení klienta
     * @param rodneCislo - rodné číslo klienta
     * @param druhPojistky - druh pojistky, kterou má klient sjednanou
     */
    public Klient (String jmeno, String prijmeni, String rodneCislo, int telefon, String druhPojistky) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rodneCislo = rodneCislo;
        this.telefon = telefon;
        this.druhPojistky = druhPojistky;
    }

    /**
     * Vrátí jméno klienta
     * @return jméno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Vrátí příjmení klienta
     * @return příjmení
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrátí rodné číslo klienta
     * @return rodné číslo
     */
    public String getRodneCislo() {
        return rodneCislo;
    }

    /**
     * Vrátí telefon klienta
     * @return telefon číslo
     */
    public int getTelefon() {return telefon;}

    /**
     * Vrátí informaci o tom, jakou má klient sjednanou pojistku
     * @return druh pojistky
     */
    public String getDruhPojistky() {
        return druhPojistky;
    }

    /**
     * Vypíše klienta
     * @return klient - Jméno, Příjmení, rodné číslo, druh pojistky
     */
    @Override
    public String toString() {
        return String.format("Jméno: " + getJmeno() + " " + getPrijmeni() + ", Rodné číslo: " + getRodneCislo() + ", Telefonní číslo: " + getTelefon() + ", Druh pojistky: " + getDruhPojistky());
    }
}