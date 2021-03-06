package tdsolutions.com.findmylocation;

/**
 * Created by Admin on 1/6/2017.
 */

public class AugmentedPOI {
    private int mId;
    private String mName;
    private String mDescription;
    private double mLatitude;
    private double mLongitude;
    private double azimuth;

    public double minAngle;
    public double maxAngle;
    public AugmentedPOI(String newName, String newDescription,
                        double newLatitude, double newLongitude) {
        this.mName = newName;
        this.mDescription = newDescription;
        this.mLatitude = newLatitude;
        this.mLongitude = newLongitude;
    }

    public int getPoiId() {
        return mId;
    }
    public void setPoiId(int poiId) {
        this.mId = poiId;
    }
    public String getPoiName() {
        return mName;
    }
    public void setPoiName(String poiName) {
        this.mName = poiName;
    }
    public String getPoiDescription() {
        return mDescription;
    }
    public void setPoiDescription(String poiDescription) {
        this.mDescription = poiDescription;
    }
    public double getPoiLatitude() {
        return mLatitude;
    }
    public void setPoiLatitude(double poiLatitude) {
        this.mLatitude = poiLatitude;
    }
    public double getPoiLongitude() {
        return mLongitude;
    }
    public void setPoiLongitude(double poiLongitude) {
        this.mLongitude = poiLongitude;
    }

    public double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(double azimuth) {
        this.azimuth = azimuth;
    }
}
