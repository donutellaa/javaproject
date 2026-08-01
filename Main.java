import java.util.Scanner;
class Student 
{
    String name;
    int roll;
    int[] mark = new int[3];
    int total = 0;
    Student()
    {
        name = "Karthu";
        roll = 8;
        mark[0] = 100;
        mark[1] = 100;
        mark[2] = 100;
    }
    Student(String name, int roll, int[] mark) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.next();
        System.out.print("Enter roll: ");
        this.roll = sc.nextInt();
        System.out.println("Enter 3 marks:");
        for (int i = 0; i < 3; i++) 
        {
            this.mark[i] = sc.nextInt();
        }
    }
    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll);
        total = 0;
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Mark " + (i + 1) + ": " + mark[i]);
            total += mark[i];
        }
        System.out.println("Total: " + total);
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student("", 0, new int[3]);
        s1.display();
        s2.display();
    }
}