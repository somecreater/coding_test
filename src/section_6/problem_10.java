package section_6;

import java.util.Arrays;
import java.util.Scanner;

public class problem_10 {

    /*
    일단 주어진 배열을 오름차순으로 정렬하고, 최대 거리와 최소 거리를 구하고 중간거리를
    구하고 나서 중간 거리로 서로 말을 배치할 수 있는지 여부를 확인하고, 가능하면 그 후 범위
    에서 같은 방식으로 실행하는 방식으로 가능한 최댓값을 출력하는 방식으로 문제를 해결하려고
    했지만 실패하였다.
    */
    public boolean my_calculate(int[] arr,int m, int num){
        boolean answer=true;
        int cnt=m;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                break;
            }
            int x=arr[i];
            int y=0;
            boolean isexist=false;
            for(int j=i+1;j<arr.length;j++){
                y=arr[j];
                if(y-x==num){
                    isexist=true;
                    cnt--;
                    i=j;
                    break;
                }
            }
        }
        if(cnt>0){
            answer=false;
        }
        return answer;
    }
    public int my_solution(int n, int m, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int min=1;
        int max=arr[n-1]-arr[0];
        while(true){
            int mid=(max-min)/2;
            if(my_calculate(arr,m,mid)){
                min=mid;
                mid=(min+max)/2;
            }else{
                answer=mid;
                break;
            }
        }
        return answer;
    }

    /*

    */

    public int solution(int n, int m, int[] arr){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_10 T= new problem_10();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(T.my_solution(n,m,arr));
        //System.out.println(T.solution(n,m,arr));
    }
}
