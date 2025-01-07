public class Jatekos {
    private String nev;
    private int hely;
    private int pont;

    public Jatekos(String nev) {
        setNev(nev);
        setHely(0);
        setPont(0);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getHely() {
        return hely;
    }

    public void setHely(int hely) {
        this.hely = hely;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    public void lep(int lepes) {
        setHely(getHely()+lepes);
    }

    public void hozzaadPont(int pont) {
        setPont(getPont()+pont);
    }
}
