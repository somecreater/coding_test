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

    */
    public int solution(String str){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.my_solution(str));
        //System.out.println(T.solution(str));
    }
}
