package section_2;

import java.util.Scanner;

public class problem_10 {

    /*
       int형 n과 int의 이중배열 arr을 입력으로 받는다
       그리고 가장자리를 0으로 채운 신규 이중 배열을 만들고
       상하좌우와 새로 만들어진 배열중 요소 하나를 크기를 일일히 비교해서
       봉우리 여부를 확인해서 정답을 구한다.
    */
    public int my_solution(int n, int[][] arr){
        int answer=0;
        int newn=n+2;
        int[][] newarr=new int[newn][newn];
        for(int i=0;i<newn;i++){
            for(int j=0;j<newn;j++){
                if(i==0||j==0){
                    newarr[i][j]=0;
                }
                else if(i==n+1||j==n+1){
                    newarr[i][j]=0;
                }
                else {
                    newarr[i][j] = arr[i - 1][j - 1];
                }
            }
        }

        for(int i=1;i<newn-1;i++){
            for(int j=1;j<newn-1;j++)
            {
                if((newarr[i][j]>newarr[i][j-1])&&(newarr[i][j]>newarr[i][j+1])
                        &&(newarr[i][j]>newarr[i-1][j])&&(newarr[i][j]>newarr[i+1][j]))
                {
                    answer++;
                }
            }
        }
        return answer;
    }


    /*
        네방향을 봐서 자기보다 크거나 같으면 봉우리 아닌걸로 판단
        여기서는 배열인 dx, dy를 각각 {-1,0,1,0},{0,1,0,-1}로 초기화한다.
        i+dx[k], j+dy[k]로 상하 좌우 인덱스를 구한다.
        경계값을 못보게 하기 위해 추가 조건도 걸어준다.(범위 안 벗어나게)
        디폴트를 true로 걸으면 경계값 확인도 문제 없다.
    */
    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
    public int solution(int n, int[][] arr){
        int answer=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag=true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
	}

    public static void main(String[] args) {
        problem_10 T= new problem_10();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.my_solution(n,arr));

    }
}
