package section_6;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_5 {

    /*
    중복 확인을 구현하는 문제이다
    리스트 크기 n과 ArrayList<Integer> 자료구조를 입력받는다.
    그리고 리스트에서 하나씩 요소를 추출하고 ArrayList 클래스의 IndexOf 메소드와
    lastIndexOf 메소드를 이용해서 해당 요소가 처음 등작하는 인덱스와 마지막 인덱스를 구한다
    만약 둘다 일치하지 않으면 중복된 원소가 존재한다는 의미이므로 D를 출력하면 된다.
    */
    public String my_solution(int n,ArrayList<Integer> list){
        String answer="U";
        for(int i=0;i<n;i++){
            int num=list.get(i);
            if(list.indexOf(num)!=list.lastIndexOf(num)){
                answer="D";
                break;
            }
        }
        return answer;
    }

    /*

    */
    public String solution(int n,ArrayList<Integer> list){
        String answer="U";

        return answer;
    }

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        */
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int tmp=sc.nextInt();
            list.add(tmp);
        }
        System.out.println(T.my_solution(n,list));

    }
}
