package section_3;

import java.util.Arrays;
import java.util.Scanner;

public class problem_6 {

    /*
    n: 수열 길이, k: 1로 구성된 부분 연속 수열을 만들기 위한 최대 변경 가능 횟수, a[]: 수열
    1로만 구성된 연속 부분 수열의 길이==해당 수열의 합
    만약 특정 수열의 합과 확인하려는 부분 수열의 길이의 차이가 k보다 크다면 해당 부분 수열은 만드는 것이
    불가능하다.

    rt와 lt를 동시에 사용하고, 초기값은 둘다 0으로 잡고 만약 부분 수열을 만들수 있다면
    rt 값을 계속 증가 시키다가, 불가능 하면 lt와 rt를 동시에 증가시키는 방식으로 하면 최댓값을 구할 수 있다?
    */
    public int my_solution(int n, int k, int[] a){
       int answer=0,lt=0,rt=0;
       while(rt<n){
           int[] suba= Arrays.copyOfRange(a,lt,rt);

           //suba내 요소들의 합과 suba의 길이의 차이가 k 이하인지 여부 확인
           if(suba.length-Arrays.stream(suba).sum()<=k){
               answer=Math.max(answer, suba.length);
               rt++;
           }else{
                lt++;
                rt++;
           }

       }
       return answer;
    }

    /*

    */
    public int solution(int n, int k, int[] arr){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_6 T= new problem_6();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          int x=sc.nextInt();
          arr[i]=x;
        }
        System.out.println(T.my_solution(n,k,arr));
    }
}
