import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import jdk.nashorn.internal.runtime.NumberToString;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        int sum= 0;
        try(FileReader read  = new FileReader("D:\\Файлы\\java\\JavaCode\\Tasks2\\src\\fileinput1.txt")) {
            int str = read.read()-48; read.read();
            int x = read.read()-48;
              sum = str+x;
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileWriter writer  = new FileWriter("D:\\Файлы\\java\\JavaCode\\Tasks2\\src\\fileoutput1.txt")) {

            writer.write(Integer.toString(sum));
            writer.close();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
