public class Soal8 {
    public static void main(String[] args) {


                int year = 2024;
                int month = 3;
                int day = 5;


                boolean isLeap = false;
                if (year % 4 == 0) {
                    if (year % 100 != 0 || year % 400 == 0) {
                        isLeap = true;
                    }
                }


                int daysInMonth = 0;
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        daysInMonth = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        daysInMonth = 30;
                        break;
                    case 2:

                        if (isLeap) {
                            daysInMonth = 29;
                        } else {
                            daysInMonth = 28;
                        }
                        break;
                    default:

                        break;
                }


                int dayOfYear = 0;


                for (int m = 1; m < month; m++) {
                    int daysInPreviousMonth = 0;


                    switch (m) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            daysInPreviousMonth = 31;
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            daysInPreviousMonth = 30;
                            break;
                        case 2:
                            if (isLeap) {
                                daysInPreviousMonth = 29;
                            } else {
                                daysInPreviousMonth = 28;
                            }
                            break;
                    }
                    dayOfYear += daysInPreviousMonth;
                }


                dayOfYear += day;



                System.out.println("Input:");
                System.out.println(year);
                System.out.println(month);
                System.out.println(day);

                System.out.println("\nOutput:");
                System.out.println("leap=" + isLeap);
                System.out.println("daysInMonth=" + daysInMonth);
                System.out.println("dayOfYear=" + dayOfYear);
            }
        }

