package section_1;

import java.util.Scanner;

public class problem_5 {

    public String my_solution(String str){
        String answer="";
        char[] charr=str.toCharArray();
        int fr=0;
        int ba=charr.length-1;
        //어떻게 푸는 지 모르겠다.
        while(fr<ba){

        }


        return answer;
    }


    /*
    이것은 Character 라이브러리의 isAlphabetic 메소드를 활용해서 알파벳 여부를 판단하고
    서로 알파벳이 아닌 경우만 그냥 서로 문자의 위치를 바꾸지 않고 앞뒤로 인덱스만 각각 이동하는 방식으로
    풀었다.
     */

    public String solution(String str){
        String answer;
        char[] s=str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }


    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);
        /*
        String answer="";
        String str=sc.next();

        answer = T.my_solution(str);
        System.out.println(answer);
        */
        String str=sc.next();
        System.out.println(T.solution(str));


    }
}
