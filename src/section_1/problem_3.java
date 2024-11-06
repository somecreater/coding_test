package section_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_3 {

    public String my_solution(String str){
        String answer="";
        int length=0;
        StringTokenizer st=new StringTokenizer(str," ");

        while (st.hasMoreElements()) {

            String word=st.nextToken();
            if(word.length()>length){
                length=word.length();
                answer=word;
            }
        }

        return answer;
    }

    public String solution(String str){
        String answer="";

        /*
        //split 함수를 통해 띄어쓰기 단위로 문장 분리후
        //가장 긴 단어 구한다
        int m=Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len=x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }*/

        //처음에 있는 띄어쓰기 전의 단어를 하나씩 추출하면서
        //전의 단어와 바교를 하면서 가장 긴 단어를 업데이트하고
        //해당 문장을 수정 하는 방식
        int m=Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0, pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);

        /*
        String str=sc.next();
        String answer=T.my_solution(str);
        System.out.println(answer);
        */

        /*
        오답 원인: sc.nextLine()으로 입력을 받아야 문장입력을
        받을 수 있는데, sc.next()로 입력 받음
         */
        String str=sc.nextLine();
        System.out.print(T.solution(str));


    }
}
