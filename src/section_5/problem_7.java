package section_5;

import java.util.*;

public class problem_7 {

    /*
    문자열 두개를 입력 받는다.
    일단 필수 교육과정에 해당하는 문자열을 큐에 넣고
    들으려는 교육과정에서 문자를 하나씩 추출하고 큐에서 하나씩 빼면서 검사한다
    만약 필수 교육과정에 포함되어 있고, peek 메소드로 추출한 요소와 일치한다면
    큐에서 poll 메소드를 수행하고,
    필수 교육과정에 포함되어 있지만 peek 메소드 메소드로 추출한 요소와 일치
    하지 않는다면, answer를 NO로 바꾸고 종료한다.
    만약 둘다 해당하지 않는다면 인덱스 i만 증가시키고 넘어간다.
    들으려는 교육과정을 다 읽어도 큐에 요소가 남아있디면, 이는 필수 교육과정을
    덜 들었다는 의미이므로 answer를 NO로 바꾸고 종료한다.
    */
    public String my_solution(String str1,String str2){
        String answer="YES";
        int i=0;
        char[] str1arr=str1.toCharArray();
        char[] str2arr=str2.toCharArray();
        Queue<Character> queue=new LinkedList<>();
        for(char s: str1arr){
            queue.offer(s);
        }

        while (!queue.isEmpty()){
            if(queue.size()>=1&&i==str2arr.length){
                answer="NO";
                break;
            }
            char c=str2arr[i];
            if(queue.contains(c)&&c==queue.peek()){
                queue.poll();
            }else if(queue.contains(c)&&c!=queue.peek()){
                answer="NO";
                break;
            }
            i++;
        }
        return answer;
    }

    /*
    문자열 두 개를 입력받고
    필수 과목은 큐에 저장한다(중복 없음)
    수업 계획을 하나씩 탐색한다
    큐에 있는지 먼저 확인한다.만약 있다면 큐의 맨 앞과 일치하는지 확인한다.
    위의 조건을 만족한다면 큐에서 사라지고 다음 문자를 읽는다.
    만족하지 않는다면 NO를 출력한다.
    큐에 해당 문자가 없다면, 그냥 넘어가고 다음 문자를 읽는다.
    큐가 비어 있다면 YES를 출력하면 된다. 만약 비어있지 않다면 전부 듣지 않은 것이므로
    NO를 출력해야 한다.
    */
    public String solution(String need, String plan){
        String answer="YES";
        Queue<Character> Q=new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        problem_7 T= new problem_7();
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        //System.out.println(T.my_solution(str1, str2));
        System.out.println(T.solution(str1,str2));
    }
}
