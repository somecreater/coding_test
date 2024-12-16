package section_5;

import java.util.Scanner;
import java.util.Stack;

public class problem_4 {

    /*
    문자열로 입력 받고 char 의 배열로 변환 시킨다.
    스택에 숫자를 하나씩 넣고, 만약 연산자를 만나면
    가장 위의 숫자와 그 아래 숫자를 각각 스택에서 꺼내고
    해당 연산을 수행한다. 그리고 결과 값을 스택에 집어 넣는다.
    이러한 연산을 반복하면 정답을 구할 수 있다.
    */
    public int my_solution(String str){
        int answer=0;
        char[] charr=str.toCharArray();
        Stack<Integer> intstack=new Stack<>();
        for(int i=0;i<charr.length;i++){
            char item=charr[i];
            if(!intstack.isEmpty()&&!Character.isDigit(item)){
                int topitem=intstack.pop();
                int borrowitem=intstack.pop();
                int newitem=0;
                switch (item){
                    case '+':
                        newitem=borrowitem+topitem;
                        intstack.push(newitem);
                        break;
                    case '-':
                        newitem=borrowitem-topitem;
                        intstack.push(newitem);
                        break;
                    case '*':
                        newitem=borrowitem*topitem;
                        intstack.push(newitem);
                        break;
                    case '/':
                        newitem=borrowitem/topitem;
                        intstack.push(newitem);
                        break;
                }
            }else{
                intstack.push(Integer.parseInt(String.valueOf(item)));
            }
        }
        answer=intstack.pop();
        return answer;
    }

    /*
    후위식: 5-3 -> 53-
    즉 숫자면 push 하고 연산자를 만나면 스택에서 top 과 top-1의 스택값을 꺼내서
    연산하고 나서 결과값을 스택에 넣는 방식으로 계산하면 된다.
    계산이 끝나면 숫자 하나만 남는다.
    */
    public int solution(String str){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }
            else{
                int rt=stack.pop();
                int lt=stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        answer=stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //System.out.println(T.my_solution(str));
        System.out.println(T.solution(str));
    }
}
