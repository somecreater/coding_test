package section_6;

import java.util.ArrayList;
import java.util.Arrays;
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
    이 문제는 원래 순서로 정렬된 배열과 입력된 배열을 비교해서 바뀐
    부분을 확인하면 되는 문제이다.
    */
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        int[] tmp=arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(arr[i]!=tmp[i]) answer.add(i+1);
        }
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
        /*
        for(int a:T.my_solution(n,arr)){
            System.out.print(a+" ");
        }
        */
        for(int x : T.solution(n, arr))
            System.out.print(x+" ");
    }
}
