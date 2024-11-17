package section_2;

import java.util.Scanner;

public class problem_4 {

    /*
    자연수 n을 입력으로 받고
    n이 1,2인 경우만 따로 출력하고 그 이상인 경우에는
    피보나치 수열의 범위의 끝인 n까지 일일히 요소들을 구해서 문자열에
    추가하는 방식으로 정답을 구한다.
    즉 n까지 ai-2와 ai-1을 더하는 방식으로 ai를 구한다.
    */
    public String my_solution(int n){
        String answer="1";
        int k=0;
        int a1=1;
        int a2=1;
        if(n==1){
            return answer;
        }
        else if(n==2){
            return answer+" 1";
        }else{
            answer+=" 1";
            for(int i=3;i<=n;i++){
                k=a1+a2;
                a1=a2;
                a2=k;
                answer+=" "+k;
            }
        }
        return answer;
    }

    /*

    */
    public int[] solution(int n){
        int[] answer=new int[n];

        return answer;
    }

    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(T.my_solution(n));
    }
}
