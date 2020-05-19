package com.example.roomdatabase25022020.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.roomdatabase25022020.model.entity.Sinhvien;

@Database(entities = Sinhvien.class, version = 1)
public abstract class SinhvienDatabase extends RoomDatabase {
    public abstract SinhvienDao sinhvienDao();

    private static SinhvienDatabase sinhvienDatabase = null;

    // Singleton cho database
    public static SinhvienDatabase getInstance(Context context) {
        if (sinhvienDatabase == null) {
            sinhvienDatabase = Room.databaseBuilder(
                    context,
                    SinhvienDatabase.class,
                    "Quanlysinhvien"
            )
                    .build();
        }
        return sinhvienDatabase;
    }
}
