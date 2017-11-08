package task2.model;

public class StudentMark {

    private int value;
    private Student student;
    private Ticket ticket;


    public StudentMark(int value, Student student, Ticket ticket) {
        this.value = value;
        this.student = student;
        this.ticket = ticket;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "\n" +"StudentMark{" +
                "value=" + value +
                ", student=" + student +
                ", ticket=" + ticket +
                '}';
    }
}
