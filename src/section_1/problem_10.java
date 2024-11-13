package section_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_10 {

    /*
    풀이하는 중
    */
    public String my_solution(String str,String charstr){
        String answer="";
        int[] intanswer=new int[str.length()];
        char charword=charstr.charAt(0);
        char[] chararr=str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(chararr[i]==charword){
                intanswer[i]=0;
            }
        }
        for(int j=0;j<str.length();j++){

        }

        return answer;
    }

    /*

    */
    public String solution(String str){
        String answer="";

        return answer;
    }


    public static void main(String[] args) {
        problem_10 T= new problem_10();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String charstr=sc.next();
        System.out.println(T.my_solution(str,charstr));

    }
}
