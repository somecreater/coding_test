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
    긴 문자열: s1, 짧거나 같은 길이 문자열: s2
    s2를 가지고 HashMap<문자, 개수> 자료형을 만든다.
    그리고 인덱스 s2 길이-1 만큼 s1을 가지고 부분 문자열을 만들고
    같은 자료형을 만든다.
    인덱스 lt와 rt를 활용하는데 rt는 인덱스 s2 길이부터 끝까지 돈다.
    rt가 증가함에 따라 s1의 HashMap 자료형도 수정하고
    HashMap 클래스의 equals 메소드를 활용해서 비교해본다.
    만약 같으면 아나그램이다.
    그리고 lt에 있는 것도 삭제시키고 lt도 증가시킨다.
    */
    public int solution(String a, String b){
        int answer=0;
        HashMap<Character, Integer> am=new HashMap<>();
        HashMap<Character, Integer> bm=new HashMap<>();
        for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
        int L=b.length()-1;
        for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
        int lt=0;
        for(int rt=L; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
            if(am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
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
