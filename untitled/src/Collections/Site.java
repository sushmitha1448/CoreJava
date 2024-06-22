package Collections;

public class Site {
    private int siteId;
    private String siteName;
    private long longitude;
    private long latitude;
    private String address;

    @Override
    public String toString() {
        return "Site{" +
                "siteId=" + siteId +
                ", siteName='" + siteName + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", address='" + address + '\'' +
                '}';
    }

    public Site(int siteId, String siteName, long longitude, long latitude, String address) {
        this.siteId = siteId;
        this.siteName = siteName;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }


}
