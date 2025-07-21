package section_8;

import java.util.*;

public class problem_1 {

    /*
    하나의 원소를 선택할때마다 지금까지 선택된 원소의 합과 나머지 원소의 합을 비교하고
    만약 같으면 YES 출력하고 알고리즘 중단, 재귀함수를 활용
    */
    static int N;

    public String my_solution(int[] arr,int arrsum, int[] ch,int select, List<Integer> list){

        int subSum=list.stream().reduce(0,Integer::sum);

        if(select>N){
            return "NO";
        }
        if(subSum*2==arrsum){
            return "YES";
        }else {
            select++;

            ch[select] = 1;
            list.add(arr[select]);
            String answer1 = my_solution(arr, arrsum, ch, select, list);

            ch[select] = 0;
            list.remove(Integer.valueOf(arr[select]));
            String answer2 = my_solution(arr, arrsum, ch, select, list);
            ;
            return "YES".equals(answer1) || "YES".equals(answer2) ? "YES" : "NO";
        }
    }

    /*
    전체에서 부분 집합을 뽑아낸다(해당 원소를 사용한다 안한다)(레벨을 계속 내려가면 된다.)
    부분 집합 하나만 구하면 된다. 부분집합을 구하면 여기서 sum 값을 total 에서 빼보자
    만약 같다고 하면 YES 하고 끝내면 된다.(종료)

    D(0,0)(L,sum)
    ex) {1,3,5,6,7,10} D(1,1) D(1,0) -> D(2,4) D(2,1) ...
    */
    static String answer = "NO";
    static int n, total = 0;
    boolean flag=false;
    public void solution(int L, int sum, int[] arr){
        if(flag) return;
        if(sum>total/2) return;
        if(L==n){
            if((total-sum)==sum){
                answer="YES";
                flag=true;
            }
        }else{
            solution(L+1,sum+arr[L],arr);
            solution(L+1,sum,arr);
        }
    }

    public static void main(String[] args) {
        problem_1 T= new problem_1();
        Scanner sc=new Scanner(System.in);
        /*
        int[] ch;
        N=sc.nextInt();
        int[] arr=new int[N+1];
        ch=new int[N+1];
        for(int i=1;i<N+1;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> subList=new ArrayList<>();
        ch[1]=1;
        subList.add(arr[1]);
        int arrsum=Arrays.stream(arr).sum();
        System.out.println(T.my_solution(arr,arrsum,ch,2,subList));
        */

        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;  i++){
          arr[i]=sc.nextInt();
          total+=arr[i];
        }
        T.solution(0,0,arr);
        System.out.println(answer);
    }
}
