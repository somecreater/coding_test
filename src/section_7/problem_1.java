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


    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //System.out.print(T.my_solution_4_2(n));

        /*
        int n=10;
		for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
        */
        int n=45;
        fibo=new int[n+1];
        T.DFS_2(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
}
