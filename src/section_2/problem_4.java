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
    첫번째 풀이방법은 내가 푼방식과 동일하다.
    두번째 풀이방법은 출력할 피보나치 배열의 길이를 입력 받고
    그 정도 길이의 피보나치 배열을 생성하고 인덱스 0,1의 값만
    1,1 로 초기화 시키고 이것을 활용해서 모든 배열의 요소들의 값을 구하는 방식이다.
    */
    public void solution1(int n){
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

    public int[] solution2(int n){
        int[] answer=new int[n];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<n; i++){
            answer[i]=answer[i-2]+answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(T.my_solution(n));

        //T.solution1(n);
        for(int x :T.solution2(n)) System.out.print(x+" ");
    }
}
