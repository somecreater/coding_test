package section_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem_3 {

    /*
        일단 배열의 길이와 연속된 합의 길이, 배열을 입력받는다
        처음에만 연속된 배열내 요소들의 합을 구하고 그 뒤로는 앞뒤로
        요소들을 하나씩 더하고 빼면 연속된 배열의 합을 구할 수 있고
        거기서 최댓값을 구하면 문제가 요구하는 최대 매출액을 구할 수 있다.
    */
    public int my_solution(int n1, int k, int[] a){
       int answer=0,ind=0;
       int val=0;
       while(ind<a.length-k){

           if(ind==0) {
               for (int x = ind; x < ind + k; x++) {
                   val += a[x];
               }
           }else{
               val-=a[ind-1];
               val+=a[ind+k-1];
           }
           answer=Math.max(answer,val);
           ind+=1;
       }
       return answer;
    }

    /*

    */
    public int solution(int n, int k, int[] a){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println(T.my_solution(n,k,arr));
    }
}
