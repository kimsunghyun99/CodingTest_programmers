import java.util.HashSet;
import java.util.Iterator;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>(); //HashSet은 중복된 값을 허용하지 않는다, 순서가 보장되지 않는다.

    public void recursive1(String comb, String others){
        if(!comb.equals("")) numberSet.add(Integer.valueOf(comb));

        for(int i=0; i<others.length(); i++){
            recursive1(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1)); //substring(0,0)은 아무것도 나오지 않는다.
        }
    }
    public int solution(String numbers) {
        
        recursive1("",numbers);

        int cnt=0;
        numberSet.remove(0);
        numberSet.remove(1);

        Iterator it = numberSet.iterator();
    
        while(it.hasNext()){
            int val = Integer.parseInt(it.next().toString());
            int sqrt = (int)Math.sqrt(val);
            if(sqrt ==1) {
                cnt++;
            }
            System.out.println("val, sqrt: "+val+" "+sqrt);
            for(int i=2; i<= sqrt+1; i++ ){
                if(val%i==0) {break;} //소수가 아니야
                if(i==sqrt){cnt++; System.out.println( "tt");}//
            }
        }
        
        int answer = cnt;
        return answer;
    }
}