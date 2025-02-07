package section_2;

import java.util.Arrays;
import java.util.Scanner;

public class problem_9 {

    /*
    int형 n과 int의 이중배열 arr을 입력으로 받는다.
    각각 행과 열, 대각선의 합을 구하고 나서 Math 클래스의 max 메소드로
    가장 큰 값만 answer 변수에 넣으면 답을 구할 수 있다.
    */
    public int my_solution(int n, int[][] arr){
        int answer=0;
        int[] sum2=new int[n];
        int sum3=0;
        int sum4=0;
        for(int i=0;i<n;i++){
            int sum= Arrays.stream(arr[i]).sum();
            for(int j=0;j<n;j++){
                sum2[i]+=arr[j][i];
            }
            answer=Math.max(answer,sum);
            answer=Math.max(answer,sum2[i]);
        }
        for(int i=0;i<n;i++){
            sum3+=arr[i][i];
        }
        for(int i=0;i<n;i++){
            sum4+=arr[i][n-1-i];
        }
        answer=Math.max(answer,sum3);
        answer=Math.max(answer,sum4);
        return answer;
    }


    /*
        내가 푼 방식과 같지만 해당 방법에서는
        인덱스 i와 j의 위치를 각각 다르게 해서
        행과 열의 합을 구하였다.
        그리고 메모리를 훨씬 절약하였다.
    */
    public int solution(int n, int[][] arr){
        int answer=-2147000000;
        int sum1=0, sum2=0;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
	}

    public static void main(String[] args) {
        problem_9 T= new problem_9();
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
