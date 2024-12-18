package section_6;

import java.util.Scanner;

public class problem_3 {

    /*
    잘 모르겠다.
    */
    public int[] my_solution(int n,int[] arr){
        int[] answer= new int[n];
        for(int k=0;k<n;k++){
            answer[k]=arr[k];
        }
        for(int i=0; i<n-1; i++) {
            for (int j = i; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println(arr[j]);
                    int tmp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = tmp;
                }
            }
        }

        return answer;
    }

    /*
    이것도 이중 for 문을 이용한다.
    인덱스 i, j 를 이용하고 i 는 1 부터 n 까지 j 는 i-1 부터 0까지 돈다.
    tmp 초기값은 arr[i] 값을 넣고 만약 tmp 값보다 arr[j] 가 크다면
    arr[j+1]에 arr[j] 값을 넣는다. 만약 조건을 만족하지 않는다면
    자동으로 멈춘다.
    그리고 arr[j+1]에 tmp 값을 넣는다(뒤로 민다고 생각)
    */
    public int[] solution(int n, int[] arr){
        for(int i=1; i<n; i++){
            int tmp=arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

/*
        for(int a:T.my_solution(n,arr)){
            System.out.print(a+" ");
        }
 */
        for(int a:T.solution(n,arr)){
            System.out.print(a+" ");
        }

    }
}
