package section_5;

import java.util.Scanner;
import java.util.Stack;

public class problem_3 {

    /*
    자연수 N,M 그리고 게임화면 내 요소를 int[][] 형으로 입력 받는다.
    범위가 각각 N은 30까지 M은 최대 1000이하 이므로 일일히 탐색해도 된다.
    즉, moves 의 요소를 하나씩 읽어오면서, 게임 판에서
    해당 위치의 0이 아닌 값을 가져오고 스택에 추가한다.
    만약 스택의 top 값이 추가하려는 값과 같다면 스택의 pop 연산을 수행하고,
    answer 에 2를 추가하면 원하는 답을 구할 수 있다.
    */
    public int my_solution(int N, int[][] boardlist,int M, int[] moves){
        int answer=0;
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<M;i++){
            int move=moves[i]-1;
            int item=0;
            for(int j=0;j<N;j++){
                item=boardlist[j][move];
                //System.out.print(item);
                if(item!=0){
                    boardlist[j][move]=0;
                    break;
                }
            }
            //System.out.println();

            if(!stack.isEmpty() && stack.peek()==item){
                answer+=2;
                stack.pop();
            }else if(item!=0){
                stack.push(item);
            }
        }
        return answer;
    }

    /*

    */
    public int solution(int N, int[][] boardlist,int M, int[] moves){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int[][] boardlist=new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int x=sc.nextInt();
                boardlist[i][j]=x;

            }
        }
        int M=sc.nextInt();
        int[] moves=new int[M];

        for(int l=0;l<M;l++){
            moves[l]=sc.nextInt();
        }

        System.out.println(T.my_solution(N,boardlist,M,moves));
    }
}
