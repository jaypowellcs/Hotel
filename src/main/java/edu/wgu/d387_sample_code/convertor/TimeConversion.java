package edu.wgu.d387_sample_code.convertor;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimeConversion implements Runnable {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    public static String TimeConverter() {



        ZoneId zEastern=ZoneId.of("America/New_York");
        ZoneId zMountain=ZoneId.of("America/Denver");
        ZoneId zUTC = ZoneId.of("UTC");
        ZoneId zoneId=ZoneId.systemDefault();

        LocalDateTime localDateTime=LocalDateTime.now();
        String localTime = localDateTime.toString();


        ZonedDateTime zonedDateTime=localDateTime.atZone(zoneId);


        //Eastern Time Conversion
        ZonedDateTime zonedDateTimeEastern=zonedDateTime.withZoneSameInstant(zEastern);
        LocalDateTime localDateTimeEastern=zonedDateTimeEastern.toLocalDateTime();
        LocalDateTime easternTime = LocalDateTime.parse(localDateTimeEastern.toString());
        String easternTimeString = easternTime.format(formatter);

        //Pacific Time Conversion
        ZonedDateTime zonedDateTimeMountain=zonedDateTime.withZoneSameInstant(zMountain);
        LocalDateTime localDateTimeMountain=zonedDateTimeMountain.toLocalDateTime();
        LocalDateTime mountainTime = LocalDateTime.parse(localDateTimeMountain.toString());
        String mountainTimeString = mountainTime.format(formatter);

        //UTC Conversion
        ZonedDateTime zonedDateTimeUTC=zonedDateTime.withZoneSameInstant(zUTC);
        LocalDateTime localDateTimeUTC=zonedDateTimeUTC.toLocalDateTime();
        LocalDateTime utcTime = LocalDateTime.parse(localDateTimeUTC.toString());
        String utcTimeString = utcTime.format(formatter);



        return easternTimeString + " Eastern Time " + mountainTimeString + " Mountain Time " + utcTimeString + " UTC Time";
    }

    @Override
    public void run() {
        //test if message is running
        System.out.println(TimeConverter());
    }
}
