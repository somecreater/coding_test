package section_2;

import java.util.*;

public class problem_8 {

    /*
    int형 n과 int의 배열형 arr을 입력으로 받는다.
    해당 배열을 리스트로 변환하고 나서, 리스트를 오름차순으로 정렬한다.

    정답을 저장할 배열에 ArrayList 클래스의 indexOf 메소드를
    이용해서 arr의 배열의 값이 리스트 내의 어떤 인덱스에 위치 했는지
    를 파악하면 정답을 찾을 수 있다.
    */
    public int[] my_solution(int n, int[] arr){
        int[] answer=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        int min=100,max=0;
        int maxind=0,minind=0;
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            answer[i]=list.indexOf(arr[i])+1;
        }
        return answer;
    }


    /*
    int형 n과 int의 배열형 arr을 입력으로 받는다.
    cnt값을 1로 초기화 시키고 첫번째 요소부터
    모든 요소들을 각각 비교하면서 등수를 계산한다.
    만약 해당 요소보다 다른 요소가 크다면 cnt를 증가시키는 방식으로
    이렇게 하면 정답을 구할 수 있다.
    */
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }
        return answer;
	}

    public static void main(String[] args) {
        problem_8 T= new problem_8();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=T.my_solution(n,arr);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");


    }
}
