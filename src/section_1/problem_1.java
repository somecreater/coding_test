package section_1;

import java.util.Scanner;

public class problem_1 {

    public int my_solution(String str, char c){
        int answer=0;
        char[] strtoarr=str.toUpperCase().toCharArray();

        for(char obj:strtoarr){
            if(obj==c){
                answer+=1;
            }
        }

        return answer;
    }

    public int solution(String str, char c){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().toUpperCase().toCharArray()[0];
        System.out.println(T.my_solution(str,ch));
        //System.out.println(T.solution(str,ch));
    }
}
