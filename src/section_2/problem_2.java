package section_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_2 {

    /*
    정수형 n과 정수형 배열 arr을 입력으로 받고
    max 값을 arr[0] 값으로 두고
    배열의 끝까지 도달할 때까지 문제에서 요구하는 것을 구한다.

    max 값이 arr 인덱스 i 번째의 값보다
    크거나 같다는 의미는 해당 요소가 앞 쪽의 요소 중
    가장 큰 값보다 작다는 의미이므로 그냥 넘어가고

    max 값이 arr 인덱스 i 번째의 값보다 작고, arr 인덱스 i 번째의
    값이 arr 인덱스 i-1 번째의 값보다 크다면
    해당 요소가 앞 쪽의 요소 중 가장 큰 값보다 크다는 의미이므로
    answer에 1을 더한다.
    */
    public int my_solution(int n, int[] arr){
        int max=arr[0];
        int answer=1;
        for(int i=1;i<n;i++){
            if(max>=arr[i]){
                continue;
            }
            if(arr[i-1]<arr[i]&&max<arr[i]){
                answer+=1;
                max=arr[i];
            }
        }
        return answer;
    }

    /*

    */
    public int solution(int n, int[] arr){
        int answer=0;

        return answer;
    }
    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(T.my_solution(n,arr));

    }
}
