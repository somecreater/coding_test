package section_2;

import java.util.Scanner;

public class problem_11 {

    /*
        반의 학생수를 int형 n, 자기가 맡은 반의 학생들의 속한 반의 목록을 int형 이중 배열로 입력 받는다.
        한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정한다.
        풀이방법을 잘 모르겠다.
    */
    public int my_solution(int n, int[][] arr){
        int answer=0,max=0;
        int[][] array=new int[5][9];
        int[] array2=new int[5];
        int[] answerarr=new int[n];
        for(int i=0;i<5;i++){
            for(int j=0;j<n;j++){
                //가장 많은 반을 구한다.
                int x=arr[i][j];
                array[i][x-1]+=1;
            }
        }
        //가장 많은 학생이 속한 반을 목록으로 만든다
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++)
            {
                max=Math.max(max,array[i][j]);
                array2[i]=max;
            }
        }
        //해당 반 목록에 가장 많이 속한 학생들을 뽑고, 그중 번호가 가장 작은 학생을 선출한다.
        return answer;
    }


    /*

    */

    public int solution(int n, int[][] arr){
        int answer=0;

        return answer;
	}

    public static void main(String[] args) {
        problem_11 T= new problem_11();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.my_solution(n,arr));

    }
}
