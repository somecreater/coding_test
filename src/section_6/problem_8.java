package section_6;

import java.util.Arrays;
import java.util.Scanner;

public class problem_8 {

    /*
    배열 크기인 n, 탐색하려는 숫자인 m과 배열인 arr을 입력받는다
    그리고 이분검색으로 m의 위치를 출력하는 문제이다.
    초기에 min,max,half 값을 각각 0, n-1, max/2로 잡는다.
    arr[half] 와 m을 비교해서 만약 같다면 half+1 이 답이다.
    만약 작다면 max를 half, half를 (min+half)/2로 갱신한다.
    만약 크다면 min을 half, half를 (max+half)/2로 갱신한다.
    이런식으로 반복하면 언젠가 답을 구할 수 있다.
    */
    public int my_solution(int n, int m, int[] arr){
        int answer=0;
        int half=0;
        int min=0;
        int max=n-1;
        half=max/2;
        Arrays.sort(arr);
        while(true){
            if(arr[half]==m){
                answer=half+1;
                break;
            }else if(arr[half]<m){
                min=half;
                half=(max+half)/2;
            }else{
                max=half;
                half=(min+half)/2;
            }
        }
        return answer;
    }

    /*

    */
    public int solution(int n, int m, int[] arr){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_8 T= new problem_8();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(T.my_solution(n,m,arr));

    }
}
