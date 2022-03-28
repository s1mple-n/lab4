package com.example.lab4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class SanPhamAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<SanPham> sanPhamList;
    private int positonSelected = -1;

    public SanPhamAdapter(Context context, int idLayout, List<SanPham> sanPhamList) {
        this.context = context;
        this.idLayout = idLayout;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        if (sanPhamList.size() != 0 && !sanPhamList.isEmpty()) {
            return sanPhamList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        TextView tvName = view.findViewById(R.id.textViewName);
        TextView tvShop = view.findViewById(R.id.textViewshop);
        ImageView imageView = view.findViewById(R.id.imvSP);
        final ConstraintLayout constraintLayout = view.findViewById(R.id.ct);
        final SanPham sanPham = sanPhamList.get(i);

        if (sanPhamList != null && !sanPhamList.isEmpty()) {
            tvName.setText(sanPham.getTen());
            tvShop.setText(sanPham.getShop());
            int idSP = sanPham.getId();
            switch (idSP) {
                case 1:
                    imageView.setImageResource(R.mipmap.ca_nau_lau);
                    break;
                case 2:
                    imageView.setImageResource(R.mipmap.ga_bo_toi);
                    break;
                case 3:
                    imageView.setImageResource(R.mipmap.xa_can_cau);
                    break;
                case 4:
                    imageView.setImageResource(R.mipmap.do_choi_dang_mo_hinh);
                    break;
                case 5:
                    imageView.setImageResource(R.mipmap.lanh_dao_gian_don);
                    break;
                case 6:
                    imageView.setImageResource(R.mipmap.hieu_long_con_tre);
                    break;
                default:
                    break;

            }
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, sanPham.getTen(), Toast.LENGTH_SHORT).show();
                positonSelected=i;
                notifyDataSetChanged();
            }
        });
        if (positonSelected==i){
            constraintLayout.setBackgroundColor(Color.BLUE);
        } else constraintLayout.setBackgroundColor(Color.WHITE);

        return view;
        }



    }

