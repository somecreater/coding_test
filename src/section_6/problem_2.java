package section_6;

import java.util.Scanner;

public class problem_2 {

    /*
        버블 정렬은 이중 for 문을 이용합니다.
        인덱스 i와 j를 이용하고, j번째 요소와 j+1번째 요소를 비교해서
        만약 j번째 요소가 j+1번째보다 크다면 서로 위치를 바꾸면 된다.
    */
    public int[] my_solution(int n,int[] arr){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j+1]<arr[j]){
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }

    /*

    */
    public int[] solution(int n, int[] arr){

        return arr;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int a:T.my_solution(n,arr)){
            System.out.print(a+" ");
        }

    }
}
