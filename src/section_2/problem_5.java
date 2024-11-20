package section_2;

import java.util.Scanner;

public class problem_5 {

    /*
        일일히 소수 여부를 나눠서 검사하는 방법
        말고는 판단이 안된다.
    */
    public int my_solution(int n){
        int answer=0;
        for(int i=2;i<n;i++){
            boolean isthis=true;

            for(int j=2;j<=i/2;j++){
                if(i%j==0&&i!=2){
                    isthis=false;
                    break;
                }
            }

            if(isthis){
                answer++;
            }
        }
        return answer;
    }


    /*
        에라토스테네스 체를 이용해서 푼다.
        일단 자연수 n을 입력 받는다.
        길이가 n+1인 배열을 전부 0으로 초기화 한 상태로 생성하고
        인덱스 2부터 0이면 소수라고 카운팅 하고, 해당 인덱스의 요소를
        1로 변환하고 해당 인덱스의 배수들도 전부 1로 체크한다
        이를 계속 반복하면 소수를 구할 수 있다.
    */
    public int solution(int n){
        int cnt=0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                cnt++;
                for(int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }
        return cnt;
	}

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(T.my_solution(n));
    }
}
