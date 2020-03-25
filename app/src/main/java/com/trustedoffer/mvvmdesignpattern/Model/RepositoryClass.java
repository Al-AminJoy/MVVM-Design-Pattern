package com.trustedoffer.mvvmdesignpattern.Model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClass {
    List<MostWicket> dataitem = new ArrayList<>();
    MutableLiveData<List> mutableLiveData;
    Application application;
    String url = "https://api.myjson.com/bins/p8t1z";

    public RepositoryClass(Application application) {
        this.application = application;
    }

    public MutableLiveData<List> loadData() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
        }
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();
                ModelClass data = gson.fromJson(response, ModelClass.class);
                //   dataitem.addAll(data.getMostWickets());
                dataitem = data.getMostWickets();
                mutableLiveData.setValue(dataitem);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        Volley.newRequestQueue(application).add(stringRequest);
        return mutableLiveData;
    }
}
