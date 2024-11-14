package section_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_10 {

    /*
    일단 문장과 문자를 입력으로 받고, 해당 문장을 String 클래스의
    replaceAll 메소드를 활용해서 0으로 변환하고
    split 메소드를 활용해서 원래 문장을 나누고 나서, 나눠진 단어들을
    거리로 변환하려고 했지만 실패했다.
    */
    public String my_solution(String str,String charstr){
        String answer="";
        int[] intanswer=new int[str.length()];
        String orgstr=str.replace(charstr,"0");
        String[] orgstrarr=orgstr.split("0");
        if(orgstr.indexOf("0")!=0){

        }else{

        }
        return answer;
    }


    /*
       일단 거리 값 p의 초기값을 1000으로 두고 처음에
       해당 문자가 아니면 1001로 놓는다. 만약 해당 문자를 만나면
       배열에 넣을 p값을 0으로 놓고 그후로 안만나면 1,2,3, 이런식으로 증가 시키다가
       해당 문자를 만나면 0으로 놓고 다시 1,2,3 이런식으로 증가 시킨다.
       이제는 다시 for 문이 거꾸로 돈다.
       배열에서 0을 만나면 p값을 0으로 두고 0을 만나기 전까지 1,2,3 이런식으로
       증가 시키지만, 이제는 p값과 배열내의 값을 비교해서 가장 작은 값을 배열에
       집어 넣는다.

    */
    public int[] solution(String s, char t){
        int[] answer=new int[s.length()];
        int p=1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        problem_10 T= new problem_10();/*
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String charstr=sc.next();
        System.out.println(T.my_solution(str,charstr));
        */
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
