package section_6;

import java.util.Scanner;

public class problem_1 {

    /*
    자연수 N, 자연수 배열 arr 을 입력받는다
    그리고 이중 for 문을 이용해서 arr 에서 최소값을 찾아서
    answer 배열에 추가, 그에 맞게 arr 의 요소들의 실제 위치를 변경한다.
    그리고, 인덱스 i를 증가시키고 그 이후에서 최솟값을 찾는
    방식으로 풀면된다.
    */
    public int[] my_solution(int N,int[] arr){
        int[] answer=new int[N];
        int min=0;
        for(int i=0;i<N;i++){
            min=100;
            for(int j=i;j<N;j++){
                if(min>arr[j]){
                    min=arr[j];
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            answer[i]=min;
        }
        return answer;
    }

    /*

    */
    public int[] solution(int N,int[] arr){
        int[] answer=new int[N];

        return answer;
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:T.my_solution(N,arr)){
            System.out.print(a+" ");
        }
    }
}
