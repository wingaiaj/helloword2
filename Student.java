/**
 * @ClassName Student
 * @Description TODO
 * @Author xpower
 * @Date 2022/5/27 8:57
 * @Version 1.0
 */
public class Student implements  Comparable{
    public String name;
    public double grade;

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student o1 = (Student) o;

            if(this.grade>o1.grade){
                return -1;
            }

        }
        return 0;
    }

    @Override
    public String toString() {
        return "name=" + name + " grade=" + grade +"\n";
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
