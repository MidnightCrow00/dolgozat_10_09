package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Tabla t = new Tabla('K');
        for (int i = 0; i < 2; i++) {
            t.megjelenit('K');
            System.out.println(" ");
        }
        System.out.println("Üres oszlopok száma:"+t.getUresOszlop());
        System.out.println("Üres sorok száma:"+t.getUresSor());
    // F2

    }
}