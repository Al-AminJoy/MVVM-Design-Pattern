package com.trustedoffer.mvvmdesignpattern.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.trustedoffer.mvvmdesignpattern.Adapter.BestBowlingAdapter;
import com.trustedoffer.mvvmdesignpattern.Model.ModelClass;
import com.trustedoffer.mvvmdesignpattern.Model.MostWicket;
import com.trustedoffer.mvvmdesignpattern.R;
import com.trustedoffer.mvvmdesignpattern.ViewModel.MainActivityLiveData;
import com.trustedoffer.mvvmdesignpattern.ViewModel.MainActivityViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    MainActivityViewModel mainActivityViewModel;
    MainActivityLiveData mainActivityLiveData;
    private EditText etFirstNum, etSecondNum;
    private Button btShow;
    private RecyclerView recyclerView;
    private BestBowlingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Conneting With MainActivityViewModelClass
        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        //Conneting With MainActivityLiveData
        mainActivityLiveData = ViewModelProviders.of(this).get(MainActivityLiveData.class);
        //Passing Data To Adapter
        mainActivityViewModel.getWicketData().observe(MainActivity.this, new Observer<List>() {
            @Override
            public void onChanged(List list) {
                adapter = new BestBowlingAdapter(getApplicationContext(), list);
                recyclerView.setAdapter(adapter);
            }
        });

        /*
        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNum=etFirstNum.getText().toString();
                String secondNum=etSecondNum.getText().toString();

               *//* //For Understanding ViewModel
                String result=mainActivityViewModel.addNum(firstNum,secondNum);
                Toast.makeText(getApplicationContext(),"Result : "+result,Toast.LENGTH_LONG).show();*//*


         *//*   //For Testing Live Data
                mainActivityLiveData.addNum(firstNum,secondNum).observe(MainActivity.this, new Observer<String>() {
                    @Override
                    public void onChanged(String s) {
                        Toast.makeText(getApplicationContext(),"Result : "+s,Toast.LENGTH_LONG).show();
                    }
                });*//*

            }
        });*/
    }

    private void findId() {
    /*    etFirstNum=findViewById(R.id.etFirstNumId);
        etSecondNum=findViewById(R.id.etSecondNumId);
        btShow=findViewById(R.id.btShowResultId);*/
        recyclerView = findViewById(R.id.rvbestbowlingid);
    }
}
