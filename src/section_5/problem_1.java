package section_5;

import java.util.Scanner;
import java.util.Stack;

public class problem_1 {

    /*
    괄호 문자열을 입력받고 올바른 괄호면 YES 아니면 NO를 출력하도록하는 문제이다.
    이를 위해서 Stack<Character> 자료형을 활용한다.
    입력된 문자열을 Character 의 배열로 변환하고 하나씩 검사한다.
    만약 '(' 를 만나면 해당 자료형에 push 하다가 ')'를 만나면,
    해당 자료형이 비었는지 그리고 top 에 있는 요소가 '(' 인지 확인하고,
    만약 충족하면 '(' 과 ')'를 함께 없앤다고 생각하면서 pop 연산을 수행한다.
    충족하지 않으면 ')' 만 추가되고 있거나, 텅 비어있다는 의미이므로 break 걸고
    NO를 출력하면 된다.
    연산이 전부 끝나고 해당 자료형이 비었으면 올바른 괄호라고 판단한다.
    */
    public String my_solution(String str){
        String answer="YES";
        char[] strcharr=str.toCharArray();
        Stack<Character> strstack=new Stack<>();
        for(char c:strcharr){
            if(c=='('){
                strstack.push(c);
            }else{
                if(!strstack.isEmpty()&&strstack.peek()=='(') {
                    strstack.pop();
                }else{
                    answer="NO";
                    break;
                }

            }
        }
        if(!strstack.isEmpty()){
            answer="NO";
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
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.my_solution(str));
    }
}
