package section_6;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_4 {

    /*
    LRU 알고리즘을 구현하는 문제이다.
    메모리 사이즈 s, 작업 리스트 길이 j, 작업 배열 arr을 입력받는다.
    이것은 ArrayList 자료형을 활용하면 쉽게 푼다.
    arr을 하나씩 읽어 오면서 메모리내 작업이 존재한다면 해당 작업이 있는
    위치에서 작업을 추출해서 맨 처음에 추가하고 해당 위치의 작업을 삭제 시킨다.
    만약 존재하지 않고 아직 메모리가 비어있다면, 맨 처음에 작업을 추가하면 된다.
    만약 존재하지 않고, 메모리가 다 차있으면, 맨처음에 작업을 추가하고 가장 뒤에 있는
    작업을 삭제하면 된다.
    해당 작업이 끝나고 잔여 메모리에 0을 채우면 문제를 풀 수 있다.
    */
    public ArrayList<Integer> my_swap(int i, int j, ArrayList<Integer> list){
        int tmp=list.get(i);
        list.add(i,list.get(j));
        list.remove(j+1);
        return list;
    }

    public ArrayList<Integer> my_solution(int s, int n,int[] arr){
        ArrayList<Integer> memory=new ArrayList<>();

        for(int i=0;i<n;i++){
            int job=arr[i];
            //메모리에 작업이 존재하면
            if(memory.contains(job)) {
                int j=memory.indexOf(job);
                memory=my_swap(0,j,memory);
            }else{
                if(memory.size()<s){
                    memory.add(0,job);
                }else{
                    memory.remove(memory.size()-1);
                    memory.add(0,job);
                }
            }
            /*
            for(int a:memory){
                System.out.print(a+" ");
            }
            System.out.println();
            */
        }
        if(memory.size()<s){
            for(int i=memory.size()-1;i<s;i++){
                memory.add(0);
            }
        }

        return memory;
    }

    /*
    배열로 한번 풀어보자
    cache 사이즈를 s로 잡는다.
    만약 메모리에 작업이 없으면 c[i]=c[i-1] 이런식으로 뒤로 밀고 0 번에 현재 작업을 넣는다.
    만약 작업이 존재하면 1번 부터 작업이 존재하는 곳까지 뒤로 민다 0 번에는 현재 작업을 넣는다.
    작업 존재 여부는 배열을 직접 탐색한다.
    */
    public int[] solution(int size, int n, int[] arr){
        int[] cache=new int[size];
        for(int x : arr){
            int pos=-1;
            for(int i=0; i<size; i++) if(x==cache[i]) pos=i;
            if(pos==-1){
                for(int i=size-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            else{
                for(int i=pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }

    public static void main(String[] args) {
        problem_4 T= new problem_4();
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        /*
        for(int a:T.my_solution(s,n,arr)){
            System.out.print(a+" ");
        }
        */
        for(int a:T.solution(s,n,arr)){
            System.out.print(a+" ");
        }

    }
}
