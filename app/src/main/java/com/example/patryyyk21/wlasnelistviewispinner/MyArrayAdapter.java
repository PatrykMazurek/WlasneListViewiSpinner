package com.example.patryyyk21.wlasnelistviewispinner;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Patryyyk21 on 2017-10-25.
 */

public class MyArrayAdapter extends ArrayAdapter<Country> {


    public MyArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Country> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){

        Country country = getItem(position);

        if (converView == null){
            converView = LayoutInflater.from(getContext()).inflate(R.layout.my_spinner_item , parent, false);
        }
        ImageView ivCountryFlag = (ImageView)converView.findViewById(R.id.ivFlag);
        TextView tvCountryName = (TextView)converView.findViewById(R.id.tVCountryName2);

        ivCountryFlag.setImageResource(country.getFlag());
        tvCountryName.setText(country.getName());

        return converView;
    }

    @Override
    public View getDropDownView(int position, View converView, ViewGroup parent){
        final Country country = getItem(position);

        if (converView == null){
            converView = LayoutInflater.from(getContext()).inflate(R.layout.my_spinner_item , parent, false);
        }
        ImageView ivCountryFlag = (ImageView)converView.findViewById(R.id.ivFlag);
        TextView tvCountryName = (TextView)converView.findViewById(R.id.tVCountryName2);

        ivCountryFlag.setImageResource(country.getFlag());
        tvCountryName.setText(country.getName());

        return converView;
    }
}
