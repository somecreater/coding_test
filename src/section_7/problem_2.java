package section_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem_2 {

    /*
        말단 노드까지의 가장 짧은 경로를 구해보았다.
        노드를 클래스로 따로 구현하였으며,
        일반 노드를 저장할 큐와 일반 노드들의 잎들을 저장할 큐를 이용한다
        레벨 별로 노드들을 큐에 추가하면서 잎의 유무를 검사하고 없다면 while문을 종료 시키고
        있다면 앞사귀 큐에 추가하고 나중에 일반 큐가 끝나면 잎사귀 큐를 일반 큐에
        추가하는 식으로 풀면 될 거 같다.
    */
    Queue<Node> nodelist=new LinkedList<>();
    Queue<Node> nodelist2=new LinkedList<>();
    public void my_solution_1(Node node){
        nodelist.offer(node);
        int num=0;
        while(!nodelist.isEmpty()){
            int len=nodelist.size();
            for(int i=0;i<len;i++){
                Node cur=nodelist.poll();
                if(cur.lt==null&&cur.rt==null){
                    System.out.println(num);
                    return;
                }else if(cur.lt!=null&&cur.rt==null){
                    nodelist2.offer(cur.lt);
                }else{
                    nodelist2.offer(cur.rt);
                }
            }
            for(int j=0;j<nodelist2.size();j++){
                nodelist.offer(nodelist2.poll());
            }
            num+=1;
        }
    }

    /*
    여기서는 재귀함수를 활용하여 푼다. 레벨과 root 노드를 입력받고
    만약 잎이 존재하지 않으면 L을 반환하고 아니라면
    각각 오른쪽 잎과 왼쪽의 잎에 대해 해당 함수를 수행해서 작은 값을
    반환하는 방식으로 재귀함수를 동작시키면 가장 짧은 거리를 구할 수 있다.
    근데 이거는 중간 노드들의 자식이 2개 있어야함 ㅇㅇ
    */
    Node root;
    public int solution_1_DFS(int L,Node root){
        if(root.lt==null&&root.rt==null) return L;
        else return Math.min(solution_1_DFS(L+1,root.lt)
                ,solution_1_DFS(L+1,root.rt));
    }

    /*
    다음 해결방법은 BFS 방식으로 푸는 것이다.
    즉 레벨별로 싹 탐색하고 자식이 없으면 해당 경로를 정답으로 하고 종료
    일단 큐 자료구조를 활용하자. 초기에는 큐에 root 노드를 추가한다
    큐가 빌때 까지, while문 내에서 큐의 현재 길이를 구하고,
    해당 길이만큼 for문을 돌리면서, 하나씩 노드를 꺼내고
    말단 노드인지 확인해보고 말단 노드면 리턴 L을 하고
    아니면 해당 노드의 자식들을 큐에 넣고 L을 1 증가 시킨다.
    */
    public int solution_1_BFS(Node root){
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        int L=0;
        while(!Q.isEmpty()){
            int len=Q.size();
            for(int i=0;i<len;i++){
                Node cur=Q.poll();
                if(cur.lt==null&&cur.rt==null) return L;
                if(cur.lt!=null){Q.offer(cur.lt);}
                if(cur!=null){Q.offer(cur.rt);}
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);

        Node root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        //T.my_solution_1(root);
        System.out.println(T.solution_1_BFS(root));
    }
}

class Node{
    public int data;
    public Node lt;
    public Node rt;

    public Node(int data){
        this.data=data;
        lt=rt=null;
    }
}