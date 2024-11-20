package section_2;

import java.util.Scanner;

public class problem_7 {

    /*
    int형 n과 int의 배열형 arr을 입력으로 받고 k와 answer 값을
    0으로 초기화 시키고 문제가 맞을 때마다 k를 1씩 증가 시키면서,
    answer에 추가하고 만약에 문제가 틀렸을때 k를 0으로 초기화 시킨다.
    이렇게 하면 점수를 계산할 수 있다.
    k: 누적된 점수 값
    arr: 문제들의 정답 여부
    */
    public int my_solution(int n, int[] arr){
        int answer=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                k++;
                answer+=k;
            }
            if(arr[i]==0){
                k=0;
            }
        }
        return answer;
    }


    /*

    */
    public int solution(int n, int[] arr){
        int answer = 0;

        return answer;
	}

    public static void main(String[] args) {
        problem_7 T= new problem_7();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(T.my_solution(n,arr));
    }
}
