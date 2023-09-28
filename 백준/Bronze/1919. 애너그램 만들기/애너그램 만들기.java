import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int[] countA = new int[26];
        int[] countB = new int[26];
    for(int i=0; i<str.length(); i++) {
         countA[str.charAt(i)-'a'] += +1;
    }
        for(int i=0; i<str1.length(); i++) {
            countB[str1.charAt(i)-'a'] += +1;
        }

            int ans = 0;
        for(int i=0; i<countA.length; i++) {
            ans = ans + Math.abs(countA[i] - countB[i]);
                }





        System.out.println(ans);


    }
}