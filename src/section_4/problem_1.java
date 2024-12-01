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

    */
    public char solution(int n, String str){
        char answer=Character.MIN_VALUE;

        return answer;
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        System.out.println(T.my_solution(n,str));
    }
}
