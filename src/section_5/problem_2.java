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
    문자열로 입력받고,
    각각 문자를 Stack<Character> 에 입력받는다.
    여는 괄호를 만나도 계속 저장하다가, 만약 닫는 괄호를 만난다면,
    제일 위쪽에 있는 여는 괄호와 닫는 괄호사이의 문자를 제거하는 것(pop 메소드를 이용한다)
    을 반복하면 된다.
    최종적인 Stack 자료형에 대해, get 메소드나, for문으로 가져오든해서
    답을 구할 수 있다.
    */
    public String solution(String str){
        String answer="";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            if(x==')'){
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //System.out.println(T.my_solution(str));
        System.out.println(T.solution(str));
    }
}
