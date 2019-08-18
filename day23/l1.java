package day23;


import java.io.*;

/*
文件序列化存储读出；
 */
class person implements Serializable {
    String name;
    String age;
    person(String name,String age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
public class l1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        存null对象
        2.直接读出整个数组
        3.利用文件的available

         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aa.txt",true));
        oos.writeObject(new person("mjn","xka"));
        oos.writeObject(new person("mjxn","xkxa"));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aa.txt"));
        person p = null;
        while((p = (person)ois.readObject())!=null){
            System.out.println(p);
        }
        ois.close();
    }
}
