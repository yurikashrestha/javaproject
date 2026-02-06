public class timeconverter {


   public static void main(String [] args ){
       int totalNoOfSeconds = 15862;
       int hours = totalNoOfSeconds/ 3600;
       int remainSeconds = totalNoOfSeconds % 3600;

       int minutes = remainSeconds/60 ;
       int seconds = remainSeconds/60 ;
       System.out.println("There are " + hours + " hours and " + minutes + "minutes and " + seconds + "seconds in 15682 seconds.");
   }
}
