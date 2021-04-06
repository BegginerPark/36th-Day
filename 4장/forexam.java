public class forexam {
    public static void main(String[] args) {
        // String[] numbers = {"one","two","three"};
        // for (int i = 0; i<numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // int[] marks = {90,25,67,45,80};
        // for (int i = 0; i < marks.length; i++) {
        //     if (marks[i] >= 60) {
        //         System.out.println((i+1) + " student is pass");
        //     } else {
        //         System.out.println((i+1)+ " student is fail");
        //     }
        // }

        // 구구단 (2중 for 문)
        for (int i = 2; i<10; i++) {
            for (int j = 1; j<10; j++) {
                System.out.print(i*j+ " "); // 일반적으로 print 뒤에 ln 이 없으면 줄을 바꾸지 않는다.
            }
        System.out.println(" ");
        
        }
    }
}


// for (초기치; 조건문; 증가치)