package day3.Enum;

public class Main {
    public static void main(String[] args) {

        // memanggil enum dalam class yang sama
        EnumDay today = EnumDay.FRIDAY;
        switch (today) {
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("day is not valid");
        }

        //enum class
        EnumLikeClass getToday = EnumLikeClass.MONDAY;
        System.out.println("today is : " + getToday + " and it's a " + getToday.getType());
    }
}
