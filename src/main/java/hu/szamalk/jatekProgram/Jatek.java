package hu.szamalk.jatekProgram;

public abstract class Jatek{
    private static int jatekDb;

    public int getJatekDb() {
        for (int i = 0; i < 10; i++) {
            jatekDb++;
        }
        return jatekDb;
    }

    public void kezd(){

    }
    public void ment(){

    }
    public void vege(){

    }
}
