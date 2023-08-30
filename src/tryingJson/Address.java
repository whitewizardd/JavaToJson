package tryingJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    @JsonProperty("geo")
    private GeoGraphicalLocation geoGraphicalLocation;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public GeoGraphicalLocation getGeoGraphicalLocation() {
        return geoGraphicalLocation;
    }

    public void setGeoGraphicalLocation(GeoGraphicalLocation geoGraphicalLocation) {
        this.geoGraphicalLocation = geoGraphicalLocation;
    }
}
