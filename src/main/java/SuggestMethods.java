import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SuggestMethods {

  private List<Event> events;
  private List<Society> societies;

  public List<Event> suggestEventsToUser(User user) {
    List<Event> eventsSuggested = new ArrayList<>();

    for(Event event : events) {
      int matchingCategories = event.numberOfMatchingCategories(user);
      int friendsGoingForEvent = user.numberOfFriendsInvolved(event);

      if (matchingCategories >= 3 || friendsGoingForEvent >= 3) {
        eventsSuggested.add(event);
      }
    }

    return eventsSuggested;
  }

  public List<Society> suggestSocieties(User user) {
    List<Society> societiesSuggested = new ArrayList<>();

    for(Society society : societies) {
      int matchingInterests = society.numberOfMatchingCategories(user);

      if(matchingInterests >= 3) {
        societiesSuggested.add(society);
      }
    }

    return societiesSuggested;
  }

}
