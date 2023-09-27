class Solution {
    public String solution(int age) {
        String answer1 = age + "";
        String answer = "";
        char[] c = new char[answer1.length()];
        for(int i=0; i<c.length; i++) {
            c[i] = answer1.charAt(i);
        }
        
        for(int i=0; i<c.length; i++) {
            switch(c[i]) {
                
                case '0':  
                    c[i] = 'a';
                    break;
                    case '1':  
                    c[i] = 'b';
                    break;
                    case '2':  
                    c[i] = 'c';
                    break;
                    case '3':  
                    c[i] = 'd';
                    break;
                    case '4':  
                    c[i] = 'e';
                    break;
                    case '5':  
                    c[i] = 'f';
                    break;
                    case '6':  
                    c[i] = 'g';
                    break;
                    case '7':  
                    c[i] = 'h';
                    break;
                    case '8':  
                    c[i] = 'i';
                    break;
                    case '9':  
                    c[i] = 'j';
                    break;
                       
        }
        }
       for(int i=0; i<c.length; i++) {
           answer = answer + c[i];
       }
        
        return answer;
    }
}