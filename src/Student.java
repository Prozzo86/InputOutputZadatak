public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;

    public Student() {
    }

    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    @Override
    public String toString() {
        return "Student/studentica - " + "ime: " + ime + ", prezime: " + prezime + ", broj indeksa: " + brojIndeksa;
    }
}
