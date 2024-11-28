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

    */
    public int solution(int n){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(T.my_solution(n));
    }
}
