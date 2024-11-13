package section_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_8 {

    /*
    문장 단위로 입력을 받는다.
    모두 대문자로 변환해서 대소문자 구별을 없애고, String 클래스의
    toCharArray 메소드를 활용해서 Char 배열로 변환하고 나서,
    Character 클래스의 isAlphabetic 메소드로 알파벳여부를 구별해서
    알파벳으로만 구성된 문장으로 변환하고, StringBuilder 클래스의
    reverse 메소드로 뒤집어진 문장을 구해서 뒤집기 전의 문장과 서로 비교하면
    팰린드롬 여부를 판단할 수 있다.
    */
    public String my_solution(String str){
        String answer="";
        char[] orgstr=str.toUpperCase().toCharArray();
        String alpstr="";
        for(int i=0;i<orgstr.length;i++)
        {
            if(Character.isAlphabetic(orgstr[i])){
                alpstr+=orgstr[i];
            }
        }
        StringBuilder builder=new StringBuilder(alpstr);
        String alpreversestr=builder.reverse().toString();
        //System.out.println(alpstr);
        //System.out.println(alpreversestr);
        if(alpstr.compareTo(alpreversestr)==0){
            answer="YES";
        }
        return answer;
    }

    /*

    */
    public String solution(String str){

        String answer="NO";

        return answer;
    }


    public static void main(String[] args) {
        problem_8 T= new problem_8();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(T.my_solution(str));

    }
}
