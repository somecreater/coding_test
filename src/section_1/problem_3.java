package section_1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_3 {

    public String my_solution(String str){
        String answer="";
        int length=0;
        StringTokenizer st=new StringTokenizer(str," ");

        while (st.hasMoreElements()) {

            String word=st.nextToken();
            if(word.length()>length){
                length=word.length();
                answer=word;
            }
        }

        return answer;
    }

    public String solution(String str){
        String answer="";

        return answer;
    }

    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String answer=T.my_solution(str);

        System.out.println(answer);
    }
}
