import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        String a = "";
        for(int i=0; i<my_string.length(); i++ ) {
            char ch = my_string.charAt(i);
            if(ch >= 48 && ch<=57) {
                a = a + ch;
            }
        }
        char c[] = a.toCharArray();
        for(int i=0; i<c.length; i++) {
            list.add(Character.getNumericValue(c[i]));
        }
        
   
        int[]numbers= new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            numbers[i] = list.get(i);
        }
          Arrays.sort(numbers);
        return numbers;
    }
}