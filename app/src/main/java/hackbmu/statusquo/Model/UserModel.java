package hackbmu.statusquo.Model;

public class UserModel {
String name, hardwareid,userId , mobile;
Double lat, lon;


    public UserModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHardwareid() {
        return hardwareid;
    }

    public void setHardwareid(String hardwareid) {
        this.hardwareid = hardwareid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public UserModel(String name, String hardwareid, String userId, String mobile, Double lat, Double lon) {

        this.name = name;
        this.hardwareid = hardwareid;
        this.userId = userId;
        this.mobile = mobile;
        this.lat = lat;
        this.lon = lon;
    }
}
