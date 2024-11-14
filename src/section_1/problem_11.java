package section_1;

import java.util.Scanner;

public class problem_11 {

    /*
        단어를 입력으로 받아서 문자를 하나씩 읽어가면서,
        첫 시행 여부, 새로운 문자와 그 전 문자의 동일 여부,
        정답의 마지막 문자의 숫자 여부 확인으로
        같은 문자가 3개 이상 등장 여부 검사를 통해
        정답을 구성한다.
    */
    public String my_solution(String str){
        String answer="";
        int k=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0){
                answer+=c;
            }else if(str.charAt(i-1)!=c){
                answer+=c;
            }else if(str.charAt(i-1)==c &&
                    !Character.isDigit(answer.charAt(answer.length()-1))){
                answer+='2';
            }else{
                int num=Integer.parseInt(answer.substring(answer.length()-1));
                answer=answer.substring(0,answer.length()-1);
                answer+=(num+1);
            }
        }
        return answer;
    }

    /*
    문자열을 입력으로 받고,
    중복 문자 수를 저장할 cnt를 1로 초기화 시켜놓는다.
    i번째 문자와 i+1의 문자를 비교해서 만약 같으면 cnt를 1 증가 시키고
    다르면 i번째 문자+cnt(cnt가 2 이상일때만)를 answer 문자열에
    append 한다.
    이런 식으로 입력된 문자열 끝까지 수행하면 된다.
    */

    public String solution(String s){
        String answer="";
        s=s+" ";
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        problem_11 T= new problem_11();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(T.my_solution(str));

    }
}
