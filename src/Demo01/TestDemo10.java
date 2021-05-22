package Demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-22 14:30
 */
public class TestDemo10 {
    public static void main(String[] args) {
        Demo10 demo10 = new Demo10("101101","12345678765");
        demo10.setName("张三");
        demo10.setAge(22);
        demo10.setSex("男");
        
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("D:\\client.txt"))){
//            oos.writeObject(demo10);
            oos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
