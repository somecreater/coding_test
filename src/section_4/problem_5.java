package section_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class problem_5 {

    /*

    */
    public int my_solution(int n, int k, int[] arr){
        int answer=0;

        return answer;
    }


    /*

    */
    public int solution(int n, int k, int[] arr){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //ArrayList<Integer> answer=T.my_solution(n,k,arr);
        int answer=T.solution(n,k,arr);
        System.out.println(answer);
    }
}
