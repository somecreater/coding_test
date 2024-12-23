package section_6;

import java.util.Arrays;
import java.util.Scanner;

public class problem_9 {

    /*
    곡의 수, DVD의 수를 n,m으로 곡의 길이를 배열 arr로 입력받는다.
    m개의 DVD에 곡을 나눠 담는데, 최소 용량이어야한다.
    m길이의 배열을 만들어서 거기에 분할된 곡의 길이들을 저장한다
    그리고 첫번째 부터 선택을 늘려가면서 그뒤도 선택을 바꾸는 방식으로
    하나씩 탐색하면 되나?
    */
    public int my_solution(int n, int m, int[] arr){
        int answer=0;
        int min=10001;
        int[] songarr=new int[m];
        for(int i=1;i<m-1;i++){
            songarr[0]+=arr[i];
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
