public class Student {
  int studentID;
  String studentName;
  ArrayList<Subject> subjectList;

  public Student(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
    subjectList = new ArrayList<Subject>();
  }

  public void addSubject(String name, int score, boolean majorCode) {
    if (majorCode) {
      subjectList.add(new MajorSubject(name, score));
    } else {
      subjectList.add(new BasicSubject(name, score));
    }
  }

  public void showGradeInfo() {
    for (Subject subject : subjectList) {
      System.out.print("학생 " + studentName + "의 " + subject.toString());
    }
  }
}