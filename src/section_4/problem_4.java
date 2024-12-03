package section_4;

import java.util.HashMap;
import java.util.Scanner;

public class problem_4 {

    /*
    s2 문자열이 s1 문자열의 부분 문자열의 아나그램이 되려면,
    s2에 속한 문자들의 종류와 수가 해당 부분 문자열과 같아야한다.
    즉 길이가 같아야한다.
    s1에서 부분 문자열을 뽑고 아나그램 여부를 확인하면 된다.
    s2 문자열을 HashMap 자료형<문자, 개수>으로 저장한다.
    그리고 s1에서 s2 문자열의 길이만큼 String 클래스의 substring 메소드로
    부분 문자열을 만들고 해당 부분 문자열을 HashMap 자료형<문자, 개수>으로
    만들고 s2 문자열의 HashMap 자료형과 비교해서 아나그램 여부를 검사한다.
    */
    public int my_solution(String s1, String s2){
        int answer=0;
        boolean isanswer=true;
        int lt=0,rt=0;
        String substr="";
        char[] s2arr=s2.toCharArray();
        HashMap<Character,Integer> s2map=new HashMap<>();
        HashMap<Character,Integer> submap=new HashMap<>();
        for(char c:s2arr){
            if(!s2map.containsKey(c)){
                s2map.put(c,1);
            }
            else {
                int x=s2map.get(c);
                s2map.replace(c, x + 1);
            }
        }

        for(rt=s2.length();rt<=s1.length();rt++){
            submap.clear();
            substr=s1.substring(lt,rt);
            char[] charr=substr.toCharArray();

            for(char c:charr){
                submap.put(c,submap.getOrDefault(c,0)+1);
            }

            for(char c:submap.keySet()){
                if(submap.get(c)!=s2map.getOrDefault(c,0)){
                    isanswer=false;
                }
            }

            if(isanswer){
                answer++;
            }
            isanswer=true;
            lt++;
        }
        return answer;
    }

    /*

    */
    public int solution(String s1, String s2){
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(T.my_solution(s1,s2));
    }
}
