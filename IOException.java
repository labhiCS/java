
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOException {
    public static void main(String[] args) throws Exception{
        String filePath = "C://Desktop//abhi.text";
        FileInputStream fis = null;
        
        // FileInputStream fis = new FileInputSteream()
        try{
            fis = new FileInputStream(filePath);
            int content;

            while((content = fis.read()) != 1){
                // Priting the content (cast to chat to display characters
                System.out.println((char) content);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        fis.close();
    }
    
}