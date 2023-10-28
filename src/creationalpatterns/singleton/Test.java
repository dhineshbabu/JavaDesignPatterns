package creationalpatterns.singleton;

import java.io.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        // both of the aboce must point to the same object
        System.out.println(dateUtil1 == dateUtil2); // reference comparison

        // Checking after serialization and deserialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/dhineshbabumuthuraj/Documents/Dhineshbabu/dateUtil.ser")));

        oos.writeObject(dateUtil1);

        DateUtil dateUtil3 = null;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/dhineshbabumuthuraj/Documents/Dhineshbabu/dateUtil.ser")));
        dateUtil3 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil3); // readResolve method will send the same version

    }
}
