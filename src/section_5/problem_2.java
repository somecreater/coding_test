package section_5;

import java.util.Scanner;
import java.util.Stack;

public class problem_2 {

    /*
    이것도 스택 방식을 이용하면 될것 같지만
    잘 모르겠다.
    */
    public String my_solution(String str){
        StringBuilder answerbuilder=new StringBuilder(str);
        String answer=str;
        char[] charr=str.toCharArray();
        Stack<Integer> strarr1=new Stack<>();
        Stack<Integer> strarr2=new Stack<>();
        for(int i=0;i<charr.length;i++){
            char c=charr[i];
            if(c=='('){
                if(strarr1.peek()>i) {
                    strarr1.push(i);
                }
            }else if(c==')'){

                if(!strarr1.isEmpty()){
                    int x=strarr1.pop();
                    //인덱스 x 부터, i까지의 문자열 제거
                    //문제는 문자열이 갱신되면서 각각의 인덱스도 바뀐다는 것이다.
                    System.out.println(x+" "+i+" "+answer.substring(x,i+1));

                    if(x>0) {
                        String substr1 = str.substring(0,x+1);
                        String substr2 = str.substring(i,answer.length());
                        answer=substr1+substr2;
                    }else{
                        answer=answer.substring(i,answer.length());
                    }
                }
            }else{
                answer+=c;
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
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.my_solution(str));
    }
}
