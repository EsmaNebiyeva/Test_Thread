package test1_filehandling;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class FileHandling {
    static int count=0;
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Asus\\IdeaProjects\\Thread Exception Test");
        rekursiya(file);
        System.out.println("Sonu: "+count);
    }
    public static void  rekursiya(File file){
        Pattern pattern=Pattern.compile(".*\\.java$");

        if (file.isDirectory()) {

            File[] list = file.listFiles();

            for (File file1 : list) {
              if(pattern.matcher(file1.getName()).matches()){
                  count++;
                  System.out.println(file1.getName());
                  System.out.println("TODO");
              }
              rekursiya(file1);
            }
        }
    }
}
