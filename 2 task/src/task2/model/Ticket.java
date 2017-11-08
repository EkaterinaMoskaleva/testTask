package task2.model;

public class Ticket {

  private int id;
  private String question;

  public Ticket(int id, String question) {
    this.id = id;
    this.question = question;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  @Override
  public String toString() {
    return "Ticket{" +
            "id=" + id +
            ", question='" + question + '\'' +
            '}';
  }
}
