import java.lang.*;

public class Student
{
    private int id;
    private String name;
    private double cgpa;
    


    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCgpa(double cgpa)
    {
        this.cgpa = cgpa;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCgpa()
    {
        return cgpa;
    }


public static void main(String[] args){
        Student s1 = new Student();

        s1.setId(50884);
        s1.setName("Polash magi");
        s1.setCgpa(4.6969);

        System.out.println("My id : " + s1.getId());
        System.out.println("My Name : " + s1.getName());
        System.out.println("My CGPA: " + s1.getCgpa());
    }
}
