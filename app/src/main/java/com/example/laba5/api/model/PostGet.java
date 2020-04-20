package ru.mirea.lab5.api.model;

import com.google.gson.annotations.SerializedName;

public class PostGet {
    @SerializedName("id")
    private int id;

    @SerializedName("image_id")
    private String image_id;

    @SerializedName("value")
    private int value;

    public int getId() {
        return id;
    }

    public String getImageId() {
        return image_id;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PostGet{" +
                "id= " + id +
                ", image_id= '" + image_id + '\'' +
                ", value= " + value +
                '}';
    }
}
