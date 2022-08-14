package ch5;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("1","Nik",7.7);
        Student student2 = new Student("1","Pavel",7.5);
        Student.AverageMarkComparator averageMarkComparator = new Student.AverageMarkComparator();
        Student.GroupComparator groupComparator = new Student.GroupComparator();
        Student.NameComparator nameComparator = new Student.NameComparator();
        System.out.println(averageMarkComparator.compare(student1,student2));
        System.out.println(groupComparator.compare(student1,student2));
        System.out.println(nameComparator.compare(student1,student2));
    }
}
