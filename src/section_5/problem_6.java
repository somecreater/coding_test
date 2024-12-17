package section_5;

import java.util.ArrayDeque;
import java.util.LinkedList;
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
    큐는 선입선출의 구조이다.(한쪽으로는 들어가고 한쪽으로 나온다)
    offer 메소드로 넣고, poll 메소드로 꺼낸다. peek 메소드는 제일 앞의 값만
    확인한다.
    contains 메소드는 특정 요소의 포함여부를 확인할때 사용한다.

    1 번부터 N 번까지 큐에 넣는다. 그리고 poll 메소드로 큐에서 빼고 큐에 다시
    offer로 뒤에 집어 넣는다. 만약 k에 해당하는 번호를 외치는 순간, 그냥 poll 메소드만
    사용하고 넣지는 않는다. 이런식으로 하면 최종적으로 하나만(size 가 1일 때) 남는다.
    */
    public int solution(int n,int k){
        int answer=0;
        Queue<Integer> Q=new LinkedList<>();
        for(int i=1; i<=n; i++) Q.offer(i);
        while(!Q.isEmpty()){
            for(int i=1; i<k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size()==1) answer=Q.poll();
        }
        return answer;
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
