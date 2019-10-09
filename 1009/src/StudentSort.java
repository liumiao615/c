import java.util.Comparator;

public class StudentSort {
    public static void insertSort(Student[] student){
        for(int i = 1;i < student.length;i++){
            Student K = student[i];
            int j = i - 1;
            for(;j >= 0 && ((Comparable<Student>)student[j]).compareTo(K) > 0;j++){
                student[j+1] = student[j];
            }
            student[j + 1] = K;
        }
    }
    public static void insertSort(Student[] student, Comparator<Student> cmp){
        for(int i = 1;i < student.length;i++){
            Student K = student[i];
            int j = i - 1;
            for(;j >= 0 && cmp.compare(student[j],K)> 0;j++){
                student[j+1] = student[j];
            }
            student[j + 1] = K;
        }
    }
    public static class Cmp implements Comparator<Student>{


        @Override
        public int compare(Student o1, Student o2) {
            return 0;
        }
    }
    public static void main(String[] args) {
        Student[] students = {new Student()};
        insertSort(students);
        //insertSort(students,new Cmp());
    }
}
