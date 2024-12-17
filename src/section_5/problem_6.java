package section_5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class problem_6 {

    /*
    N명의 왕자가 1번 왕자부터 1부터 번호를 외치는데
    특정 번호 K를 외치는 왕자는 해당 배열에서 제외되고,
    그 번호 이후에 1부터 다시 외치기 시작한다.
    1번부터 N까지 순서대로 호출 번호만 a라는 변수로 두고
    a 변수가 K에 해당하지 않는다면, Queue 자료형에 넣고
    해당 한다면 Queue 에 넣지 않고, a를 0으로 초기화 시키면 될거 같다.
    그리고 만약 처음 번호를 다 돌았다면 Queue 의 요소들을 하나씩 꺼내면서
    같은 연산을 수행하면 될거 같은데 코드 구현방법을 잘 모르겠다.
    */
    public int my_solution(int N,int K){
        int answer=0;
        int i=0;
        int cnt=N,a=0;
        Queue<Integer> queue=new ArrayDeque<>();
        while(cnt!=0){
            a++;
            i++;
            if(a==K){
                a=0;
                cnt--;
            }
            else if(i<N){
                queue.offer(i);
            }else{

            }
        }
        answer=queue.element();
        return answer;
    }

    /*

    */
    public int solution(int N,int K){
        int cnt=0;

        return cnt;
    }

    public static void main(String[] args) {
        problem_6 T= new problem_6();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        System.out.println(T.my_solution(N,K));
        //System.out.println(T.solution(N,k));
    }
}
