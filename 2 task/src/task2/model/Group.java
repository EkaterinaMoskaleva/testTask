package task2.model;

import java.util.Arrays;

public class Group {

    private Student[] students;
    private StudentMark[] results;

    public Group(Student[] students, StudentMark[] results) {
        this.students = students;
        this.results = results;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public StudentMark[] getResults() {
        return results;
    }

    public void setResults(StudentMark[] results) {
        this.results = results;
    }

    public float average() {
        int sum = 0;

        for (int ind = 0; ind < 5; ind++) {
            StudentMark mark = this.results[ind];
            sum += mark.getValue();
        }

        return (float) sum / this.results.length; //to get non-rounded result;
    }

    public StudentMark findBest() {
        StudentMark best = this.results[0];
        for (int i = 1; i<=4; i++ ) {
            if (this.results[i].getValue() > best.getValue()) {
                best = this.results[i];
            }
        }
        return best;
    }

    public StudentMark findWorst() {
        StudentMark worst = this.results[0];
        for (int i = 1; i<=4; i++ ) {
            if (this.results[i].getValue() < worst.getValue()) {
                worst = this.results[i];
            }
        }
        return worst;
    }

    @Override
    public String toString() {
        return "Group{" +
                "results=" + Arrays.toString(results) +
                '}';
    }
}
