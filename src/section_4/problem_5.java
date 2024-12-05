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
    여기서는 자료형 TreeSet 을 활용한다.
    그리고 Collections.reverseOrder() 를 이용해서 값들을 내림차순으로
    저장하도록 설정한다.
    삼중 for문을 이용해서 배열 arr에서 3개의 값을 뽑고 합을
    TreeSet에 추가하면 된다.
    그리고 하나씩 추출하면서 k번째의 값을 찾았을때 해당 값을 출력하면 된다.
    TreeSet 클래스의 remove 메소드는 원소 제거,
    size 메소드는 원소의 총 개수를 출력하고,
    first 메소드는 제일 앞의 원소를 가져온다(내림차순이므로 가장 큰값),
    last 메소드는 제일 뒤의 원소를 가져온다
    */
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());

        for (int x : Tset) {
            //System.out.println(x);
            cnt++;
            if (cnt == k) return x;
        }
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
