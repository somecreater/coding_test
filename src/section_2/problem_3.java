package section_2;

import java.util.Scanner;

public class problem_3 {

    /*
    1, 2-> 2를 낸 쪽이 승리
    2, 3-> 3을 낸 쪽이 승리
    1, 3-> 1을 낸 쪽이 승리
    1: 가위, 2: 바위, 3: 보
    arr1: A, arr2: B
    */
    public String[] my_solution(int n, int[] arr1, int[] arr2){
        String[] answer=new String[n];
        for(int i=0;i<n;i++){
            if((arr1[i]-arr2[i])==1){
                answer[i]="A";
            }else if((arr1[i]-arr2[i])==-2){
                answer[i]="A";
            }else if(arr1[i]==arr2[i]){
                answer[i]="D";
            }
            else{
                answer[i]="B";
            }
        }
        return answer;
    }

    /*

    */
    public String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer=new String[n];

        return answer;
    }
    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arr2[i]=sc.nextInt();
        }

        for(String s:T.my_solution(n,arr1,arr2)){
            System.out.println(s);
        }

    }
}
