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
         계속 검사하는 방식으로 풀면 될거 같다.
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

    public void solution_1(Node node){

    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);

        Node root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        T.my_solution_1(root);
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