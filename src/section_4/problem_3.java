package section_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class problem_3 {

    /*
    자연수 n 과 k 그리고 매출액 기록인 자연수 배열 arr 을 입력받는다.
    이것도 hashmap을 이용하면 된다.(매출액, 수)
    초기에만 k칸 만큼 매출액 종류를 조사하고 그 뒤에는 앞뒤로
    더하거나 빼면서 조사하면 될거 같다.
    */
    public ArrayList<Integer> my_solution(int n, int k, int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<Integer,Integer> kmap=new HashMap<>();

        for(int i=0;i<=k-1;i++){
            if(!kmap.containsKey(arr[i])) {
                kmap.put(arr[i], 1);
            }else{
                int x=kmap.get(arr[i]);
                kmap.replace(arr[i],x+1);
            }
        }

        answer.add(kmap.keySet().size());
        for(int rt=k;rt<n;rt++){

                if(kmap.get(arr[rt-k])==1){
                    kmap.remove(arr[rt-k]);
                }else{
                    int x=kmap.get(arr[rt-k]);
                    kmap.replace(arr[rt-k],x-1);
                }

                if(!kmap.containsKey(arr[rt])) {
                    kmap.put(arr[rt], 1);
                }else{
                    int x=kmap.get(arr[rt]);
                    kmap.replace(arr[rt],x+1);
                }
                answer.add(kmap.keySet().size());
        }

        return answer;
    }


    /*

    */
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer=new ArrayList<>();

        return answer;
    }

    public static void main(String[] args) {
        problem_3 T= new problem_3();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> answer=T.my_solution(n,k,arr);
        for(int a:answer){
            System.out.print(a+" ");
        }
    }
}
