package todo;

import java.io.*;
import java.util.Date;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
        Todo t1 = new Todo();
        t1.setNotas("Comprar maçãs");
        t1.setEstado(false);
        t1.setTimestamp(new Date());

        System.out.println(t1.toString());

        FileOutputStream fileOutputStream
                = new FileOutputStream("todo.txt");


        ObjectOutputStream objectOutputStream
                = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        objectOutputStream.writeObject(t1);
        objectOutputStream.flush();
        objectOutputStream.close();

        */

        FileInputStream fileInputStream
                = new FileInputStream("todo.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);

        Todo t2 = (Todo) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(t2.toString());


    }


}
