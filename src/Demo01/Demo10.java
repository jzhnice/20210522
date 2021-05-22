package Demo01;

import java.io.Serializable;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-22 14:26
 */
public class Demo10    implements Serializable {
    private static final long serialVersionUID = 1L;
    private  String clientId;
    private  String phone;
    private  String name;
    private  String sex;
    private  int  age;

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo10(String s, String s1) {
    }

    @Override
    public String toString() {
        return "Demo10{" +
                "clientId='" + clientId + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId(){
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
