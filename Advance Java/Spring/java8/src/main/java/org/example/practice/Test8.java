package org.example.practice;
import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//Parse a date string into LocalDate using the java.time package.
public class Test8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("1993-09-18");
        System.out.println(localDate);
        String myDate = "18/09/1993";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(dateTimeFormatter));
    }
}
