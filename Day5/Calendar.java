package programs;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int year = 2018; // Change this to the desired year
		        int month = 8;   // Change this to the desired month (1 for January, 2 for February, etc.)

		        printCalendar(year, month);
		    }

		    public static void printCalendar(int year, int month) {
		        String monthName = getMonthName(month);
		        int numDays = getNumDaysInMonth(year, month);
		        int startDay = getStartDay(year, month);
		        
		        System.out.println(monthName + " " + year);
		        System.out.println("Su Mo Tu We Th Fr Sa");
		        
		        // Print the leading spaces
		        for (int i = 0; i < startDay; i++) {
		            System.out.print("   ");
		        }
		        
		        // Print the days
		        for (int day = 1; day <= numDays; day++) {
		            System.out.printf("%2d ", day);
		            if ((day + startDay) % 7 == 0) {
		                System.out.println();
		            }
		        }
		    }

		    public static String getMonthName(int month) {
		        switch (month) {
		            case 1:  return "January";
		            case 2:  return "February";
		            case 3:  return "March";
		            case 4:  return "April";
		            case 5:  return "May";
		            case 6:  return "June";
		            case 7:  return "July";
		            case 8:  return "August";
		            case 9:  return "September";
		            case 10: return "October";
		            case 11: return "November";
		            case 12: return "December";
		            default: return "";
		        }
		    }

		    public static int getNumDaysInMonth(int year, int month) {
		        int numDays;
		        switch (month) {
		            case 2:
		                numDays = isLeapYear(year) ? 29 : 28;
		                break;
		            case 4:
		            case 6:
		            case 9:
		            case 11:
		                numDays = 30;
		                break;
		            default:
		                numDays = 31;
		        }
		        return numDays;
		    }

		    public static boolean isLeapYear(int year) {
		        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		    }

		    public static int getStartDay(int year, int month) {
		        // Zeller's Congruence Algorithm
		        int q = 1; // Day of the month
		        if (month < 3) {
		            month += 12;
		            year -= 1;
		        }
		        int k = year % 100;
		        int j = year / 100;
		        int m = month;
		        int h = (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) - (2 * j)) % 7;
		        return (h + 6) % 7; // 0 for Sunday, 1 for Monday, ..., 6 for Saturday
		    }
		}


