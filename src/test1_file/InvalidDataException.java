package test1_file;

public class InvalidDataException extends Exception {
  @Override
 public String  getMessage(){
     return "Invalid Data var";
 }
}
