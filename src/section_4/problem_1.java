package section_4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_1 {

    /*
    학습 인원수 n과 투표결과를 문자열 형식으로 입력받는다.
    그리고 투표 결과를 저장할 HashMap 변수를 초기화 시킨다.
    문자열을 char 배열로 변환 시키고, 배열내의 요소들을 검사하면서,
    만약 새로운 후보자면 HashMap에 추가하고, 그것이 아니라면 기존의 value 값에 1만 더하는 방식으로
    투표결과를 계산한다.
    최종적으로 해당 HashMap에서 최댓값을 구하고, 최댓값에 해당하는 key가 당선자이다.
    */
    public char my_solution(int n, String str){
        char answer=Character.MIN_VALUE;
        int maxvalue=0;
        Map<Character,Integer> map=new HashMap<>();
        char[] charr=new char[n];
        charr=str.toCharArray();
        for(int i=0;i<n;i++){
            if(!map.containsKey(charr[i])){
                map.put(charr[i],1);
            }else{
               int value=map.get(charr[i])+1;
               map.remove(charr[i]);
               map.put(charr[i],value);
            }
        }
        maxvalue= Collections.max(map.values());
        for(Character c:map.keySet()){
            if(map.get(c)==maxvalue){
                answer=c;
            }
        }
        return answer;
    }


    /*
    HashMap 자료형을 이용하고 key,value 를 Character, Integer 로
    잡아야한다. (후보자, 후보자 득표수)
    HashMap 클래스의 getOrDefault 메소드를 활용해서 키값이 없는 경우도 0을 리턴하도록 한다.
    이렇게 결과값을 저장하고 나서, HashMap 클래스의 keySet 메소드로 키값들을 가져와서,
    그중에서 가장 큰 값을 가진 키를 답으로 저장한다.
    containKey 메소드는 특정키의 포함여부를 확인할 수 있다.
    size 메소드는 키의 종류 개수를 알려준다.
    remove 메소드는 특정키를 삭제하고 해당 키의 값을 리턴한다.
    */
    public char solution(int n, String s){
        char answer=' ';
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        //System.out.println(map.containsKey('F'));
        //System.out.println(map.size());
        //System.out.println(map.remove('C'));

        int max=Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        //System.out.println(T.my_solution(n,str));
        System.out.println(T.solution(n,str));
    }
}
