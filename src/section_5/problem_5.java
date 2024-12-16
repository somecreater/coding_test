package section_5;

import java.util.Scanner;
import java.util.Stack;

public class problem_5 {

    /*
    문자열을 입력 받는다.
    문자를 하나씩 읽어 오면서 '(', ')' 인 경우 별로 앞뒤의 문자까지  생각해서 레이저 여부와 막대기의 끝 부분을 구별한다.
    만약 '(' 를 읽어 왔는데 다음 문자가 '(' 면 막대기의 시작 부분이고, ')' 라면 레이저 이다.
    그리고 만약 ')' 를 읽어 왔는데 그 전 문자가 ')' 면 막대기의 끝 부분이고, '(' 라면 레이저 이다.
    막대기의 시작 부분이 추가 될때마다 answer 와 numstack 을 1 씩 더하고
    레이저가 확인 될때마다 answer 에 numstack 만큼 더한다. 그리고 막대기의 끝 부분을 확인하면 numstack 에서 1을 뺀다.
    이런식으로 구할 수 있다.
    */
    public int my_solution(String str){
        int answer=0;
        int numstack=0;
        char[] charr=str.toCharArray();
        Stack<Character> strstack1=new Stack<>();
        for(int i=0;i<charr.length;i++){
            char ch=charr[i];
            char ch2='N';

            if(ch==')' && i>0){
                ch2=charr[i-1];
                if(ch2==')') {
                    numstack -= 1;
                }else{
                    answer+=numstack;
                }

                strstack1.push(ch);
            }else if(ch=='(' && i<charr.length-1){
                ch2=charr[i+1];
                if (ch2=='(') {
                    answer+=1;
                    numstack+=1;
                }
                strstack1.push(ch);
            }
        }


        return answer;
    }

    /*
    스택을 이용하자
    여는 괄호를 만나면 push 한다.
    닫는 괄호를 만나면 레이저를 말하는 건지, 쇠막대기의 끝을 알리는 괄호인지
    알아야 한다. 바로 앞의 것을 확인하면 된다. 만약 여는 괄호면 레이저, 아니면 막대기 끝이다.
    레이저로 판단되면 stack 에서 여는 괄호를 pop 시키고 남은 여는 괄호 수 만큼 answer 에 누적 시킨다.
    만약 막대기 끝이라고 판단되면, 이제 레이저 영향 안받는다. stack 에서 여는 괄호를 pop 시키고 answer 에 1을 더한다.
    */
    public int solution(String str){
        int cnt=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1)=='(') cnt+=stack.size();
                else cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //System.out.println(T.my_solution(str));
        System.out.println(T.solution(str));
    }
}
