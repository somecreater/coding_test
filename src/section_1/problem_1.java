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

    public int solution(String str, char t){
        int answer=0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        //System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);

        /*
        String str=sc.nextLine();
        char ch=sc.next().toUpperCase().toCharArray()[0];
        */

        String str=sc.next();
        char c=sc.next().charAt(0);

        //System.out.println(T.my_solution(str,ch));
        System.out.println(T.solution(str,c));
    }
}
