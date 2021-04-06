import java.util.ArrayList;

public class ifexam {
    public static void main(String[] args) {
        // int money = 2000;
        // boolean hasCard = true;
        // if (money >= 3000 || hasCard) {
        //     System.out.println("take a taxi");
        // } else {
        //     System.out.println("walk");

        // ArrayList<String> pocket = new ArrayList<String>();
        // pocket.add("paper");
        // pocket.add("handphon");
        // pocket.add("money");
        // if (pocket.contains("money")) {
        //     System.out.println("take a taxi");
        // } else {
        //     System.out.println("walk");
        // }

        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        if (pocket.contains("money")) {
            System.out.println("take a taxi");
        } else if (hasCard) {
            System.out.println("take a taxi");
        } else {
            System.out.println("walk");
        }
    }
}


/* |, || -> OR
앞이 True 이면 뒤에는 볼것없이 True 이다.
True or Flase => 1개만 확인
True or True  => 1개만 확인
False or True  => 2개다 확인
False or False => False 2개다 확인
    |   = 2개다 따져본다.
    ||  = 앞이 True 이면 뒤는 보지도 않고 True로 해버린다.
적은량의 데이터를 반복 하거나 계산을 할때는 1개와 2개의 차이는 별로 없지만 
많은량의 데이터를 반복 하거나 계산을 할때는 2개를 쓰는 쪽이 더 빠르게 작업을 진행 할 수 있다.

&,&& -> AND
True & False => False   2개 확인
True & True => True     2개 확인
False & True => False   1개 확인
False & False => False  1개 확인
 */