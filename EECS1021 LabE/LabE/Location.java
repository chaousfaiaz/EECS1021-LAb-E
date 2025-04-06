/**
 * Class to hold Latitude and Longitude information associated with Municipal Trees.
 */
public class Location {

    public static final long serialVersionUID = 32L;

    private final float lat;
    private final float lon;

    /**
     * A tree Location.
     * 
     * @param lat latitude
     * @param lon longitude
     */
    public Location(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    /*
     * @see Object.toString()
     */
    @Override
    public String toString() {
        return "[" + this.getLat()
                + ", " + this.getLon()
                + "]";
    }

}
