class Student { private int rollno;
public void setRollNo(int rollno) { this.rollno = rollno;
}
public int getRollNo() { return rollno;
}}
class Test extends Student { private int marks1;
private int marks2;
public void setMarks1(int marks1) { this.marks1 = marks1;
}
public int getMarks1() { return marks1;
}
public void setMarks2(int marks2) { this.marks2 = marks2;
}
public int getMarks2() { return marks2;
}
}
 
class Result extends Test { private int total;
public void calculateTotal() {
total = getMarks1() + getMarks2(); }

public void display() {
System.out.println("Roll No.: " + getRollNo()); System.out.println("Marks 1: " + getMarks1()); System.out.println("Marks 2: " + getMarks2()); System.out.println("Total: " + total);
System.out.println(“K.Sathaiah”);
}
}
public class Main {
public static void main(String[] args) { Result result = new Result(); result.setRollNo(1); result.setMarks1(80); result.setMarks2(90); result.calculateTotal(); result.display();
}
}
