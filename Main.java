import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hány játékos van?");
        int jatekosokSzama = scanner.nextInt();
        scanner.nextLine();

        List<Jatekos> jatekosok = new ArrayList<>();
        for (int i = 0; i < jatekosokSzama; i++) {
            System.out.println("Kérem adja meg a " + (i + 1) + ". játékos nevét:");
            String nev = scanner.nextLine();
            jatekosok.add(new Jatekos(nev));
        }


        List<Mezo> mezok = new ArrayList<>();
        mezok.add(new Mezo("Szerencse", "Léptél egyet előre!"));
        mezok.add(new Mezo("Buktató", "Visszafelé léptél két mezőt!"));
        mezok.add(new Mezo("Ajándék", "Kapsz 5 pontot!"));
        mezok.add(new Mezo("Csapda", "Visszaléptél három lépést!"));
        mezok.add(new Mezo("Bónusz", "Lépsz egyet előre és kapsz 10 pontot!"));


        
    }
}
