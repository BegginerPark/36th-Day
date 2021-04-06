public class whileexam {
    public static void main(String[] args) {
        // int treeHit = 0;
        // while (treeHit < 10) {
        //     treeHit++;
        //     System.out.println("Hit the tree" + treeHit + "times");
        //     if (treeHit == 10) {
        //         System.out.println("tree is fall");
        //     }
        // }

        // int coffee = 10;
        // int money = 300;
        // while (money > 0) {
        //     System.out.println("Give a coffee");
        //     coffee--;
        //     System.out.println(coffee + " left");
        //     if (coffee == 0) {
        //         System.out.println("Sold Out");
        //         break;
        //     }
        // }

        int a = 0;
        while (a<10) {
            a++;
            if (a%2 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
