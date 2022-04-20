package tourGuide.user;

import tourGuide.beans.LocationBean;

import java.util.UUID;

public class NearestAttraction {

    private String attracationName;
    private LocationBean attractionLocation;
    private LocationBean visitedLocation;
    private double distance;
    private int rewardPoints;
    private transient UUID attractionID;

    public NearestAttraction(String attracationName, LocationBean attractionLocation, double distance, UUID attractionID) {
        this.attracationName = attracationName;
        this.attractionLocation = attractionLocation;
        this.distance = distance;
        this.attractionID = attractionID;
    }

    public String getAttracationName() {
        return attracationName;
    }

    public void setAttracationName(String attracationName) {
        this.attracationName = attracationName;
    }

    public LocationBean getAttractionLocation() {
        return attractionLocation;
    }

    public void setAttractionLocation(LocationBean attractionLocation) {
        this.attractionLocation = attractionLocation;
    }

    public LocationBean getVisitedLocation() {
        return visitedLocation;
    }

    public void setVisitedLocation(LocationBean visitedLocation) {
        this.visitedLocation = visitedLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public UUID getAttractionID() {
        return attractionID;
    }

    public void setAttractionID(UUID attractionID) {
        this.attractionID = attractionID;
    }
}
