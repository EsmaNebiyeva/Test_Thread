package test1_filehandling;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Asus\\IdeaProjects\\Thread Exception Test");
        rekursiya(file);

    }
    public static void  rekursiya(File file){
        Pattern pattern=Pattern.compile(".*\\.java$");

        if (file.isDirectory()) {

            File[] list = file.listFiles();

            for (File file1 : list) {
              if(pattern.matcher(file1.getName()).matches()){
                  System.out.println(file1.getName());
              }
              rekursiya(file1);
            }
        }
    }
}
