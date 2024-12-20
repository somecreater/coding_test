package section_6;

import java.util.Arrays;
import java.util.Scanner;

public class problem_9 {

    /*
    곡의 수, DVD의 수를 n,m으로 곡의 길이를 배열 arr로 입력받는다.
    n개의 DVD에 곡을 나눠 담는데, 최소 용량이어야한다.
    */
    public int my_solution(int n, int m, int[] arr){
        int answer=0;

        return answer;
    }

    /*

    */
    public int solution(int n, int m, int[] arr){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_9 T= new problem_9();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(T.my_solution(n,m,arr));
        //System.out.println(T.solution(n,m,arr));
    }
}
