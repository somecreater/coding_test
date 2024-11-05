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
        String answer=new String();

        return answer;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        String answer=new String(T.my_solution(str));
        System.out.println(answer);
    }
}
