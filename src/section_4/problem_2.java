package section_4;

import java.util.HashMap;
import java.util.Scanner;

public class problem_2 {

    /*
        문자열 2개를 입력 받는다.
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
    두개의 문자열을 입력 받는다.(s1,s2)
    s1 문자열을 char의 배열로 변환하고 HashMap (알파벳, 알파벳의 개수) 형태로 저장한다.(s1map)
    이때 HashMap 클래스의 getOrDefault 메소드를 활용한다.

    s2 문자열을 char의 배열로 변환하고 하나씩 검사한다.
    HashMap 클래스의 containsKey 메소드를 활용해서 키가 있는지 없는지 확인하고
    만약 있다면 s1map 에 그 키에 해당하는 값을 1을 감소시킨다.
    이것을 계속 반복하고 최종적으로 0만 존재하면 아나그램이 맞다.
    만약 0 미만 또는 1 이상이거나, 키가 없으면 아나그램이 아니다.
    */
    public String solution(String s1, String s2){
        String answer="YES";
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        //System.out.println(T.my_solution(str1,str2));
        System.out.println(T.solution(str1,str2));
    }
}
