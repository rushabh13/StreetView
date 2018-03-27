package com.osahub.rachit.streetview.model;

import android.database.Cursor;

import com.osahub.rachit.streetview.misc.Helper;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

/**
 * Location Bean Class
 * Created by Rachit on 22-Apr-16.
 */
public class Location implements Serializable {

    public static final int COLUMN_ID = 1;
    public static final int COLUMN_LOCATION_NAME = 2;
    public static final int COLUMN_DESCRIPTION = 3;
    public static final int COLUMN_DESCRIPTION_SMALL = 4;
    public static final int COLUMN_CITY = 5;
    public static final int COLUMN_STATE = 6;
    public static final int COLUMN_COUNTRY = 7;
    public static final int COLUMN_LATITUDE = 8;
    public static final int COLUMN_LONGITUDE = 9;
    public static final int COLUMN_IMAGE_LINKS = 10;
    public static final int COLUMN_THUMBNAIL_PATH = 11;
    public static final int COLUMN_CREATED_ON = 12;
    public static final int COLUMN_UPDATED_ON = 13;

    private int id;
    private String locationName;
    private String description;
    private String descriptionSmall;
    private String city;
    private String state;
    private String country;
    private double latitude;
    private double longitude;
    private String imageLinks;
    private String thumbnailPath;
    private Date createdOn;
    private Date updatedOn;

    public Location() {
    }

    public Location(String name) {
        this.locationName = name;
    }

    public Location(int id, String locationName, String description, String descriptionSmall, String city, String state, String country, double latitude, double longitude, String imageLinks, String thumbnailPath, Date createdOn, Date updatedOn) {
        this.id = id;
        this.locationName = locationName;
        this.description = description;
        this.descriptionSmall = descriptionSmall;
        this.city = city;
        this.state = state;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageLinks = imageLinks;
        this.thumbnailPath = thumbnailPath;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public static Location fromCursor(Cursor cursor) throws ParseException {
        return new Location(
                cursor.getInt(COLUMN_ID),
                cursor.getString(COLUMN_LOCATION_NAME),
                cursor.getString(COLUMN_DESCRIPTION),
                cursor.getString(COLUMN_DESCRIPTION_SMALL),
                cursor.getString(COLUMN_CITY),
                cursor.getString(COLUMN_STATE),
                cursor.getString(COLUMN_COUNTRY),
                cursor.getDouble(COLUMN_LATITUDE),
                cursor.getDouble(COLUMN_LONGITUDE),
                cursor.getString(COLUMN_IMAGE_LINKS),
                cursor.getString(COLUMN_THUMBNAIL_PATH),
                Helper.convertStringToDate(cursor.getString(COLUMN_CREATED_ON)),
                Helper.convertStringToDate(cursor.getString(COLUMN_UPDATED_ON)));
    }

    public static Location fromJson(JSONObject jsonObject) throws JSONException, ParseException {
        return new Location(
                jsonObject.getInt("id"),
                jsonObject.getString("locname"),
                jsonObject.getString("desc"),
                jsonObject.getString("descsmall"),
                jsonObject.getString("city"),
                jsonObject.getString("state"),
                jsonObject.getString("country"),
                jsonObject.getDouble("lat"),
                jsonObject.getDouble("lng"),
                jsonObject.getString("image"),
                jsonObject.getString("thumb"),
                Helper.convertStringToDate(jsonObject.getString("created")),
                Helper.convertStringToDate(jsonObject.getString("updated")));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionSmall() {
        return descriptionSmall;
    }

    public void setDescriptionSmall(String descriptionSmall) {
        this.descriptionSmall = descriptionSmall;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(String imageLinks) {
        this.imageLinks = imageLinks;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}