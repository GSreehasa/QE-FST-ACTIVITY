package javatraining;

import java.io.File;
import org.apache.commons.io.FileUtils;


public class Activity14 {
    public static void main(String[] args) throws Exception {

        File file = new File("ssfile.txt");
        file.createNewFile();

        FileUtils.writeStringToFile(file, "Hello FileUtils", "UTF-8");

        File newFile = FileUtils.getFile("ssfile.txt");
        String data = FileUtils.readFileToString(newFile, "UTF-8");

        System.out.println(data);
    }
}

