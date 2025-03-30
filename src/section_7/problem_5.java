package section_7;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_5 {

    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph =new ArrayList<ArrayList<Integer>>();
    static int[] ch;

    public void my_DFS(int v){
        if(v+1==n){
            answer++;
        }
        ArrayList<Integer> list= graph.get(v);
        for(int i=0;i<list.size();i++){
            //한번도 방문 안했으면 탐색 시작, 어짜피 경로만 입력되어서 이렇게 해도된다.
            if(ch[list.get(i)+1]==0){
                ch[list.get(i)+1]=1;
                my_DFS(list.get(i));
                ch[list.get(i)+1]=0;
            }
        }
    }

    /*
    여기서는 arraylist를 이용해서 풀었다. 차이점은 경로의 유무를 판단하지 않고(이미 존재하는 경로만 List에 들어간다)
    해당 경로의 방문여부만 확인한다는 것이다.
    */
    public void DFS(int v){

        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        problem_5 T=new problem_5();
        Scanner kb=new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();

        /*
        ch=new int[n+1];

        for(int j=0; j<n; j++){
            graphs.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();

            graphs.get(a-1).add(b-1);
        }

        ch[1]=1;
        T.my_DFS(0);
        System.out.println(answer);
        */

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
