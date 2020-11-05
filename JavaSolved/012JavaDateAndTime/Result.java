import java.util.Calendar;
abstract class CalendarRE extends Calendar{
     static int  getDayOfWeek(int year,int month,int day){
         Calendar calendar= Calendar.getInstance();
            calendar.set(year,month-1,day);
            //because --> 0->Jan,1->Feb,...,11->Dec in The Calender Class
            return calendar.get(Calendar.DAY_OF_WEEK);
            }
}
public abstract class Result extends CalendarRE{

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        int dayOfWeek=CalendarRE.getDayOfWeek(year,month,day);
         String[] weekList = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY",};
         
         return weekList[dayOfWeek-1];
    }

}
