public class Main {
    public static void main(String[] args) {

        Fight furkan = new Fight("Hasan", 15, 100, 90, 10);
        Fight hasan = new Fight("Alper", 15, 100, 100, 10);
        Ring r = new Ring(furkan, hasan, 90, 100);
        r.run();
    }
}