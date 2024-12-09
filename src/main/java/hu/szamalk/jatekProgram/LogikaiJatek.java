package hu.szamalk.jatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private int [][] Babu;
    private int [] sorrend;
    private int babuDb;

    public LogikaiJatek() {
        Babu = new int[4][5];
        sorrend= new int[10];
        this.babuDb= 3;
    }

    public LogikaiJatek(int babuDb) {
        this.babuDb=babuDb;
    }

    public boolean van8FelettEro(){
            return false;
    }

    public void kezd(){
        System.out.println("Kezdés,bábuk száma:"+babuDb);
    }
    public void ment(){
        System.out.println("Mentés");

    }
    public void vege(){
        for (int i = 0; i < 7 ; i++) {
                    babuDb++;
        }
        System.out.println("Vége, bábuk száma:"+babuDb);


    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "Babu=" + Arrays.toString(Babu) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
