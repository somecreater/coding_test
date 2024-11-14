package section_1;

import java.util.Scanner;

public class problem_12 {

    /*
    일단 입력받은 문자열에 대해 #,*를 각각 1,0으로 String 클래스의
    replaceAll 메소드를 통해 치환하는 작업을 하고, 입력된 단어의 길이만큼
    String 클래스의 substring 메소드로 변환된 문자열을 나누고
    Integer 클래스의 parseInt 메소드를 통해 해당 이진수를 십진수로 변환하고나서
    Character 클래스의 toString 메소드로 char 형태로 바꾸고 나서 정답에 일일히
    더하는 식으로 풀었다.
    이 환경에서는 잘 풀리지만 채점환경에서는 컴파일에러가 나왓다.
    (toString 부분에서)
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
            answer+=Character.toString(k);

        }
        return answer;
    }


    /*

    */
    public String solution(String s,int n){
        String answer="";

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
