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


        int kor = 1;
        while (true) {
            System.out.println("\nKör " + kor);
            for (Jatekos jatekos : jatekosok) {
                System.out.println(jatekos.getNev() + " következik!");
                int lepes = random.nextInt(6) + 1;
                System.out.println(jatekos.getNev() + " dobott: " + lepes);


                jatekos.lep(lepes);
                int mezoszam = jatekos.getHely() % mezok.size();
                Mezo mez = mezok.get(mezoszam);
                System.out.println(jatekos.getNev() + " a " + mez.getNev() + " mezőre lépett. " + mez.getHatas());

                if (mez.getHatas().contains("két mezőt")) {
                    jatekos.lep(-2);
                } else if (mez.getHatas().contains("három lépést")) {
                    jatekos.lep(-3);
                } else if (mez.getHatas().contains("5 pontot")) {
                    jatekos.hozzaadPont(5);
                } else if (mez.getHatas().contains("10 pontot")) {
                    jatekos.hozzaadPont(10);
                }

                System.out.println(jatekos.getNev() + " jelenlegi helye: " + jatekos.getHely() + " és pontja: " + jatekos.getPont());
            }

            for (Jatekos jatekos : jatekosok) {
                if (jatekos.getHely() >= 30) {
                    System.out.println(jatekos.getNev() + " nyert! Összegyűjtött pontok: " + jatekos.getPont());
                    return;
                }
            }
            System.out.println("\nNyomd meg az enter-t a folytatáshoz!");
            scanner.nextLine();
            kor++;
            System.out.println("A játéknak vége");
        }
    }
}
