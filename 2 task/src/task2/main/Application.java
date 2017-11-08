package task2.main;


import task2.model.Group;
import task2.model.Student;
import task2.model.StudentMark;
import task2.model.Ticket;

import java.util.Random;

public class Application {

    public static void main(String[] args) {


        //create 5 students
        Student[] students_1 = new Student[5];
        students_1[0] = new Student("Ivan", "Ivanov");
        students_1[1] = new Student("Ivan", "Petrov");
        students_1[2] = new Student("Vadim", "Ivanov");
        students_1[3] = new Student("Alex", "Sidorov");
        students_1[4] = new Student("Oleg", "Matveev");

        Student[] students_2 = new Student[5];
        students_2[0] = new Student("Ivan", "Ivanov");
        students_2[1] = new Student("Ivan", "Petrov");
        students_2[2] = new Student("Vadim", "Ivanov");
        students_2[3] = new Student("Alex", "Sidorov");
        students_2[4] = new Student("Oleg", "Matveev");

        //create 10 tickets
        Ticket[] tickets = new Ticket[10];

        tickets[0] = new Ticket(1, "Q1");
        tickets[1] = new Ticket(2, "Q2");
        tickets[2] = new Ticket(3, "Q3");
        tickets[3] = new Ticket(4, "Q4");
        tickets[4] = new Ticket(5, "Q5");
        tickets[5] = new Ticket(6, "Q6");
        tickets[6] = new Ticket(7, "Q7");
        tickets[7] = new Ticket(8, "Q8");
        tickets[8] = new Ticket(9, "Q9");
        tickets[9] = new Ticket(10, "Q10");


        Random random = new Random();

        StudentMark[] results_1 = new StudentMark[5];

        for (int ind = 0; ind < 5; ind++) {
            StudentMark stMark = new StudentMark(random.nextInt(5) + 1, students_1[ind], tickets[random.nextInt(tickets.length)]); //Random generates values from 0
            results_1[ind] = stMark;
        }

        StudentMark[] results_2 = new StudentMark[5];

        for (int ind = 0; ind < 5; ind++) {
            StudentMark stMark = new StudentMark(random.nextInt(5) + 1, students_2[ind], tickets[random.nextInt(tickets.length)]); //Random generates values from 0
            results_2[ind] = stMark;
        }

        Group group_1 = new Group(students_1, results_1);
        Group group_2 = new Group(students_2, results_2);

        System.out.println(group_1);
        System.out.println(group_2);

        float avg1 = group_1.average();
        System.out.println(avg1);

        float avg2 = group_2.average();
        System.out.println(avg2);

        StudentMark fromFirst = group_1.findBest();
        StudentMark fromSecond = group_2.findBest();
        StudentMark best = fromFirst.getValue() > fromSecond.getValue() ? fromFirst : fromSecond;

        fromFirst = group_1.findWorst();
        fromSecond = group_2.findWorst();
        StudentMark worst = fromFirst.getValue() < fromSecond.getValue() ? fromFirst : fromSecond;

        System.out.println(best);
        System.out.println(worst);

    }
}
