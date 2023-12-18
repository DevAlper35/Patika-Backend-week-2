import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan sayı alıyoruz
        System.out.print("Sayı girin: ");
        int number = input.nextInt();

        // isPrime methodundan gelen true / false değerine göre, kullanıcıya sonuç  bastırılıyor

        if(isPrime(number, number / 2))
            System.out.println(number + " asal sayı.");
        else
            System.out.println(number + " asal sayı değil.");
    }

    static boolean isPrime(int num, int divisor){

        if(num < 2) return false;
        else if(divisor == 1)
            return true;
        else
        {
            if(num % divisor == 0) return false;
            else
                //Recursive Methodunun kullanıldığı satır
                return isPrime(num, divisor - 1);
        }
    }
}