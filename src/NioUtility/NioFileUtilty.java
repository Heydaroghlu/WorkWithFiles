package NioUtility;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileUtilty {
    public static  void nioWriteToFile(String fileName,byte[] data) throws Exception
    {
        Path pathFile= Paths.get(fileName);
        Files.write(pathFile,data);
        System.out.println("All writen to file");
    }
    public static byte[]  nioReadFromFile(String fileName) throws  Exception
    {
        Path pathFile= Paths.get(fileName);
        byte[] data= Files.readAllBytes(pathFile);
        return data;
    }
}
