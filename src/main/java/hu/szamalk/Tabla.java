package hu.szamalk;

import java.util.Objects;

public class Tabla {
    private String [][] T;
    private char UresCella;

    public Tabla() {
        T = new String[][];
    }

    public Tabla(char uresCella) {
        elhelyez(UresCella);
    }

    public void elhelyez(char uresCella){
        switch (uresCella) {
            case 'Ures':
                T = new String[][]{
                        {"*", "*", "*", "*","*", "*", "*", "*"},
                        {"*", "*", "*", "*","*", "*", "*", "*"},
                        {"*", "*", "*", "*","*", "*", "*", "*"},
                        {"*", "*", "*", "*","*", "*", "*", "*"},
                        {"*", "*", "*", "*","*", "*", "*", "*"},
                        {"*", "*", "*", "*","*", "*", "*", "*"},
                        {"*", "*", "*", "*","*", "*", "*", "*"},
                        {"*", "*", "*", "*","*", "*", "*", "*"}
                };
            break;
            default:
                T = new String[][]{{" "}};
        }
    }
    public void megjelentit(char jel){
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                if (T[i][j].equals("*")){
                    System.out.println(jel);
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
