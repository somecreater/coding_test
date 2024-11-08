package section_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_4 {

    public String my_solution(String str){
        String answer="";
        StringBuilder builder=new StringBuilder(str);
        answer=builder.reverse().substring(0);

        return answer;
    }

    public String solution(String str){
        String answer="";

        return answer;
    }

    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String strarr="";
        String[] stranswer=new String[N];

        for(int i=0;i<N;i++) {
            strarr = sc.next();
            stranswer[i] = T.my_solution(strarr);
        }
        for(int j=0;j<N;j++){
            System.out.println(stranswer[j]);
        }
    }
}
