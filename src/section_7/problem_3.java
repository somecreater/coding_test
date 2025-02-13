package section_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem_3 {

    /*
    입력: 첫줄=방향 그래프 정점 수, 간선 수, 다음줄= 연결 정보들
    출력: N번 정점으로 가는 총 가지수

    */
    Queue<grap> list=new LinkedList<>();
    public void my_solution(int N,int M, int[][] link){
        grap root=new grap(N);
        int answer=0;
        list.offer(root);
        while(!list.isEmpty()){

            int len=list.size();

            for(int i=0;i<len;i++) {
                grap current=list.poll();

                //current의 cur 도달할 수 있는 노드들을 q에 추가한다
                for (int j = 0; j < link.length; j++) {
                    if (current.cur == link[j][1]) {
                        grap add = new grap(link[j][0]);
                        add.front= current.cur;

                        //만약 cur에 도달할 수 있는 노드의 값이 1이면 정답이다
                        if(link[j][0]==1){
                            answer++;
                        }

                        /*
                        만약 현재 노드의 도달값과 추가하려는 현재의 값이 같다면
                        추가하지 말아야한다
                        */
                        else if(current.front!=add.cur){
                            list.add(add);
                        }
                    }
                }

            }
        }
        
        System.out.println("총 경로의 수는 "+answer+"개 입니다");
    }

    public void solution(){

    }

    public static void main(String[] args) {
        problem_3 T=new problem_3();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr=new int[M][2];

        for(int i=0;i<M;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            arr[i][0]=x;
            arr[i][1]=y;
        }

        T.my_solution(N,M,arr);
    }
}

class grap{
    public int front;
    public int cur;
    public grap(int x){
        cur=x;
        front=0;
    }
}