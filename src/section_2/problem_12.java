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
        사중 for문을 이용해서 풀어야 한다.
        ex) n=4(학생수), m=3(테스트수) 이고 이중 배열(3,4)을 입력받는다.
        일단 이중 for(i(1~n), j(1~n))문이 돌면서
        조건이 맞는지 확인해야(멘토, 멘티 선택)
        이중 for 내에서 테스트 횟수(k(0~m-1))마다,
        등수 별로(s(0~n-1)) 확인 해봐야한다.
        if(arr[k][s]==i), if(arr[k][s]==j) 같은 조건식을 통해
        각가의 등수를 확인한다
    */
    public int solution(int n, int m, int[][] arr){
        int answer=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                    System.out.println(i+" "+j);
                }
            }
        }
        return answer;
	}

    public static void main(String[] args) {
        problem_12 T= new problem_12();
        Scanner sc=new Scanner(System.in);

        /*
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        */

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.solution(n,m,arr));

    }
}
