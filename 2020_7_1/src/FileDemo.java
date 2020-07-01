import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream(
                new File("D:\\编程\\hello.txt")
        );
        out.write("hello bitch".getBytes(StandardCharsets.UTF_8));
        out.close();
        /*        Person person = new Person();
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new File("D:\\编程\\TestDemo\\person.txt"))
        );
        oos.writeObject(person);
        oos.close();*/

        /*        File f = new File(".");
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);*/
        /*        String pathname = "D:\\编程\\TestDemo\\demo.txt";

        File file = new File(pathname);
        try{
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean res = file.exists();
        System.out.println(res);*/
    }
}
