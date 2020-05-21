package com.example.roomdatabase25022020.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.roomdatabase25022020.model.entity.Sinhvien;
import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.Observable;


@Dao
public interface SinhvienDao {
    // Select : lay du
    @Query("SELECT * FROM sinhvien")
    Observable<List<Sinhvien>> getSinhvien();

    // Insert
    @Insert
    Maybe<Long> insertSinhvien(Sinhvien sinhvien);


}
