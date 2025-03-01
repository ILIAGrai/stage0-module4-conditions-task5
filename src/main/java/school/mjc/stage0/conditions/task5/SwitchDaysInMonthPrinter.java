package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            default:
                System.out.println("out of range");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 6:
            case 4:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
                break;

        }
    }
}
