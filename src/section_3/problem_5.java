package section_3;


import java.util.Scanner;

public class problem_5 {

    /*
    입력: 자연수, 출력: 해당 자연수를 연속된 자연수의 합으로 표현할 수 있는 가짓수
    이것도 rt,lt로 풀어야하나..
    잘 모르겠다.
    */
    public int my_solution(int n){
       int answer=0,sum=0;
       int lt=0;
       for(int i=0;i<n;i++){
           sum+=i;
       }
       return answer;
    }

    /*
    lt(앞쪽 가리키는 인덱스)와 rt(뒤쪽을 가리키는 인덱스)를 활용한다.
    lt부터 rt까지 더해서 n인지 확인한다. 작으면 rt가 증가한다.
    만약 n이라면 카운팅을 한다. 그러고 나서 lt가 증가한다. 이러고 나서 n이랑 같은지 확인
    작으면 다시 rt 증가.. 이런식으로 반복해서 카운팅하면 된다.
    */
    public int solution(int n){
        int answer=0, sum=0;
        int m=n/2+1;
        int[] arr=new int[m];
        for(int i=0; i<m; i++) arr[i]=i+1;
        int lt=0;
        for(int rt=0; rt<m; rt++){
            sum+=arr[rt];
            if(sum==n) answer++;
            while(sum>=n){
                sum-=arr[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        //System.out.println(T.my_solution(n));
        System.out.println(T.solution(n));
    }
}
