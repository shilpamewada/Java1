package Ifelse;

public class LeapYear {
    
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600)); 
        System.out.println(isLeapYear(1800));
  
    }
}
