package partOne;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files {

    public void createFile(String nombre){

        File obj = new File("C:\\User\\Axterix\\dir\\userInput.txt");
    }
    public void newDir(){
        File obj = new File("C:\\Users\\Axterix\\dir");
        obj.mkdir();
    }
    public void moveFile(){
        File obj = new File("C:\\User\\Axterix\\dir\\userInput.txt");
        obj.renameTo(new File("C:\\User\\Axterix\\Documents\\userInput.txt"));

    }
    public void listFiles(String nombre){
        File obj = new File(nombre);
        String[] paths;
        paths = obj.list();

        for(String path: paths){
            System.out.println("path = " + path);
            }


    }
    public void deleteFile(){
        File obj = new File("C:\\User\\Axterix\\dir\\userInput.txt");
        obj.delete();
    }
}
