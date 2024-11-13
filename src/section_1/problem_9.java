package section_1;

import java.util.Scanner;

public class problem_9 {

    /*
    입력받은 단어에 대해서
    String 클래스의 replaceAll 메소드와 정규식을 활용해서 숫자가 아닌 문자들을
    전부 빈 문자로 대체하고나서 char 배열로 변환하고, 처음에 0이 오지 않게 변환하고 나서
    최종적으로 해당 단어를 int 형으로 변환해서 출력하였다.
    */
    public int my_solution(String str){
        int answer=0;
        char[] charanswer=str.replaceAll("[^0-9]","").toCharArray();
        String strans="";
        for(int i=0;i<charanswer.length;i++){
            if(i==0 && charanswer[i]=='0'){
               continue;
            }
            strans+=charanswer[i];
        }
        answer=Integer.valueOf(strans.toString());
        return answer;
    }

    /*
    아스키 넘버가 48~57 사이에 있으면 '0'~'9'이다.
    위의 조건에 만족하는 문자들 한정으로
    answer=answer*10+(char 문자-48); 식을 적용시키면
    단어를 숫자로 변환할 수 있다.

    아니면 Character 클래스의 isDigit 메소드를 활용해서 숫자여부를 검사해서
    단어를 구성하고 해당 단어를 Integer 클래스의 parseInt 메소드를 이용해서
    숫자로 변환하면 된다.
    */
    public int solution(String str){
        //int answer=0;
        String answer="";
        for(char x : str.toCharArray()){
            //if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        problem_9 T= new problem_9();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.my_solution(str));

    }
}
