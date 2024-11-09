package section_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_4 {

    public String my_solution(String str){
        String answer="";
        StringBuilder builder=new StringBuilder(str);
        answer=builder.reverse().substring(0);

        return answer;
    }

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
        /*
        StringBuilder의 reverse 메소드를 활용하는 방법
        for(String x : str){
            String tmp=new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        */

        //char 배열로 전환해서 직접 요소들의 위치를 바꾸고 나서, String 형으로 변환시키는 방법
        for(String x : str){
            char[] s=x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);
        /*
        int N=sc.nextInt();
        String strarr="";
        String[] stranswer=new String[N];

        for(int i=0;i<N;i++) {
            strarr = sc.next();
            stranswer[i] = T.my_solution(strarr);
        }
        for(int j=0;j<N;j++){
            System.out.println(stranswer[j]);
        }
        */

        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
