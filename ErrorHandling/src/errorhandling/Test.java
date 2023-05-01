
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class ReadAndWrite{
    
    void readFile() throws FileNotFoundException
    {
        
        FileInputStream fis = new FileInputStream("D:/abc.txt");
        //statements
        
    }
    void saveFile() throws FileNotFoundException
    {
        String text= "hello world";
        FileOutputStream fos = new FileOutputStream("D:/xyz.txt");
        //statements
    }
    
}

public class Test {
    
    public static void main(String[]args)
    {
        ReadAndWrite rw = new ReadAndWrite();
        try{
        rw.readFile();
    }catch(FileNotFoundException e)
    {
        System.out.println("Exception");
    }
        ReadAndWrite RW= new ReadAndWrite();
        try{
        RW.saveFile();
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("After Exception");
    }
}
