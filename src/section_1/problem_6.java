package section_1;

import java.util.*;

public class problem_6 {

    public String my_solution(String str){
        String answer="";
        char[] chararr=str.toCharArray();
        List<Character> charlist=new ArrayList<>();
        int i=0,j=0;
        do{
            if(!charlist.isEmpty()) {
                for (j = 0; j < i; j++) {
                    if (charlist.get(j) == chararr[i]) {
                        break;
                    }
                    if (j == i - 1) {
                        charlist.add(chararr[i]);
                    }
                }
            }else{
                charlist.add(chararr[i]);
            }
            i++;
        }while (i<chararr.length);
        answer=charlist.toArray().toString();
        return answer;
    }


    public String solution(String str){
        String answer="";

        return answer;
    }


    public static void main(String[] args) {
        problem_6 T= new problem_6();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.my_solution(str));


    }
}
