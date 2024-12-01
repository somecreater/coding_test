package section_4;

import java.util.HashMap;
import java.util.Scanner;

public class problem_2 {

    /*
        문자열 2개를 입력으로 받는다.
        두개의 문자열을 char 의 배열로 변환하고, 각각 HashMap 자료형에 키,값 형식으로
        각각 Character, Integer 로 저장하고 입력받은 문자열들의 알파벳 개수를 구해서 넣는다.
        그리고 한개의 HashMap 으로 부터 키값을 추출해서 다른 문자열과 비교하면, 아나그램 판별을 할 수 있다.
    */
    public String my_solution(String s1, String s2){
        String answer="YES";
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        char[] charr1=s1.toCharArray();
        char[] charr2=s2.toCharArray();
        for(int i=0;i<charr1.length;i++){
                map1.put(charr1[i],map1.getOrDefault(charr1[i],0)+1);
                map2.put(charr2[i],map2.getOrDefault(charr2[i],0)+1);
        }

        for(char c:map1.keySet()){

            if(!map2.containsKey(c)){
                answer="NO";
                break;
            }
            if(map1.get(c)!=map2.get(c)){
                answer="NO";
                break;
            }
        }
        return answer;
    }


    /*

    */
    public String solution(String s1, String s2){
        String answer="";

        return answer;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(T.my_solution(str1,str2));
    }
}
