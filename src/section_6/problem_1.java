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
    선택 정렬은 i가 0일때 j는 1부터 끝까지, i가 1일 때는 j는 2부터 끝까지
    이런식으로 돌면 된다.
    가장 최솟값을 가진 인덱스를 idx에 따로 저장하고
    만약 최솟값을 가진 요소를 발견하면 idx를 j로 교체한다.
    다 돌면 i번째 요소와 idx 번째 요소를 서로 교체하면 된다.
    */
    public int[] solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int idx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[idx]) idx=j;
            }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        /*
        for(int a:T.my_solution(N,arr)){
            System.out.print(a+" ");
        }
        */
        for(int a:T.solution(N,arr)){
            System.out.print(a+" ");
        }
    }
}
