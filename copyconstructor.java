public class copyconstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="aman";
        s1.rollno=6;
        s1.password="sharma";
        s1.marks[0]=13;
        s1.marks[1]=26;
        s1.marks[2]=31;

        Student s2=new Student(s1);
        s2.password="pata nhi";
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        s1.marks[1]=20;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollno;
    String password;
    int marks[]=new int[3];
    Student(){
    }
    Student(Student s1) {
        this.name=s1.name;
        this.rollno=s1.rollno;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
