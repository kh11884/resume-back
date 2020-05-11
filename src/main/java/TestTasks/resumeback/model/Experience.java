package TestTasks.resumeback.model;

public class Experience {
    private int id;
    private String date;
    private String place;
    private String position;
    private String responsibility;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", position='" + position + '\'' +
                ", responsibility='" + responsibility + '\'' +
                '}';
    }
}
