package section_7;

import java.util.Scanner;

public class problem_1 {

    /*
    재귀함수 알고리즘을 이용할 때 스택에는 순서대로 함수가 쌓이며 내부에는 호출된 함수명
    매개변수, 일시 중단된 곳의 위치(주소, line 6)가 저장되고, 나중에 pop 수행시
    위에서 부터 순차적으로 pop 된다.
     */
    public void my_solution_1(int n){
        if(n==1)
            System.out.print(n+" ");
        else {
            my_solution_1(n - 1);
            System.out.print(n+" ");
        }
    }

    /*
    n이 0이되면 재귀함수를 멈춰야한다.
    이것도 비슷하다 천천히 스택에 쌓이다가 위부터 pop 되면서 화면에 출력된다
    */
    public String my_solution_2(int n){
        if(n==1){
            return Integer.toString(n%2);
        }
        return my_solution_2(n/2)+Integer.toString(n%2);

    }
    /*
    아래와 같이 구현하면, 순서대로 n*n-1*... 이런식으로 호출된다.
    */
    public int my_solution_3(int n){
        if(n==1){
            return 1;
        }
        return n*my_solution_3(n-1);
    }

    /*
        n-2번째 항과 n-1번째 항을 더하면 n번째 항을 구할수 있다. 이것을
        이진트리로 구성하면 금방 이해할 수 있다. 이것을 for문을 통해 여러번 수행하면
        답을 구할 수 있다.

        아니면 정적 배열을 활용해서 for문 없이 한번에 답을 구할 수 있다. 추가로
        메모리제이션을 이용해서 시간복잡도를 훨씬더 줄일 수 있다.
        그리고 for문이 재귀보다 더 빠르다.
    */
    public String my_solution_4_2(int n){
        String answer="";
        for(int i=1;i<n+1;i++){
            answer+=my_solution_4(i)+" ";
        }
        return answer;
    }
    public String my_solution_4(int n){
        int a3=0;
        if(n==1||n==2){
            return String.valueOf(1);
        }else{
            a3=Integer.parseInt(my_solution_4(n-1))
                    +Integer.parseInt(my_solution_4(n-2));
        }
        return String.valueOf(a3);
    }

    public int DFS_1(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS_1(n-2)+DFS_1(n-1);
    }

    static int[] fibo;
    public int DFS_2(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS_2(n-2)+DFS_2(n-1);
    }


    /*
        이진트리 순회를 자바로 구현해보았다.
        노드 클래스(왼쪽 번지, 데이터, 오른쪽 번지)를 이용하였다.
    */
    /*
    class Node{
        public int data;
        public Node lt;
        public Node rt;
        public Node(int data){
            this.data=data;
            lt=rt=null;
        }
    }
    class tree{
        Node root;
        public void DFS(Node root){
            if(root==null){
                return;
            }else{
                //이것은 중위 순회이다(왼->중앙->오른쪽)
                DFS(root.lt);
                System.out.print(root.data+" ");
                DFS(root.rt);
            }
        }
        public void test(){
            tree tes=new tree();

            tes.root=new Node(1);
            tes.root.lt=new Node(2);
            tes.root.rt=new Node(3);
            tes.root.lt.lt=new Node(4);
            tes.root.lt.rt=new Node(5);
            tes.root.rt.lt=new Node(6);
            tes.root.rt.rt=new Node(7);
            tes.DFS(tes.root);
        }
    }
    */

    /*
    입력된 N부터 1까지의 정수를 원소로 갖는 집합의
    부분집합을 구하는 문제이다
    1부터 첫번째 원소를 고르고 그 뒤로 n-k개(k는 처음 고른 원소값)부터
    1개를 골라서 출력하면 될거 같다.

    */
    public void my_solution_6(int n){
        for(int i=1;i<n+1;i++){
            //i=k
            for(int j=n+1-i;j>0;j--) {
                //fcn(i,j) i를 첫원소로 가지고 총 원소수가 j개인 부분 집합
            }
        }
    }
    /*
        이진 트리로 각각 갈라져서 상태를 표현하면 된다.
        원소를 넣을수도 안 넣을수도 있다.
        ex. 원소 3개면 총 2*2*2=8가지 경우이다
        1부터 사용한다 사용하지 않는다로 구분하자, 각각의 원소들에 대해
        이진트리를 이용한다. 마지막 원소까지 확인해야하므로
        n+1까지 돌아야한다.
        ch 배열은 각 원소에 대한 사용여부를 저장한다
    */
    static int n;
    static int[] ch;
    public void solution_6(int L){
        if(L==n+1){
            String tmp="";
            for(int i=1;i<=n;i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0){
                System.out.println(tmp);
            }
        }
        else{
            //사용한다
            ch[L]=1;
            solution_6(L+1);
            //사용안한다
            ch[L]=0;
            solution_6(L+1);
        }
    }
    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ch=new int[n+1];
        T.solution_6(1);
    }
}
