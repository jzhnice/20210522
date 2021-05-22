package Demo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-22 10:56
 */
public class Demo03 {
    File file = new File("D\\test.txt");
    FileOutputStream out = new FileOutputStream(file);

    FileOutputStream out1 = new FileOutputStream("D:\\test.txt");
    FileOutputStream out2 = new FileOutputStream("D:\\test,txt",true);

    public Demo03() throws FileNotFoundException {
    }
}
