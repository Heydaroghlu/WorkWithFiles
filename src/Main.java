import Seriliaze.FileUtiltySer;
import Utility.FileUtilty;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
      /*  byte[] data=FileUtilty.readWithByte("image.png");
        FileUtilty.writeWithByte("image2",data);*/
//        User u=new User();
//        u.Name="Isa";
//        FileUtiltySer.writeObjectFile(u,"object.obj");
//        User u2=(User) FileUtiltySer.readObjectFile("object.obj");
//        System.out.println(u2.Name);


        Class1 cl1=new Class1("Isa");
        System.out.println(cl1.name+" "+cl1.surName);
    }
}