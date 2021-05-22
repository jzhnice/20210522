package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-22 09:55
 */
public class Demo02 {
    class Parent {
        public int count() {               // 第1行
            return 0;
        }
    }

    public  class Test  extends Parent {
        @Override
        public int count() {               // 第2行
            return 9;                // 第3行
        }
    }

}
