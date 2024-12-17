package section_5;

import java.util.*;

public class problem_8 {

    /*
    초기 순서와 값을 각각 큐에 저장한다.
    순서와 값을 poll 메소드로 하나씩 추출하면서 해당 값에 대해서
    큐에 더 큰값이 존재하는지 검사한다(위험도가 가장 높은지 여부).
    만약 더 큰값이 존재 하면 그냥 바로 큐에 offer 메소드로 해당 값들을 다시
    뒤에 삽입한다.
    존재하지 않으면 최우선 진료 대상이므로 주어진 M 값과 읽어온 순서를 비교한다.
    서로 같다면, break 를 걸고 answer 를 출력한다.
    서로 다르다면, 단순히 answer 를 1 증가시킨다.

    */
    public int my_solution(int N, int M, int[] arr){
        int answer=0;
        Queue<Integer> queue1=new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();
        for(int j=0;j<arr.length;j++){
            int arrele=arr[j];
            queue1.offer(arrele);
            queue2.offer(j);
        }

        while(true){
            boolean isPriority=true;
            int val=queue1.poll();
            int ord=queue2.poll();
            for(int remainval:queue1){
                if(remainval>val){
                    isPriority=false;
                    queue1.offer(val);
                    queue2.offer(ord);
                    break;
                }
            }

            if(isPriority&&ord==M){
                break;
            }else if(isPriority){
                answer++;
            }
        }
        answer++;
        return answer;
    }

    /*
    클래스 형(id(순서대로), 우선순위)으로 자료형을 잡아서 큐에 저장한다.
    하나씩 꺼내보면서 우선순위를 비교한다. 만약 우선순위가 적으면
    뒤에 추가하면 된다. 만약 우선순위가 가장 크고 주어진 M과
    아이디가 일치하지 않으면, 단순히 answer 만 1을 증가시킨다.
    서로 일치하면, answer를 1 증가시키고 리턴하면 된다.
    여기서 클래스를 사용한거 빼고는 논리구조는 비슷하다.
    */
    class Person{
        int id;
        int priority;
        public Person(int id, int priority){
            this.id=id;
            this.priority=priority;
        }
    }
    public int solution(int n, int m, int[] arr){
        int answer=0;
        Queue<Person> Q=new LinkedList<>();
        for(int i=0; i<n; i++){
            Q.offer(new Person(i, arr[i]));
        }
        while(!Q.isEmpty()){
            Person tmp=Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_8 T= new problem_8();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] arr=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println(T.my_solution(N, M, arr));
        System.out.println(T.solution(N, M, arr));
    }
}
