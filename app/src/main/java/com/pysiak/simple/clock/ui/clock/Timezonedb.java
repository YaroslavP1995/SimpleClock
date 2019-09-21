package com.pysiak.simple.clock.ui.clock;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timezonedb {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("regionName")
    @Expose
    private String regionName;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("zoneName")
    @Expose
    private String zoneName;
    @SerializedName("abbreviation")
    @Expose
    private String abbreviation;
    @SerializedName("gmtOffset")
    @Expose
    private int gmtOffset;
    @SerializedName("dst")
    @Expose
    private String dst;
    @SerializedName("zoneStart")
    @Expose
    private int zoneStart;
    @SerializedName("zoneEnd")
    @Expose
    private int zoneEnd;
    @SerializedName("nextAbbreviation")
    @Expose
    private String nextAbbreviation;
    @SerializedName("timestamp")
    @Expose
    private int timestamp;
    @SerializedName("formatted")
    @Expose
    private String formatted;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(int gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public int getZoneStart() {
        return zoneStart;
    }

    public void setZoneStart(int zoneStart) {
        this.zoneStart = zoneStart;
    }

    public int getZoneEnd() {
        return zoneEnd;
    }

    public void setZoneEnd(int zoneEnd) {
        this.zoneEnd = zoneEnd;
    }

    public String getNextAbbreviation() {
        return nextAbbreviation;
    }

    public void setNextAbbreviation(String nextAbbreviation) {
        this.nextAbbreviation = nextAbbreviation;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }
}
