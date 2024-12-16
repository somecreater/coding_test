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
    바구니를 스택으로 한다.
    moves 내 요소들을 하나씩 입력 받고 해당 요소를 position 이라고 한다면
    board 에서 해당 요소는 board[i][position-1] 에 있다고 할 수 있다.
    해당 열을 탐색하고 0이 아닌 값을 발견(인형을 발견)하면 스택에 넣고,
    board 의 해당 위치를 0으로 만들고 크레인은 중단된다.(break)
    만약 해당 열이 전부 0이면 그냥 지나간다.
    스택 위의 인형과 같다면 인형이 터지면서 사라진다.(answer+=2를 수행)
    */
    public int solution(int[][] board, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp=board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);
        /*
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
    */
        int n=sc.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=sc.nextInt();
            }
        }
        int m=sc.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=sc.nextInt();
        System.out.println(T.solution(board, moves));
    }
}
