package section_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem_2 {

    /*
        말단 노드까지의 가장 짧은 경로를 구해보았다.
        노드를 클래스로 따로 구현하였으며, 레벨 별로 노드들을
        큐에 추가하면서 잎의 유무를 검사하고 없다면 while문을 종료 시키고
        있다면 큐 뒤에 추가해서 계속 검사하는 방식으로 풀면 될거 같다.
    */
    Queue<Node> nodelist=new LinkedList<>();
    public void my_solution_1(Node node){
        nodelist.offer(node);
        int num=0;
        while(!nodelist.isEmpty()){
            num+=1;
            int len=nodelist.size();
            for(int i=0;i<len;i++){
                Node cur=nodelist.poll();
                if(cur.lt==null&&cur.rt==null){
                    System.out.println(cur.data);
                    return;
                }else if(cur.lt!=null&&cur.rt==null){
                    nodelist.offer(cur.lt);
                }else{
                    nodelist.offer(cur.rt);
                }
            }

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