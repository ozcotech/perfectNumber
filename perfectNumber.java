import java.util.Scanner;

/**
 * perfectNumber
 */
public class perfectNumber {

  public static void main(String[] args) {
    Scanner taken = new Scanner(System.in);
    int perfectN;
    int total = 0, i = 1;
    System.out.print("Bir sayı giriniz: ");
    perfectN = taken.nextInt();
    while (i < perfectN){
      if (perfectN % i == 0){
        total += i; // total'a 0 değil de 1 verirsek mükemmel sayıyı yanlış buluruz.
      }
      
      i++;
    }
    if (perfectN == total){
      System.out.println(perfectN + " mükemmel sayıdır.");
    }
    else {
      System.out.println(perfectN + " mükemmel sayı değildir.");
    }

    taken.close();
  }
}