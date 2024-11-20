package section_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_6 {

    /*
       배열의 길이 자연수 n과 n개의 자연수를
       자연수 n, 길이 n의 문자열의 배열 형태로 입력 받는다.
       각각 배열의 요소를 하나씩 StringBuilder 클래스의 reverse 메소드로
       뒤집고 Integer 클래스의 parseInt 메소드로 int 형으로 변환하고
       해당 수가 소수인지 여부를 판단하고 소수면 리스트에 추가한다.
    */
    public List<Integer> my_solution(int n, String[] arr){
        List<Integer> answer=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean istrue=true;
            StringBuilder builder=new StringBuilder(arr[i]);
            int number=Integer.parseInt(builder.reverse().toString());

            if(number==1){
                istrue=false;
            }

            for(int j=2;j<=number/2;j++){
                if(number%j==0&&number!=2){
                    istrue=false;
                    break;
                }
            }

            if(istrue){
                answer.add(number);
            }

        }

        return answer;
    }


    /*

    */
    public List<Integer> solution(int n, String[] arr){
        List<Integer> answer=new ArrayList<>();

        return answer;
	}

    public static void main(String[] args) {
        problem_6 T= new problem_6();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        List<Integer> ans=T.my_solution(n,arr);
        for(int i=0;i<ans.size();i++){
            if(i==0){
                System.out.print(ans.get(i));
            }else{
                System.out.print(" "+ans.get(i));
            }
        }
    }
}
