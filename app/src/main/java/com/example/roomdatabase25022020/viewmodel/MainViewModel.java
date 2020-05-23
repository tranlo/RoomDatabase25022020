package com.example.roomdatabase25022020.viewmodel;

import android.content.Context;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.roomdatabase25022020.model.entity.Sinhvien;
import com.example.roomdatabase25022020.repository.SinhvienRepository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainViewModel extends ViewModel implements LifecycleObserver {
    private MutableLiveData<List<Sinhvien>> sinhvienList;
    public LiveData<List<Sinhvien>> getSinhvienSuccess;

    public MainViewModel() {
        this.sinhvienList = new MutableLiveData<>();
    }

    public void getAllSinhVien(Context context) {
        SinhvienRepository
                .getInstance(context)
                .getListSinhvien()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Sinhvien>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Sinhvien> sinhviens) {
                        sinhvienList.setValue(sinhviens);
                        getSinhvienSuccess = sinhvienList;
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
