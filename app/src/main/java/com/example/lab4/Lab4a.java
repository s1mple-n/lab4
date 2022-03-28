package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Lab4a extends AppCompatActivity {

    private List<SanPham> listsp;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab4a);

        listView = findViewById(R.id.listview);
        listsp = new ArrayList<>();
        listsp.add(new SanPham(1,"Ca nau lau- nau mi mini...","Shop Devang"));
        listsp.add(new SanPham(2,"1KG KHO GA BO TOI","Shop LTD Food"));
        listsp.add(new SanPham(3,"Xe can cau da nang","Shop The gioi do choi"));
        listsp.add(new SanPham(4,"Do choi dang mo hinh","Shop The gioi do choi"));
        listsp.add(new SanPham(5,"Lanh dao gian don","Shop Minh Long Book"));
        listsp.add(new SanPham(6,"Hieu long tre con","Shop Minh Long Book"));

        SanPhamAdapter adapter = new SanPhamAdapter(this,R.layout.customlistsanpham,listsp);
        listView.setAdapter(adapter);

    }
}