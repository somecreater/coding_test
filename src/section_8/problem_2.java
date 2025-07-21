package section_8;

import java.util.Scanner;

public class problem_2 {

  /*
  입력: 자연수 C(1<=C<=100000000)(트럭의 무게 한도),
  N(1<=N<=30)(바둑이 수),
  arr[N](N 마리의 바둑이 무게)
  출력: 태울수 있는 가장 무거운 무게

  각자의 요소를 선택하냐 안하냐로 생각
  만약 선택하면 해당 요소를 원래 합에 더하고 선택안하면 그냥 넘어가고
  이를 마지막 요소까지 수행 후 원래 정답과 새로 구한 합 둘 중에서 가장 큰 값을
  정답으로 대체
  */
  static int answer=Integer.MIN_VALUE;
  static int n,c;
  static int[] arr;
  public void my_solution(int L, int sum){
    if(sum>c) return;
    answer = Math.max(answer, sum);
    if(L==n) return;
    my_solution(L+1,sum+arr[L]);
    my_solution(L+1,sum);
  }

  /*
  바둑이를 트럭에 태운다, 태우지 않는다는 선택의 연속이다(부분집합을 구한다)
  D(L,SUM)(레벨, 트럭에 타는 바둑이의 무게)(C보다 SUM의 무게가 작아야한다)
  */
  public void solution(int L, int sum, int[] arr){
    if(sum>c) return;
    if(L==n){
      answer=Math.max(answer, sum);
    }
    else{
      solution(L+1,sum+arr[L],arr);
      solution(L+1,sum,arr);
    }
  }

  public static void main(String[] args) {
    problem_2 T=new problem_2();
    Scanner sc=new Scanner(System.in);
    c=sc.nextInt();
    n=sc.nextInt();
    arr=new int[n];
    for(int i=0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    /*
    T.my_solution(0,0);
    System.out.println(answer);
    */
    T.solution(0,0,arr);
    System.out.println(answer);
  }
}
