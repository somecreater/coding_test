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
    자연수 n,k, 그리고 배열 arr을 입력 받는다.
    인덱스 rt,lt를 이용한다.

    먼저 for문이 k-1바퀴 돌아서 초기 세팅을 하고,
    그다음에 rt가 돌면서 lt가 쫓아오는 방식으로 푼다.
    rt가 인덱스 k부터 끝까지 돈다.
    한 바퀴마다, HashMap에 새로운 값을 추가하거나 그 전의 값을 제거하는
    방식을 이용한다.(lt, rt 활용) 이 과정을 수행하고 나서 HashMap의 size 메소드를 활용하면
    값의 종류 개수를 구할 수 있다.
    특히 뺄때 0이면 키를 삭제해야한다. 더할때 이미 기존에 있는 값이면 해당 키에 대한
    값만 증가
    */
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
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
        //ArrayList<Integer> answer=T.my_solution(n,k,arr);
        ArrayList<Integer> answer=T.solution(n,k,arr);
        for(int a:answer){
            System.out.print(a+" ");
        }
    }
}
