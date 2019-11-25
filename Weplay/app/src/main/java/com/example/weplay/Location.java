package com.example.weplay;

public class Location {
    String locationId;
    String locationSector;
    String locationDistrict;

    public Location(){


    }
public Location(String locId,String locSector,String locDistrict){
this.locationId = locId;
this.locationSector = locSector;
this.locationDistrict = locDistrict;

}

    public String getLocationId() {
        return locationId;
    }

    public String getLocationSector() {
        return locationSector;
    }

    public String getLocationDistrict() {
        return locationDistrict;
    }
}
