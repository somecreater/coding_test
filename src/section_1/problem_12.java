package section_1;

import java.util.Scanner;

public class problem_12 {

    /*
    일단 입력받은 문자열에 대해 #,*를 각각 1,0으로 String 클래스의
    replaceAll 메소드를 통해 치환하는 작업을 하고, 입력된 단어의 길이만큼
    String 클래스의 substring 메소드로 변환된 문자열을 나누고
    Integer 클래스의 parseInt 메소드를 통해 해당 이진수를 십진수로 변환하고나서
    명시적인 형 변환을 통해서 char 형태로 바꾸고 나서 정답에 일일히
    더하는 식으로 풀었다.
    */
    public String my_solution(String str,int n){
        String answer="";
        String binstr=str
                .replaceAll("#","1")
                .replaceAll("\\*","0");
        for(int i=0;i<n;i++){
            String binorgstr=binstr
                    .substring((binstr.length()/n)*i
                            ,(binstr.length()/n)*(i+1));
            int k=Integer.parseInt(binorgstr,2);
            char c= (char) k;
            answer+=c;

        }
        return answer;
    }


    /*
    문자열 s와 자연수 n을 입력 받고,
    n번 만큼 s에서 처음부터 인덱스 n-1(시작이 0부터여서)까지
    문자열을 추출하고,String 클래스의 replace 메소드로
    각각 0,1로 변환한다.

    Integer 클래스의 parseInt 메소드로
    이진수 형태인 문자열을 십진수로 변환하고나서
    char 로 명시적 형변환을 해서 answer에 더하는 식으로
    계속 갱신하고,
    입력받은 문자열도 계속 해석된 부분은 삭제하는 식으로 푼다.
    */
    public String solution(String s,int n){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0, n)
                    .replace('#', '1')
                    .replace('*', '0');
            int num=Integer.parseInt(tmp, 2);
            answer+=(char)num;
            s=s.substring(n);
        }
        return answer;
    }


    public static void main(String[] args) {
        problem_12 T= new problem_12();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        System.out.println(T.my_solution(str,n));

    }
}
