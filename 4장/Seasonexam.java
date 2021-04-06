public class Seasonexam {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case 12: 
            case 1:  
            case 2:  monthString = "Winter";
                     break;
            case 3:
            case 4:
            case 5: monthString = "Spring";
                    break;
            case 6:
            case 7:
            case 8: monthString = "summer";
                    break;
            case 9:  
            case 10: 
            case 11: monthString = "Autumn";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}

