package com.example.roomdatabase25022020.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sinhvien")
public class Sinhvien {
    @PrimaryKey(autoGenerate = true)
    private Integer id;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] image;
    private String name;
    private String address;
//hihi
    public Sinhvien() {

    }

//   @Ignore
    public Sinhvien(Integer id, byte[] image, String name, String address) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
