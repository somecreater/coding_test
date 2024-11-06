package section_1;

import java.util.Scanner;

public class problem_2 {

    public char[] my_solution(String str){
        char[] answer=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                answer[i]=Character.toLowerCase(c);
            }else{
                answer[i]=Character.toUpperCase(c);
            }
        }
        return answer;
    }

    public String solution(String str){
        String answer="";

        /*
        //char 배열로 변경하고 직접 확인하여 풀이
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);

        }*/

        //아스키 코드를 이용해서 풀이(형변환 반드시 필요), 대문자: 65~90
        for(char x : str.toCharArray()){
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
        }

        return answer;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);

        /*
        String str=sc.next();
        String answer=new String(T.my_solution(str));
        */

        String str=sc.next();
        String answer=T.solution(str);
        System.out.println(answer);
    }
}
