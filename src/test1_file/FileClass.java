package test1_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        double sum=0;
        double count=0;
        double avarage;
        for (byte b : fileInputStream.readAllBytes()) {
            try {
                if (!(b <= 57 && b >= 48)) {
                    throw new InvalidDataException();
                }
                sum=sum+b-48;
                count++;
                System.out.println("SUM:"+sum);
            } catch (InvalidDataException invalidDataException) {
                System.out.println("Exception: " + invalidDataException.getMessage());
            }
            finally {

                System.out.println(b);
            }
        }
        fileInputStream.close();
        avarage=sum/count;
        System.out.println("Avarage of sum:"+ avarage);
    }
}
