import java.io.*;

public class Main {
    public static void main(String[] args) {
        Object t1=new Object("Vasya",20);
        Object t2=new Object("Art",-50);
        System.out.println(t1);
        System.out.println(t2);

        try {
            FileOutputStream fileOutputStream=new FileOutputStream(new File("test.txt"));
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(t1);
                objectOutputStream.writeObject(t2);

        } catch (IOException e) {
            e.printStackTrace();
        }


            try {
                FileInputStream fileInputStream=new FileInputStream("test.txt");
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
                try {
                    Object tr1= (Object) objectInputStream.readObject();
                    Object tr2= (Object) objectInputStream.readObject();
                    System.out.println(tr1);
                    System.out.println(tr2);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            } catch (IOException  e) {
                e.printStackTrace();
            }





    }
}
