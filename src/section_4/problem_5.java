package section_4;

import java.util.*;

public class problem_5 {

    /*
    n: 카드의 수, k: 카드 3장을 뽑고 합한 값 중 k 번째로 큰 값,
    arr: 소유한 카드 값의 리스트
    입력된 리스트에서 3장을 선출해서 합을 구하고 HashMap<Integer, Integer> 자료형에
    추가하는 방식으로 합이 중복되지 않도록 추가한다.
    그리고 해당 HashMap 자료형의 키들을 ArrayList로 변환하고, 내림차순으로 정렬하고나서
    인덱스 k-1번째의 값을 구하면 답을 구할 수 있다.
    */
    public int my_solution(int n, int k, ArrayList<Integer> arr){
        int answer=0;
        HashMap<Integer,Integer> summap=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                for(int l=j+1;l<arr.size();l++){
                    int x=arr.get(i);
                    int y=arr.get(j);
                    int z=arr.get(l);
                    int sum=x+y+z;

                    if(!summap.containsKey(sum)){
                        summap.put(sum,1);
                    }else{
                        summap.put(sum,summap.getOrDefault(sum,0)+1);
                    }
                }
            }
        }
        List<Integer> sumlist= new ArrayList<>(summap.keySet());
        Collections.sort(sumlist,Comparator.reverseOrder());
        try {
            answer = sumlist.get(k - 1);
        }catch (Exception e){
            answer=-1;
        }
        return answer;
    }


    /*

    */
    public int solution(int n, int k, ArrayList<Integer> arr){
        int answer=0;

        return answer;
    }

    public static void main(String[] args) {
        problem_5 T= new problem_5();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr.add(x);
        }
        int answer=T.my_solution(n,k,arr);

        System.out.println(answer);
    }
}
