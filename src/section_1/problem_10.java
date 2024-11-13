package section_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_10 {

    /*
    일단 문장과 문자를 입력으로 받고, 해당 문장을 String 클래스의
    replaceAll 메소드를 활용해서 0으로 변환하고
    split 메소드를 활용해서 원래 문장을 나누고 나서, 나눠진 단어들을
    거리로 변환하려고 했지만 실패했다.
    */
    public String my_solution(String str,String charstr){
        String answer="";
        int[] intanswer=new int[str.length()];
        String orgstr=str.replace(charstr,"0");
        String[] orgstrarr=orgstr.split("0");
        if(orgstr.indexOf("0")!=0){

        }else{

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
