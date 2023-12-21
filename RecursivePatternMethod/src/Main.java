import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int n = input.nextInt();
        recursiveMethod(n);
        input.close();
    }
    static void recursiveMethod(int originalN) {
        recursiveHelper(originalN, originalN);
    }
    static void recursiveHelper(int originalN, int currentN) {
        System.out.print(currentN + " ");
        // Recursive çağrı
        if (currentN > 0)
            // Sayı pozitif olduğu sürece
            recursiveHelper(originalN, currentN - 5);
        else
            // Sayı negatif veya 0 olduğunda
            recursiveAddition(originalN, currentN + 5);

    }

    static void recursiveAddition(int originalN, int currentN) {
        System.out.print( currentN + " ");

        // Recursive çağrı
        if (currentN < originalN) {
            // Sayı başlangıç değerine eşit veya daha küçük olduğu sürece ekleme işlemine devam et
            recursiveAddition(originalN, currentN + 5);
        }
    }
}