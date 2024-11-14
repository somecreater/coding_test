package section_1;

import java.util.Scanner;
import java.util.Set;

public class problem_11 {

    /*
        단어를 입력으로 받아서 문자를 하나씩 읽어가면서,
        첫 시행 여부, 새로운 문자와 그 전 문자의 동일 여부,
        정답의 마지막 문자의 숫자 여부 확인으로
        같은 문자가 3개 이상 등장 여부 검사를 통해
        정답을 구성한다.
    */
    public String my_solution(String str){
        String answer="";
        int k=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0){
                answer+=c;
            }else if(str.charAt(i-1)!=c){
                answer+=c;
            }else if(str.charAt(i-1)==c &&
                    !Character.isDigit(answer.charAt(answer.length()-1))){
                answer+='2';
            }else{
                int num=Integer.parseInt(answer.substring(answer.length()-1));
                answer=answer.substring(0,answer.length()-1);
                answer+=(num+1);
            }
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
        problem_11 T= new problem_11();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(T.my_solution(str));

    }
}
