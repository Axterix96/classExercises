package partOne;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files {

    public static void createFile(){
        File obj = new File("C:\\User\\Axterix\\dir\\userInput.txt");
    }
    public static void newDir(){
        File obj = new File("C:\\Users\\Axterix\\dir");
        obj.mkdir();
    }
    public static void moveFile(){
        File obj = new File("C:\\User\\Axterix\\dir\\userInput.txt");
        obj.renameTo(new File("C:\\User\\Axterix\\Documents\\userInput.txt"));

    }
    public static void listFiles(){
        File obj = new File("C:\\User\\Axterix\\dir\\userInput.txt");
        obj.renameTo(new File("C:\\User\\Axterix\\dir\\userInput.txt.bck"));
        String[] paths;
        paths = obj.list();

        for(String path: paths){
            System.out.println("path = " + path);
            }


    }
    public static void deleteFile(){
        File obj = new File("C:\\User\\Axterix\\dir\\userInput.txt");
        obj.delete();
    }

}
