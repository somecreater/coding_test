package section_3;


import java.util.Scanner;

public class problem_4 {

    /*
    배열의 크기, 연속부분수열의 합, 배열을 입력으로 받는다.
    수열의 길이는 정해져 있지 않다!
    부분 배열의 길이를 설정하고, 부분 배열의 합을 구하고나서 k하고
    비교하는 방식으로 문제를 풀려고 했지만 풀리지 않았다.
    */
    public int my_solution(int n, int k, int[] a){
       int answer=0,sum=0;

       for (int i = 1; i < n; ) {
           for(int j=0;j<i;j++){
               sum+=a[j];
           }
           for(int l=0;l<a.length-i;l++){
               if(sum==k){
                   answer++;
                   sum+=(a[l+i]-a[l]);
               }
               else{
                   sum+=(a[l+i]-a[l]);
               }
           }
       }

       return answer;
    }

    /*
    lt(왼쪽을 가리키는 인덱스), rt(오른쪽을 가리키는 인덱스)를 활용한다.
    초기값에 rt를 더한다. 만약 sum 보다 작다면 rt 값을 증가시키고, rt 인덱스의 값을 다시 더한다.
    이런 방식을 sum 보다 크거나 같을때 까지 반복한다.
    만약 크다면, lt 인덱스의 값을 빼고 lt 값을 증가시킨다. 다시 같은지 확인 같다면 카운팅하고,
    다시 lt 인덱스의 값을 빼고 lt 값을 증가시킨다, 만약 작다면 rt 인덱스를 증가시키고,
    rt 인덱스의 값을 더한다. lt 값을 여러번 빼야하는 경우가 있을 수도 있다(ex)1,1,1,1,1,5  6)
    rt가 끝까지 간다면 끝이다.
    */
    public int solution(int n, int m, int[] arr){
        int answer=0, sum=0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println(T.my_solution(n,k,arr));
    }
}
