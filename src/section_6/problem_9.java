package section_6;

import java.util.Arrays;
import java.util.Scanner;

public class problem_9 {

    /*
    곡의 수, DVD의 수를 n,m으로 곡의 길이를 배열 arr로 입력받는다.
    m개의 DVD에 곡을 나눠 담는데, 최소 용량이어야한다.
    m길이의 배열을 만들어서 거기에 분할된 곡의 길이들을 저장한다
    그리고 첫번째 부터 선택을 늘려가면서 그뒤도 선택을 바꾸는 방식으로
    하나씩 탐색하면 되나?
    */
    public int my_solution(int n, int m, int[] arr){
        int answer=0;
        int min=10001;
        int[] songarr=new int[m];
        for(int i=1;i<m-1;i++){
            songarr[0]+=arr[i];
        }
        return answer;
    }

    /*
    결정 알고리즘을 사용한다 <- 이분검색을 이용하는 알고리즘 이다.
    중간값이 답으로써 가능한 숫자인가를 본다.(최소는 아니지만)
    그러면 더 큰 숫자는 볼 필요가 없다.
    그다음 절반 범위에서 중간값을 다시 가능한지 확인해보면 된다

    ex)9 3 1,2,3,4,5,6,7,8,9
    rt, 가장 큰 범위 값(45) lt, 가장 작은 범위 값(9) mid, 중간값(27)
    중간 값(27) 가능 여부 확인, 2장이 되면 당연히 3장도 된다.
    중간값과 최댓값 을 갱신(27-> 17), (45->26)
    만약 불가하면 더 큰 범위를 검색한다. 이것을 반복하면 된다.
    함수로 가능 여부를 알아본다. 배열과 최대 용량을 입력받고
    for문으로 배열 값을 하나씩 읽어서 sum에 더하면서 만약 최대 용량을 초과하면
    cnt를 1 증가 시킨다(새로운 dvd) sum을 다시 읽어온 값으로 초기화 한다.
    */
    public int count(int[] arr,int capacity){
        int cnt=1,sum=0;
        for(int x:arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else{
                sum+=x;
            }
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr){
        int answer=0;
        int lt=Arrays.stream(arr).max().getAsInt();
        int rt=Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)<=m){
                answer=mid;
                rt=mid-1;
            }else{
                lt=mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_9 T= new problem_9();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println(T.my_solution(n,m,arr));
        System.out.println(T.solution(n,m,arr));
    }
}
