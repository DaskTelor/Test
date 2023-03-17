package com.dasktelor.test;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ClickerViewModel extends ViewModel {
    private ClickerModel clickerModel;
    public ClickerViewModel()
    {
        clickerModel = new ClickerModel();
    }
    public LiveData<Integer> getClickCountLiveData(){
        return clickerModel.countOfClickLiveData;
    }
    public void addClick(){
        clickerModel.addClick();
    }
}
