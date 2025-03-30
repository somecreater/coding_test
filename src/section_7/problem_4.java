package section_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem_4 {

    public void my_solution(int N,int M, int[][] link){


    }

    /*
        DFS 방법을 활용하여 푼다 for문으로 연결된 노드들을 하나씩 방문한다.
        재귀함수는 항상 방문한 노드들을 체크해 줘야한다, ch 배열을 활용하자(0,1,2,..)(방문한 노드 체크)
        즉 for문으로 1번 정점부터 방문하고 방문하려는 노드에 실제로 경로가 존재하면 해당 노드로 넘어가고 해당 노드에 대해 체크를 한다.
        해당 노드도 똑같이 for문으로 연결된 노드를 하나씩 방문하지만 만약 방문하려는 노드에 대해 체크가 되어 있다면(즉 경로상에서 이미 한번 갔었다.)
        방문하면 안된다. 해당 노드에 대한 경로 탐색이 끝나면 ch 배열에서 해당 노드에 대한 체크를 푼다(0으로 변경)
        if로 종착점 여부를 확인하고 종착점이면 카운팅한다.
    */
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                //실제 경로 여부 확인 및 방문 여부 확인
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        problem_4 T=new problem_4();
        Scanner kb=new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];

        //그래프 입력
        for(int i=0;i<m;i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        //1번 노드 부터 방문
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
