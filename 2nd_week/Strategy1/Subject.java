public interface Subject {
  private String name;
  private int scorePoint;
  private boolean majorCode;
  private char grade;

  public String getName();
  public void setName(String name);
  public int getScorePoint();
  public void setScorePoint(int scorePoint);
  public char getGrade();
  public boolean isMajorCode();
}