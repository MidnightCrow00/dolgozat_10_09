package hu.szamalk.jatekProgram;

public class Babu {
    private int ero;
    private String szint;

    public Babu(String szint) {
        this.szint = szint;
    }

    public Babu(int ero, String szint) {
        this.ero = 1;
        this.szint = szint;
    }

    public int getEro() {
        int max=9;
        for (int min = 1; min <= max; min++) {
            ero++;
        }
        return ero;
    }

    public String getSzint() {
        return szint;
    }
}
