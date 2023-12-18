import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan taban ve Üs değerini alıyoruz
        System.out.print("Taban sayısınız girin: ");
        int base = input.nextInt();
        System.out.print("Üs sayısını girin: ");
        int exponent = input.nextInt();
        // exponentiationdan gelen sonucu kullanıcıya bastırıyoruz
        System.out.println("Sonuç= " + exponentiation(base, exponent));
    }

    static int exponentiation(int base, int exponent){
        if(exponent == 0) return 1;
        //Recursive methodunun kullanıldığı satır
        else return base * exponentiation(base, exponent - 1);
    }
}