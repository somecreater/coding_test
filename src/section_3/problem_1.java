package section_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problem_1 {

    /*
        두개의 int형 정수와 두개의 int형 배열을 입력으로 받는다,
        두개의 배열에서 처음부터 하나의 요소를 꺼내면서 더 작은 것을 새로운 배열에
        추가하고 해당 요소가 나온 배열의 인덱스를 1씩 증가 시킨다.
        만약 둘중 하나의 배열을 모두 검사했다면 다른 배열의 남은 요소들을
        새로운 배열 끝에 추가하면 된다.
    */
    public void my_solution(int n1,int[] a,int n2,int[] b){
        int[] answer=new int[n1+n2];
        int index=0,ain=0,bin=0;
        while(index!=n1+n2){
            if(n1==ain){
                answer[index]=b[bin];
                bin++;
            }else if(n2==bin){
                answer[index]=a[ain];
                ain++;
            }else{
                if(a[ain]<b[bin]){
                    answer[index]=a[ain];
                    ain++;
                }else{
                    answer[index]=b[bin];
                    bin++;
                }
            }
            System.out.print(answer[index]+" ");
            index++;
        }

    }

    /*
        내가 푼 방식하고 비슷하다. (포인터의 개념)
        ArrayList로 정답 출력, 각각의 포인터 둘다
        다만 포인터의 크기에 따라 세가지 경우로 나눠서 푼다.
        둘다 배열의 길이보다 작은 경우, 둘중에 하나만 배열의 길이보다
        작은 경우
    */
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        /*
        T.my_solution(n,a,m,b);
        */
        for(int x : T.solution(n, m, a, b))
            System.out.print(x+" ");

    }
}
