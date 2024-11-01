import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
public class CountDown{
  public static void main(String[] args) {
      Timer timer = new Timer();
      TimerTask task = new TimerTask(){
        static int counter = 10;
        @Override
        public void run(){
          System.out.println(--counter);
          if(counter==0){
            System.out.println("----TASK COMPLETED----");
            timer.cancel();
          }
        }
      };

      Calendar date = Calendar.getInstance();
      date.set(Calendar.YEAR,2024);
      date.set(Calendar.MONTH,Calendar.NOVEMBER);
      date.set(Calendar.DAY_OF_MONTH,1);
      date.set(Calendar.HOUR_OF_DAY,11);
      date.set(Calendar.MINUTE,40);

      timer.scheduleAtFixedRate(task, 0, 500);
  }
}