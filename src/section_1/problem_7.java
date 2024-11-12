package section_1;

import java.util.Scanner;

public class problem_7 {

    /*
    정답 맞춤
    String 클래스의 toUpperCase 메소드로
    입력된 단어를 전부 대문자 형식으로 변환해서 대소문자 구별을 없엔다.
    그러고 나서, StringBuilder 클래스의 reverse 메소드를 이용해서
    문자열을 뒤집고 String 클래스의 CompareTo 메소드로
    대문자로 변환된 원래의 단어와 뒤집어진 단어를 비교한다
    출력값이 0이면 서로 같다는 의미로 회문임을 의미한다.
    */
    public String my_solution(String str){
        String answer="";
        String orgstr=str.toUpperCase();
        StringBuilder builder=new StringBuilder(orgstr);
        String reverstr=builder.reverse().toString();
        if(orgstr.compareTo(reverstr)==0){
            answer="YES";
        }else{
            answer="NO";
        }

        return answer;
    }

    /*
    입력된 문자의 절반을 나누고 0,1,2,..
    size-1,size-2,size-3,.. 이런식으로 각각 앞 부분과
    뒷부분의 문자들을 비교한다 만약 끝까지 같다면 회문으로
    볼 수 있다.

    아니면 StringBuilder 클래스의 reverse 메소드를 이용해서
    문자열을 뒤집고 String 클래스의 equalsIgnoreCase 메소드로
    대소문자 구별없이 원래 문자열과 뒤집어진 문자열을 비교한다
    */

    public String solution(String str){
        /*
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
        }
        */
        String answer="NO";
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";

        return answer;
    }


    public static void main(String[] args) {
        problem_7 T= new problem_7();
        Scanner sc=new Scanner(System.in);

        /*
        String str=sc.next();
        System.out.println(T.my_solution(str));
        */

        String str=sc.next();
        System.out.print(T.solution(str));
    }
}
