package tourGuide.user;

import tourGuide.beans.LocationBean;

public class UserNearAttraction {

    private String attractionName;
    private Double latitudeAttraction;
    private Double longitudeAttraction;
    private LocationBean userLocation;
    private double attractionProximity;
    private int attractionRewardPoint;

    public UserNearAttraction() {
    }

    public UserNearAttraction(String attractionName, Double latitudeAttraction, Double longitudeAttraction, LocationBean userLocation, double attractionProximity, int i) {
        this.attractionName = attractionName;
        this.latitudeAttraction = latitudeAttraction;
        this.longitudeAttraction = longitudeAttraction;
        this.userLocation = userLocation;
        this.attractionProximity = attractionProximity;
        this.attractionRewardPoint = i;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public Double getLatitudeAttraction() {
        return latitudeAttraction;
    }

    public void setLatitudeAttraction(Double latitudeAttraction) {
        this.latitudeAttraction = latitudeAttraction;
    }

    public Double getLongitudeAttraction() {
        return longitudeAttraction;
    }

    public void setLongitudeAttraction(Double longitudeAttraction) {
        this.longitudeAttraction = longitudeAttraction;
    }

    public LocationBean getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(LocationBean userLocation) {
        this.userLocation = userLocation;
    }

    public double getAttractionProximity() {
        return attractionProximity;
    }

    public void setAttractionProximity(double attractionProximity) {
        this.attractionProximity = attractionProximity;
    }

    public int getAttractionRewardPoint() {
        return attractionRewardPoint;
    }

    public void setAttractionRewardPoint(int attractionRewardPoint) {
        this.attractionRewardPoint = attractionRewardPoint;
    }
}
