import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

class MyComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        if(s2.CGPA > s1.CGPA) return (1);
        else if(s2.CGPA < s1.CGPA) return (-1);
        else
        {
            int secondCompare = s1.Name.compareTo(s2.Name);
            if(secondCompare != 0) return (secondCompare);
            int thirdCompare = s1.ID - s2.ID;
            return (thirdCompare);
        }        
    }
}

class Student
{
    public final int ID;
    public final String Name;
    public final double CGPA;
    Student(String name, double cgpa, int id)  
    {
        this.ID = id;
        this.Name = name;
        this.CGPA = cgpa;
    }
    public int getID()
    {
        return (ID);
    }
    public String getName()
    {
        return (Name);
    }
    public double getCGPA()
    {
        return (CGPA);
    }
}

class Priorities
{
    public List<Student> getStudents(List<String> events)
    {
        PriorityQueue<Student> p = new PriorityQueue<>(new MyComparator());
        for(int i = 0; i < events.size(); ++i)
        {
            String str[] = events.get(i).split("\\s");
            if(str[0].equalsIgnoreCase("ENTER"))
            {
                p.add(new Student(str[1],Double.parseDouble(str[2]),Integer.parseInt(str[3])));
            }
            if(str[0].equalsIgnoreCase("SERVED"))
            {
                p.poll();
            }
        }
        List<Student> list = new ArrayList<>();
        p.forEach((s)->list.add(s));
        list.sort(new MyComparator());
        return (list);
    }
}


public class PriorityQueueStudent 
{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) 
        {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) 
        {
            System.out.println("EMPTY");
        } 
        else 
        {
            for (Student st: students) 
            {
                System.out.println(st.getName());
            }
        }
    }
}
