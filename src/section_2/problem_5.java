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
