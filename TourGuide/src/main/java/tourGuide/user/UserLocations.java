package tourGuide.user;

import tourGuide.beans.LocationBean;

public class UserLocations {
    private String UUID;
    private LocationBean userLocations;

    public UserLocations(String UUID, LocationBean userLocations) {
        this.UUID = UUID;
        this.userLocations = userLocations;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public LocationBean getUserLocations() {
        return userLocations;
    }

    public void setUserLocations(LocationBean userLocations) {
        this.userLocations = userLocations;
    }
}
