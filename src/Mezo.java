public class Mezo {
    private String nev;
    private String hatas;

    public Mezo(String nev, String hatas) {
        setNev(nev);
        setHatas(hatas);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getHatas() {
        return hatas;
    }

    public void setHatas(String hatas) {
        this.hatas = hatas;
    }

    @Override
    public String toString() {
        return getNev() + ": " + getHatas();
    }
}
