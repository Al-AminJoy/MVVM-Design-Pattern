package com.trustedoffer.mvvmdesignpattern.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.trustedoffer.mvvmdesignpattern.Model.ModelClass;
import com.trustedoffer.mvvmdesignpattern.Model.MostWicket;
import com.trustedoffer.mvvmdesignpattern.Model.RepositoryClass;

import java.util.List;
//For Testing ViewModel
/*public class MainActivityViewModel extends ViewModel {*/

//Now For MVVM
public class MainActivityViewModel extends AndroidViewModel {

    //This was for Testing ViewModel
    /*public String addNum(String firstNum,String secondNum){
        int sum=Integer.parseInt(firstNum)+Integer.parseInt(secondNum);
        return String.valueOf(sum);
    }*/
    RepositoryClass repositoryClass;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        repositoryClass = new RepositoryClass(application);
    }

    public LiveData<List> getWicketData() {
        return repositoryClass.loadData();
    }

}
