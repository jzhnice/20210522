package Demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-22 13:18
 */
public class Demo04 {

    public void writeFile() throws IOException, FileNotFoundException {
        FileOutputStream out = new FileOutputStream("d:\\test.txt");
        String str = "好好学习Java";
        byte[] words = str.getBytes();
        out.write(words);
        out.flush();
        out.close();

    }
    public static void main(String[] args) throws IOException {
        new Demo04().writeFile();
    }
}
