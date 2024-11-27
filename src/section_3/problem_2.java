package section_3;

import java.util.*;

public class problem_2 {

    /*
        전부 리스트로 입력 받고 오름차순으로 정렬하고
        일일히 검사해서 풀려고 했지만 풀리지 않았다.
    */
    public ArrayList<Integer> my_solution(int n1, ArrayList<Integer> a,
                            int n2, ArrayList<Integer> b){
       Collections.sort(a);
       Collections.sort(b);
       int aind=0,bind=0;
       ArrayList<Integer> answer=new ArrayList<>();
       while(true){
           if(n1<=aind){
               break;
           }
           if(n2<=bind){
               break;
           }

           if(a.get(aind)==b.get(bind)){
               answer.add(a.get(aind));
               aind++;
               bind++;
           }else if(a.get(aind)>b.get(bind)){
               bind++;
           }else{
               aind++;
           }

       }
        return answer;
    }

    /*
        두 배열의 크기와 두 배열을 입력받고
        배열을 오름차순으로 정렬해야한다.
        만약 a배열 내 요소가 b배열 내 요소보다 작다면 a 배열을 가리키는
        인덱스를 증가시킨다. 만약 같다면 answer에 추가하고 둘다 가리키는 인덱스를
        증가 시킨다. 아무 쪽이나 하나 끝나면 끝이다.
    */
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]==b[p2]){
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1]<b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);
        /*
        int n=sc.nextInt();
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            alist.add(a);
        }
        int m=sc.nextInt();
        ArrayList<Integer> blist=new ArrayList<>();
        for(int i=0;i<m;i++){
            int b=sc.nextInt();
            blist.add(b);
        }

        for(int x:T.my_solution(n,alist,m,blist))
        {
            System.out.print(x+" ");
        }*/
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");

    }
}
