package hu.szamalk;

import java.util.Arrays;
import java.util.Objects;

public class Tabla {
    private char T [][];
    private char UresCella;

    public Tabla(char[][] T) {
        this.T = new char[8][8];
    }

    public Tabla(char uresCella) {
        elhelyez(uresCella);
    }
    public void elhelyez(char N){
        switch (N){
            case 'K':
                T = new char[][]{
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '}
                };
                break;
            case ' ':
                T = new char[][]{
                        {' ','*','*','*','*','*','*',' '},
                        {'*',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ','*',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ','*',' ',' ',' ',' ',' '},
                        {' ',' ','*',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '},
                        {' ',' ',' ',' ',' ',' ',' ',' '}
                };
                break;
            default:
                T = new char[][]{{' '}};
        }
    }
    public void megjelenit(char jel){
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                if (Objects.equals(T[i][j], "*")) {
                    System.out.print(jel);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }

public int getUresSor() {
    int össz = 0;
    for (char[] sor : T) {
        boolean ures = true;
        for (char elem : sor) {
            if (Objects.equals(elem, "*")) {
                ures = false;
                break;
            }
        }
        if (ures) {
            össz++;
        }
    }
    return össz;
}
    public int getUresOszlop(){
        int össz = 0;
        int oszlopokSzama = getUresOszlop();

        for (int j = 0; j < oszlopokSzama; j++) {
            boolean ures = true;
            for (int i = 0; i < getUresSor(); i++) {
                if (Objects.equals(T[i][j], "*")) {
                    ures = false;
                    break;
                }
            }
            if (ures) {
                össz++;
            }
        }
        return össz;
    }

    @Override
    public String toString() {
        return "Tabla{" +
                "T=" + Arrays.toString(T) +
                ", UresCella=" + UresCella +
                '}';
    }
}

