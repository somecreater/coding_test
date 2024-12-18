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

    */
    public int[] solution(int n, int[] arr){

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


        for(int a:T.my_solution(n,arr)){
            System.out.print(a+" ");
        }
        /*
        for(int a:T.solution(n,arr)){
            System.out.print(a+" ");
        }
        */
    }
}
