package Demo01;

import java.io.FileWriter;
import java.io.Writer;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-22 13:31
 */
public class Demo06 {

    public static void main(String[] args) {
        Writer fw = null;
        try {
            fw = new FileWriter("d:\\test.txt");
            fw.write("我热爱Java编程");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {


                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}