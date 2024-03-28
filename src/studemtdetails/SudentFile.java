package studemtdetails;

import test1_file.InvalidDataException;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SudentFile {
    public static void main(String[] args) throws IOException {
        File file=new File("student.txt");
        file.createNewFile();
        file.canWrite();
        FileWriter fileWriter=new FileWriter(file,true);
        fileWriter.write(new Student("Esma",19,10).toString()+"\n");
        fileWriter.write(new Student("Esra",14,10).toString()+"\n");
        fileWriter.write(new Student("Esmer",7,10).toString()+"\n");
        fileWriter.write(new Student("Esra",1,10).toString()+"\n");
        fileWriter.write(new Student("Esmdfd",345676,10).toString()+"\n");
       fileWriter.close();
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        List<String> list = bufferedReader.lines().collect(Collectors.toList());
        double sum=0;
        int count=0;
        while(!(list.isEmpty())){
            String[] soz = list.getFirst().split("=");
            try {
                int i = Integer.valueOf(soz[3]);
                if(i==0 ){
                    throw new InvalidDataException();

                }
                System.out.println(soz[3]);
                sum=sum+ i;
                count++;

            }
            catch (InvalidDataException e){
                System.out.println("Message(INVALID): "+ e.getMessage());
            }
            catch (Exception e){
                System.out.println("Message: "+ e.getMessage());
            }
            finally {
                list.removeFirst();
            }

        }
        sum=sum/count;
        System.out.println(sum);
        bufferedReader.close();
    }
}
