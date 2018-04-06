package hackbmu.statusquo.Model;

public class AccidentModel {
    String lat,longi;
    Integer level;

    public AccidentModel() {
    }

    public AccidentModel(String lat, String longi, Integer level) {
        this.lat = lat;
        this.longi = longi;
        this.level = level;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
