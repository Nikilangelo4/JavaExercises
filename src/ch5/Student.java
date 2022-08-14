package ch5;

import java.util.Comparator;

public class Student {
    private String group;
    private String name;
    private double averageMark;

    public Student(String group, String name, double averageMark) {
        this.group = group;
        this.name = name;
        this.averageMark = averageMark;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public static class GroupComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.group.compareTo(s2.group);
        }
    }
    public static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }
    public static class AverageMarkComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.averageMark, s2.averageMark);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb;
        sb = new StringBuilder("Student{");
        sb.append("group='").append(group).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", averageMark=").append(averageMark);
        sb.append('}');
        return sb.toString();
    }
}
