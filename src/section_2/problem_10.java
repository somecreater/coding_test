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

    */
    public int solution(int n, int[][] arr){
        int answer=0;
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
