import java.util.Scanner;

class Employee {
    String Emp_name; 
    int Emp_id;
    String Address;
    String Mail_id;
    int Mobile_no;
    
    void display() {
        System.out.println(Emp_name);
        System.out.println(Address);
        System.out.println(Emp_id);
        System.out.println(Mail_id);
        System.out.println(Mobile_no);
    }
}

class Programmer extends Employee { 
    int BP;

    void display() {
        System.out.println(BP);
        System.out.println("DA: " + 0.97 * BP);
        System.out.println("HRA: " + 0.10 * BP);
        System.out.println("PF: " + 0.12 * BP);
        System.out.println("Staff Club Fund: " + 0.001 * BP);
    }
}

class AssistantProfessor extends Employee { 
    int bp;

    void display() {
        System.out.println(bp);
        System.out.println("DA: " + 0.97 * bp);
        System.out.println("HRA: " + 0.10 * bp);
        System.out.println("PF: " + 0.12 * bp);
        System.out.println("Staff Club Fund: " + 0.001 * bp);
    }
}

class AssociateProfessor extends Employee { 
    int bp;

    void display() {
        System.out.println(bp);
        System.out.println("DA: " + 0.97 * bp);
        System.out.println("HRA: " + 0.10 * bp);
        System.out.println("PF: " + 0.12 * bp);
        System.out.println("Staff Club Fund: " + 0.001 * bp);
    }
}

class Professor extends Employee { 
    int bp;

    void display() {
        System.out.println(bp);
        System.out.println("DA: " + 0.97 * bp);
        System.out.println("HRA: " + 0.10 * bp);
        System.out.println("PF: " + 0.12 * bp);
        System.out.println("Staff Club Fund: " + 0.001 * bp);
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println("\n1. Programmer\n2. Assistant Professor\n3. Associate Professor\n4. Professor"); 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: "); 
        int ch = input.nextInt();
        
        switch (ch) {
            case 1:
                Employee e1 = new Employee();
                Programmer p1 = new Programmer();
                e1.Emp_name = "abc";
                e1.Address = "y-city"; 
                e1.Mail_id = "praw@gmail.com";
                e1.Emp_id = 567; 
                e1.Mobile_no = 2345678; 
                p1.BP = 15000;
                p1.display();
                e1.display();
                break;
            case 2:
                Employee e2 = new Employee();
                AssistantProfessor p2 = new AssistantProfessor(); 
                e2.Emp_name = "def";
                e2.Address = "a-city"; 
                e2.Mail_id = "rajan@gmail.com"; 
                e2.Emp_id = 123; 
                e2.Mobile_no = 987321;
                p2.bp = 30000;
                p2.display();
                e2.display(); 
                break;
            case 3:
                Employee e3 = new Employee(); 
                AssociateProfessor p3 = new AssociateProfessor(); 
                e3.Emp_name = "ghf";
                e3.Address = "b-city"; 
                e3.Mail_id = "main@gmail.com"; 
                e3.Emp_id = 456; 
                e3.Mobile_no = 98710;
                p3.bp = 30000;
                p3.display();
                e3.display(); 
                break;
            case 4:
                Employee e4 = new Employee(); 
                Professor p4 = new Professor(); 
                e4.Emp_name = "kannan"; 
                e4.Address = "trichy"; 
                e4.Mail_id = "kanna@gmail.com"; 
                e4.Emp_id = 789; 
                e4.Mobile_no = 9810; 
                p4.bp = 30000;
                p4.display();
                e4.display(); 
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }
}
