public class MajorSubject implements Subject {
  private String name;
  private int scorePoint;
  private boolean majorCode;
  private char grade;

  public MajorSubject(String name, int scorePoint) {
    this.name = name;
    this.scorePoint = scorePoint;
    this.majorCode = true;
    if (scorePoint >= 95) {
      this.grade = 'S';
    } else if (scorePoint >= 90) {
      this.grade = 'A';
    } else if (scorePoint >= 80) {
      this.grade = 'B';
    } else if (scorePoint >= 70) {
      this.grade = 'C';
    } else if (scorePoint >= 60) {
      this.grade = 'D';
    } else {
      this.grade = 'F';
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScorePoint() {
    return this.scorePoint;
  }

  public void setScorePoint(int scorePoint) {
    this.scorePoint = scorePoint;
  }

  public char getGrade() {
    return this.grade;
  }

  public boolean isMajorCode() {
    return this.majorCode;
  }

  public String toString() {
    return name + " 과목 성적은 " + scorePoint + "점 이고, 학점은 " + grade + " 입니다.";
  }
}