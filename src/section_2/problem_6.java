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
        int 형 n과 int의 배열인 arr을 입력으로 받는다.
        해당 요소를 연산으로 뒤집고 나서 해당 요소가 소수인지 여부를
        2부터 해당요소-1 까지 나누기 계산을 통해 판단하고
        소수면 ArrayList에 추가하는 방식으로답을 구한다.
    */
    public boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i];
            int res=0;
            while(tmp>0){
                int t=tmp%10;
                res=res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
	}

    public static void main(String[] args) {
        problem_6 T= new problem_6();
        Scanner sc=new Scanner(System.in);
        /*
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
        */

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }

    }
}
