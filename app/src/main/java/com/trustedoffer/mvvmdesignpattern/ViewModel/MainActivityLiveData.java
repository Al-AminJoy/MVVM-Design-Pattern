package com.trustedoffer.mvvmdesignpattern.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityLiveData extends ViewModel {
    MutableLiveData<String> liveData;
    public MutableLiveData<String> addNum(String firstNum,String secondNum){
        int sum=Integer.parseInt(firstNum)+Integer.parseInt(secondNum);
        if (liveData==null){
            liveData=new MutableLiveData<>();
        }
        liveData.setValue(String.valueOf(sum));
        return liveData;
    }
}
