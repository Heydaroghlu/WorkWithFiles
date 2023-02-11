package Utility;

import java.io.*;
import java.util.concurrent.ExecutionException;

public class FileUtilty {

    public static void writeIntoFile(String fileName,String text) throws IOException
    {
        FileWriter fw=new FileWriter(fileName);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(text);
        bw.close();
    }
    public  static  void writeWithByte(String fileName,byte[] data) throws Exception
    {
        FileOutputStream fileOutputStream=new FileOutputStream(fileName);
        fileOutputStream.write(data);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Okey");
    }
    public static String readFromFile(String fileName) throws Exception
    {
      try(
              FileInputStream inputStream=new FileInputStream(fileName);
              InputStreamReader streamReader=new InputStreamReader(inputStream);
              BufferedReader reader=new BufferedReader(streamReader);
              )
      {
          String line=null;
          String result="";

          while ((line=reader.readLine())!=null)
          {
              result+=line+"\n";
          }
          return result;
      }
    }
    public static  byte[] readWithByte(String fileName) throws Exception
    {
       File file=new File(fileName);
       byte[] bytesArray=new byte[(int) file.length()];
       FileInputStream inputStream=new FileInputStream(file);
       inputStream.read(bytesArray);
       return  bytesArray;

    }
}
