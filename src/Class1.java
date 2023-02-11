public class Class1 extends Class2 {
    public String name;
    public Class1()
    {
      this("isa");
    }
    public Class1(String name)
    {
       this(name,"Heydaroghlu");

    }
    public Class1(String name,String surname)
    {
        this.name=name;
        super.surName=surname;
    }

}
