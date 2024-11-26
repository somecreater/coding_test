package section_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class problem_12 {

    /*
    n명의 학생, m번의 수학테스트
    1회, 1등 2등 3등 4등 ..
    2회, 1등 2등 3등 4등 ..
    .
    m회, ....
    여기서 멘토를 형성할 수 있는 경우의 수를 구하면 된다.
    */
    public int my_solution(int n, int m, int[][] arr){
        int answer=0;
        boolean ismanto=true;
        //멘티 관계를 형성할 학생을 선출한다.
        for(int i=0;i<n;i++){

            //멘토 역을 맡을 학생을 선출한다.
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }

                //k회차 시험점수 비교
                for(int k=0;k<m;k++){
                    //i와 j의 등수
                    int iscore=n-1;
                    int jscore=n-1;
                    List<Integer> scores= new ArrayList<>();
                    for(int w=0;w<n;w++){
                        scores.add(arr[k][w]);
                    }
                    iscore=scores.indexOf(i+1);
                    jscore=scores.indexOf(j+1);

                    if(iscore<jscore) {
                        ismanto = false;
                        break;
                    }

                }
                if(ismanto){
                    answer++;
                    ismanto=true;
                }

            }
        }
        return answer;
    }


    /*

    */
    public int solution(int n, int[][] arr){
        int answer=0;

        return answer;
	}

    public static void main(String[] args) {
        problem_12 T= new problem_12();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.my_solution(n,m,arr));

    }
}
