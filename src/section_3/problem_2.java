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

    */
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }

    public static void main(String[] args) {
        problem_2 T= new problem_2();
        Scanner sc=new Scanner(System.in);
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
        }

    }
}
