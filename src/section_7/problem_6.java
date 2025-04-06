package section_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem_6 {

  /*
  이거는 ArrayList로 그래프를 표현해서 풀 수 있다.
  dis 배열에는 최소 간선 수를 저장해서 계속 업데이트 시키자
  다음 정점까지의 거리는 dis[nv]=dis[v]+1 이런식으로 구하면 된다.
  */
  static int N, M, answer = 0;
  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch, dis;
  public void BFS(int v){
    ch[v]=1;
    dis[v]=0;
    Queue<Integer> queue=new LinkedList<>();
    queue.offer(v);
    while(!queue.isEmpty()){
      int cv= queue.poll();
      for(int nv:graph.get(cv)){
        if(nv==0){
          ch[nv]=1;
          queue.offer(nv);
          dis[nv]=dis[cv]+1;
        }
      }
    }
  }

  public static void main(String[] args) {
    problem_6 T=new problem_6();
    Scanner kb = new Scanner(System.in);

    N= kb.nextInt();
    M= kb.nextInt();

    for(int i=0;i<=N;i++){
      graph.add(new ArrayList<Integer>());
    }

    ch=new int[N+1];
    dis=new int[N+1];

    for(int i=0;i<M;i++){
      int a=kb.nextInt();
      int b=kb.nextInt();
      graph.get(a).add(b);
    }
    T.BFS(1);

    for(int i=2;i<=N;i++){
      System.out.println(i+" : "+dis[i]);
    }
  }

}
