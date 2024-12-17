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

    */
    public String solution(String str1,String str2){
        String answer="";

        return answer;
    }

    public static void main(String[] args) {
        problem_7 T= new problem_7();
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2 =sc.next();
        System.out.println(T.my_solution(str1, str2));
        //System.out.println(T.solution(N,k));
    }
}
