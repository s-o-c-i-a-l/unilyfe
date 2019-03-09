import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event implements Categorisable{
	private String name;
	private Date startTime;
	private Date endTime;
	private HashSet<String> category;

	public Event (String name, Date startTime, Date endTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Event (String name, Date startTime, Date endTime, Set<String> category) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.category = new HashSet<String>(category);
	}

	public String getName () {
		return name;
	}

	public Date getStartTime () {
		return startTime;
	}

	public Date getEndTime () {
		return endTime;
	}

	public void changeName (String newName) {
		this.name = newName;
	}

	public boolean overlap (Event event) {
		if (this.startTime.getTime() <= event.endTime.getTime() &&
				this.endTime.getTime() >= event.startTime.getTime()) return true;
		else return false;
	}

}
