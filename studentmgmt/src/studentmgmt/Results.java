package studentmgmt;

public class Results extends Test implements Sports {
  public void putWt() {
    System.out.println("Sports Wt: " + sportsWeightage);
  }

  public void display() {
    float total = mark1 + mark2 + sportsWeightage;

    System.out.println("Roll No: " + rollno);
    System.out.println("Total: " + total);
  }
}
