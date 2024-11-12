package section_1;

import java.util.*;

public class problem_6 {

    /*
        일단 String 형태의 문자열을 Character 배열로 변환하고 리스트에
        문자를 하나씩 추가하면서 새로 추가될 문자가 이미 추가된 문자와 중복되는지를
        확인하고 중복이 안되면 추가하는 방식으로 중복이 제거된 문자열을 구하는 방식이다.
        그런데, 범위 문제로 계속 오류가 생겨서 풀이를 실패하였다.
    */
    public String my_solution(String str){
        String answer="";
        char[] chararr=str.toCharArray();
        List<Character> charlist=new ArrayList<>();
        int i=0,j=0;
        do{
            if(!charlist.isEmpty()) {
                for (j = 0; j < i; j++) {
                    if (charlist.get(j) == chararr[i]) {
                        break;
                    }
                    if (j == i - 1) {
                        charlist.add(chararr[i]);
                    }
                }
            }else{
                charlist.add(chararr[i]);
            }
            i++;
        }while (i<chararr.length);
        answer=charlist.toArray().toString();
        return answer;
    }

    /*
    charAt 메소드를 활용해서 문장에서 인덱스 i 위치의 문자를 추출하고,
    indexOf 메소드를 활용해서 해당 문자가 처음 나온 인덱스를 확인할 수 있다.
    만약 확인하려는 단어의 인덱스와 해당 위치의 문자의 indexOf의 출력 값이 같다면
    새로 확인하는 문자가 처음 나온것임을 알 수 있다.
    해당 문자를 추가하면 답을 구할 수 있다.
    */

    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        problem_6 T= new problem_6();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.solution(str));


    }
}
