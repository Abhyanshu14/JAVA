import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);//date
        LocalTime time=LocalTime.now();
        System.out.println(time);//local time
        Instant instant=Instant.now();
        System.out.println(instant);//utc time 


        LocalDateTime datetime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newdatetime=datetime.format(formatter);
        System.out.println(newdatetime);

        LocalDateTime date1=LocalDateTime.of(2024,12,25,0,0,0);
        LocalDateTime date2=LocalDateTime.of(2025,1,1,12,0,0);

        if(date1.isBefore(date2)){
            System.out.println(date1 +"is before "+date2);
        }

    }
}
