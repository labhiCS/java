import java.io.FileInputStream;

public class TryCatch {
    public static void main(String[] args) throws Exception{

        //Create a new file and copy and past the file path here"C://..."!!!!
        String filePath = "C://Desktop//abhi.text";
        FileInputStream fis = null;
        
        // FileInputStream fis = new FileInputSteream()

        fis = new FileInputStream(filePath);
        int content;

        while((content = fis.read()) != 1){
            // Priting the content (cast to chat to display characters
            System.out.println((char) content);
        }

        fis.close();
    }
    
}