import java.util.Scanner;

/**
 * perfectNumber
 */
public class perfectNumber {

  public static void main(String[] args) {
    Scanner taken = new Scanner(System.in);
    int sayi;
    int total = 0, i = 1;
    System.out.print("Bir sayı giriniz: ");
    sayi = taken.nextInt();
    while (i < sayi){
      if (sayi % i == 0){
        total += i; // total'a 0 değil de 1 verirsek mükemmel sayıyı yanlış buluruz.
      }
      
      i++;
    }
    if (sayi == total){
      System.out.println(sayi + " mükemmel sayıdır.");
    }
    else {
      System.out.println(sayi + " mükemmel sayı değildir.");
    }

    taken.close();
  }
}