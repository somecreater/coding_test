package section_6;

import java.util.Scanner;

public class problem_6 {

    /*
    만약 요소들이 같은 경우 어떻게 풀어야할 지 잘 모르겠다.
    */
    public int[] my_solution(int n,int[] arr){
        int[] answer=new int[2];
        int x=n,y=n;
        for(int i=0;i<n-1;i++){
            if(x==n && arr[i]>arr[i+1]){
                x=i;
                System.out.println(i);
                break;
            }
        }
        for(int j=x+1;j<n-1;j++){
            if(y==n && arr[j]>arr[j+1]){
                y=j+1;
                break;
            }
        }
        answer[0]=x+1;
        answer[1]=y+1;
        return answer;
    }

    /*

    */
    public int[] solution(int n,int[] arr){
        int[] answer=new int[2];

        return answer;
    }

    public static void main(String[] args) {
        problem_6 T= new problem_6();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:T.my_solution(n,arr)){
            System.out.print(a+" ");
        }

    }
}
