package section_7;

import java.util.Scanner;

public class problem_1 {

    /*
    재귀함수 알고리즘을 이용할 때 스택에는 순서대로 함수가 쌓이며 내부에는 호출된 함수명
    매개변수, 일시 중단된 곳의 위치(주소, line 6)가 저장되고, 나중에 pop 수행시
    위에서 부터 순차적으로 pop 된다.
     */
    public void my_solution_1(int n){
        if(n==1)
            System.out.print(n+" ");
        else {
            my_solution_1(n - 1);
            System.out.print(n+" ");
        }
    }

    /*
    n이 0이되면 재귀함수를 멈춰야한다.
    이것도 비슷하다 천천히 스택에 쌓이다가 위부터 pop 되면서 화면에 출력된다
    */
    public String my_solution_2(int n){
        if(n==1){
            return Integer.toString(n%2);
        }
        return my_solution_2(n/2)+Integer.toString(n%2);

    }
    public void solution(int n){}

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(T.my_solution_2(n));
    }
}
