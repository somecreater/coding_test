package section_2;

import java.util.Scanner;

public class problem_3 {

    /*
    1, 2-> 2를 낸 쪽이 승리
    2, 3-> 3을 낸 쪽이 승리
    1, 3-> 1을 낸 쪽이 승리
    1: 가위, 2: 바위, 3: 보
    arr1: A, arr2: B
    각각 값의 차이에 따라서 승패여부를 확인했다.
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
    직접 a와 b 배열의 값을 일일히 확인해서 승패 여부를 확인하였으며
    문자열 형태로 정답을 출력하였다.
    */
    public String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
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
        /*
        for(String s:T.my_solution(n,arr1,arr2)){
            System.out.println(s);
        }
        */
        for(char x : T.solution(n, arr1, arr2).toCharArray()) System.out.println(x);
    }
}
