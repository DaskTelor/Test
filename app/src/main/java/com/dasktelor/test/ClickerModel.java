package com.dasktelor.test;

import androidx.lifecycle.MutableLiveData;

public class ClickerModel {
    private int countOfClick;
    MutableLiveData<Integer>  countOfClickLiveData;
    public ClickerModel(){

        countOfClick = 0;
        countOfClickLiveData = new MutableLiveData<>(countOfClick);

    }
    public void addClick(){
        countOfClick++;
        countOfClickLiveData.postValue(countOfClick);
    }
}
