package date_util;
 import test1_file.InvalidDataException;

 import java.time.*;
 import java.util.Date;
 import java.util.Scanner;

public class DateTimeUtils {
 public LocalDate localDate;

 public static int differenceDateWithMonth(LocalDate maxDate, LocalDate minDate) {
  int sum = 0;
  try {
   if (maxDate.isAfter(minDate)) {
    int year = maxDate.getYear() - minDate.getYear();
    int month = maxDate.getMonthValue() - minDate.getMonthValue();
    int day= maxDate.getDayOfMonth()-minDate.getDayOfMonth();
    if (year != 0) {
     if (day >= 0 ) {
      sum = year * 12 + month;
     } else if(day<0){
      sum=year*12+month-1;
     }
    }else {
     sum = year;
    }
   } else {
    throw new DateTimeException("Dogru tarix siralamasi yoxdur");
   }
  } catch (DateTimeException e) {
   System.out.println("Message: " + e.getMessage());
  }
  catch (Exception e){
   System.out.println("Message: " + e.getMessage());
  }
   return sum;
 }
// public static LocalDate formatDate(String year_month_day,String regex){
//  LocalDate localDate = null;
//  int year;
//  int month;
//  int day;
//  try{
//   if(year_month_day.length()!=10){
//   String[] dates=year_month_day.split(regex);
//    year= Integer.parseInt(dates[0]);
//   System.out.println(year);
//    month=Integer.parseInt(dates[1]);
//   System.out.println(month);
//    day=Integer.parseInt(dates[2]);
//   System.out.println(day);
// localDate=LocalDate.of(year,month,day);
//  } else{
//   throw new InvalidDataException();
//  }
//  }
//  catch (InvalidDataException e){
//   System.out.println("Message: "+ e.getMessage());
//  }
//  catch (Exception e){
//    System.out.println("Message: " + e.getMessage());
//  }
//  return localDate;
// }
 public static void main(String[] args) {
  LocalDate maxDate=LocalDate.now();
  LocalDate minDate=LocalDate.of(2023,3,27);
  System.out.println(differenceDateWithMonth(maxDate,minDate));
  //formatDate("2022-12-23","-");
  //System.out.println(formatDate("2022-12-23","-"));
 }
}

