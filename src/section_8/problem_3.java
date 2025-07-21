package section_8;

import java.util.Scanner;

public class problem_3 {

  /*
  입력: N(문제 수), M(제한 시간), arr[N][2] (점수, 걸리는 시간)
  출력: 얻을 수 있는 최대 점수

  Math.max 활용해서 기존 답, 새로운 합에서 가장 큰값을 구한다.
  해당 문제를 선택할 경우, 선택하지 않을 경우로 가지치기를 한다.
  단 시간을 초과하거나 끝문제까지 전부 체크했을때 루프는 끝나야한다.
  */
  static int n,m=0;
  static int answer=Integer.MIN_VALUE;
  public void my_solution(int L, int sum, int time, int[][] arr){
    if(time>m) return;
    if(L==n){
      answer= Math.max(answer,sum);
    }
    else{
      my_solution(L+1,sum+arr[L][0],time+arr[L][1],arr);
      my_solution(L+1,sum,time,arr);
    }
  }

  /*
  이것도 비슷하게 해당 원소를 가져온다, 가져오지 않는다를 결정하는 문제이다.
  ex{0,2,4}(0번 문제, 2번 문제, 4번 문제)
  D(L, sum, time, arr)(레벨, 점수 합, 시간 합, 배열)

  */
  public void solution(int L, int sum, int time, int[] ps, int[] pt){
    if(time>m) return;
    if(L==n){
      answer=Math.max(answer, sum);
    }
    else{
      solution(L+1, sum+ps[L], time+pt[L], ps, pt);
      solution(L+1, sum, time, ps, pt);
    }
  }

  public static void main(String[] args) {
    problem_3 T=new problem_3();
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();

    /*
    int[][] arr=new int[n][2];
    for(int i=0;i<n;i++){
      arr[i][0]=sc.nextInt();
      arr[i][1]=sc.nextInt();
    }
    T.my_solution(0,0,0,arr);
    System.out.println(answer);
    */

    //점수, 걸리는 시간
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0; i<n; i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
    }
    T.solution(0, 0, 0, a, b);
    System.out.println(answer);
  }
}
