import java.util.ArrayList;
import java.util.List;

public class Person {

  private String name;
  private String gender;
  private List<String> interests;
  private List<Society> societiesInvolved;

  public Person(String name, String gender, String ... interest) {
    this.name = name;
    this.gender = gender;
    this.interests = new ArrayList<>();

    for (String i : interest) {
      interests.add(i);
    }
    this.societiesInvolved = new ArrayList<>();
  }

  public List<String> getInterests() {
    return interests;
  }

  public List<Society> getSocietiesInvolved() {
    return societiesInvolved;
  }

  public void addInterest(String interest) {
    interests.add(interest);
  }

  public void addSociety(Society society) {
    societiesInvolved.add(society);
  }

}
