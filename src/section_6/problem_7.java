package section_6;

import java.util.*;

class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

public class problem_7 {

    /*
    잘 모르겠다.
    */
    public class point{
        int x=0;
        int y=0;
        public ArrayList<point> sort(List<point> ptlist){
            ArrayList<point> list=new ArrayList<>();
            //Collections.sort(ptlist);
            return list;
        }
    }
    public int[][] my_solution(int n, int[][] arr){
        int[][] answer=new int[n][2];

        int[] arrsum=new int[n];
        for(int i=0;i<n;i++){

        }
        return arr;
    }

    /*
    좌표값을 따로 저장하기 위해 Point 클래스를 만들자
    그리고 Comparable 인터페이스를 상속받아서 구현하자(비교 이용)

    compareTo 메소드에서 this는 앞이고 매개변수 O는 뒤이다.
    this, o 이런식으로 정렬되려면(오름차순), this-o에 대해
    음수값 리턴이 필요하다
    내림 차순이면 this가 크고 o가 작은 것이므로
    o-this에 대해 음수값 리턴이 필요하다.
    */


    public static void main(String[] args) {
        /*
        problem_7 T= new problem_7();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int[] a:T.my_solution(n,arr)){
            System.out.print(a[0]+" "+a[1]);
        }
        */

        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Point> arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+" "+o.y);
    }
}
