package section_3;


import java.util.Scanner;

public class problem_4 {

    /*
    배열의 크기, 연속부분수열의 합, 배열을 입력으로 받는다.
    수열의 길이는 정해져 있지 않다!
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

    */
    public int solution(int n, int k, int[] arr){
        int answer=0, sum=0;

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
