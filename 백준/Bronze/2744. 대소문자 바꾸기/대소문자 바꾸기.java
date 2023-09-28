import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        for(int i=0; i<A.length(); i++) {

            if(A.charAt(i) >='A' && A.charAt(i) <='Z') {
                System.out.print((char)('a' + A.charAt(i) - 'A'));
            }
            else if(A.charAt(i) >='a' && A.charAt(i) <='z') {
                System.out.print((char)('A'+ A.charAt(i) - 'a'));
            }
        }


    }
}