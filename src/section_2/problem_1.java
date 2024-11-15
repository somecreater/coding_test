package section_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_1 {

    /*
    자연수 n과 배열 arr을 입력으로 받고
    배열의 첫번째 요소만 추가하고,
    그 후에는 배열 요소를 일일이 탐색하면서
    i 번째 요소가 i+1번째 요소보다 작으면 i+1번째 요소를 리스트에
    추가하는 방식으로 정답을 구한다.
    */
    public List<Integer> my_solution(int n, int[] arr){
        List<Integer> answer=new ArrayList<>();
        answer.add(arr[0]);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                answer.add(arr[i+1]);
            }
        }
        return answer;
    }

    /*
    내가 문제를 푼 방식과 동일
    */
    public List<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);

        /*
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:T.my_solution(n,arr)){
            System.out.print(i+" ");
        }
        */

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
