package Seriliaze;

import java.io.*;

public class FileUtiltySer {
    public static void writeObjectFile(Serializable object,String fileName) throws Exception
    {
        FileOutputStream fout=new FileOutputStream(fileName);
        ObjectOutputStream os=new ObjectOutputStream(fout);
        os.writeObject(object);
    }
    public static Object readObjectFile(String fileName) throws Exception
    {
        Object obj=null;
        FileInputStream fileInputStream=new FileInputStream(fileName);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        obj=objectInputStream.readObject();
        return  obj;
    }


}
