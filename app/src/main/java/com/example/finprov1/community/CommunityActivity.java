package com.example.finprov1.community;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.finprov1.ProfileFragment;
import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityCommunityBinding;
import com.example.finprov1.recommended.HomeFragment;
import com.example.finprov1.transaction.HistoryFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class CommunityActivity extends AppCompatActivity {

    private ActivityCommunityBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommunityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CommunityAdapter adapter = new CommunityAdapter();
        binding.rvCommunity.setAdapter(adapter);
        binding.rvCommunity.setLayoutManager(new LinearLayoutManager(this));

        List<CommunityModel> listCommunity = new ArrayList<>();
        listCommunity.add(new CommunityModel("PERSIBA Balikpapan Football Community", "PERSIBA Balikpapan Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Balikpapan","07.00-22.00", "Rp. 100.000", "Liam Anderson", "08912317865", "liam@gmail.com", R.drawable.persiba, -1.23295, 116.94245));
        listCommunity.add(new CommunityModel("ITK Mobile Legend Community", "ITK Mobile Legend Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Balikpapan","07.00-22.00", "Rp. 100.000", "Olivia Martinez", "081238726789", "olivia@gmail.com", R.drawable.mlimg, -1.14937, 116.86205));
        listCommunity.add(new CommunityModel("ITK Tennis Community", "ITK Tennis Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Balikpapan","07.00-22.00", "Rp. 100.000", "Mason Thompson", "08198456789", "mason@gmail.com", R.drawable.tennisitk, -1.14937, 116.86205));
        listCommunity.add(new CommunityModel("ITK Basketball Community", "ITK Basketball Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Balikpapan","07.00-22.00", "Rp. 100.000", "Lucas Robinson", "08123459889", "lucas@gmail.com", R.drawable.basket, -1.14937, 116.86205));
        adapter.setData(listCommunity);


        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}