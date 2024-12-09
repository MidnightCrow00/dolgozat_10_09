package hu.szamalk;

public class Tabla {
    private char [][] T;
    private char UresCella;

    public Tabla() {
        T = new char[8][8];
    }

    public Tabla(char[][] t, char uresCella) {
        T = new char[UresCella][UresCella];
        UresCella = uresCella;
    }
}
