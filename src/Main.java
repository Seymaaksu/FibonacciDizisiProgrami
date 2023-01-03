import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number,firstTerm=0, secondTerm=1;
        System.out.print("Sayıyı giriniz: "); number=inp.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(firstTerm+ " ");
            int nextTerm= firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}