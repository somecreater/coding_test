package section_6;

import java.util.*;

public class problem_7 {

    /*
    잘 모르겠다.
    */
    public class point{
        int x=0;
        int y=0;
        public ArrayList<point> sort(List<point> ptlist){
            ArrayList<point> list=new ArrayList<>();
            //Collections.sort(ptlist);
            return list;
        }
    }
    public int[][] my_solution(int n, int[][] arr){
        int[][] answer=new int[n][2];

        int[] arrsum=new int[n];
        for(int i=0;i<n;i++){

        }
        return arr;
    }

    /*

    */
    public int[][] solution(int n, int[][] arr){
        int[][] answer=new int[n][2];

        return answer;
    }

    public static void main(String[] args) {
        problem_7 T= new problem_7();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int[] a:T.my_solution(n,arr)){
            System.out.print(a[0]+" "+a[1]);
        }
    }
}
