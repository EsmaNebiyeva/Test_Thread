package studemtdetails;

public record Student(String name,int age,int grade) {
    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade ;
    }
}
