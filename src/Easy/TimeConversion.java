package Easy;

/**
 * TimeConversion
 */
public class TimeConversion {

   // Time Conversion
   // Converts the 12-hour time to 24-hour format.
   static String timeConversion(String s) {
      int ss = Integer.parseInt(s.substring(0, 2));
      String time = s.substring(2, 8);
      if (s.contains("AM"))
         if (ss == 12)
            return "00" + time;
         else
            return "0" + ss + time;
      else if (ss < 12)
         return (ss + 12) + time;
      return ss + time;
   }
}