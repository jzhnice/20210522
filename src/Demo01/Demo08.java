package Demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-22 13:49
 */
public class Demo08 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw=new FileWriter("d:\\hello.txt");
            bw = new BufferedWriter(fw);
            bw.write("大家好");
            bw.write("我在学习 Bufferedwriter");
            // 插入换行符
            bw.newLine();
            bw.write("请多指教");
            bw.newLine();
            bw.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fw != null)  bw.close();
                if (fw != null) fw.close();

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
