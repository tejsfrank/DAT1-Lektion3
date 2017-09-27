public class Metoder {

    public static void main(String[] args) {

        helloWorld(); // Statiske metoder kan kaldes uden instantiering af klassen

        Metoder m = new Metoder(); // Class methods kan kun køres på en instans af klassen

        m.hello("András");

        int resultat;
        resultat = m.add(1, 2);
        System.out.println("Resultatet er " + resultat);

    }

    private int add(int a, int b) {
        return a + b;
    }

    public void hello(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

}
