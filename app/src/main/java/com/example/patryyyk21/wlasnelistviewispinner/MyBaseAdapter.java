package com.example.patryyyk21.wlasnelistviewispinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Patryyyk21 on 2017-10-23.
 */

public class MyBaseAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Country> countries;

    public MyBaseAdapter(Context mContext, ArrayList<Country> mCountry)
    {
        this.context = mContext;
        this.countries = mCountry;
    }
    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null ){
            view = LayoutInflater.from(context).inflate(R.layout.my_listview_item, null);
        }

        //final Country countryItem = (Country)getItem(position);
        final Country countryItem = countries.get(position);

        ImageView ivCountryImage = (ImageView)view.findViewById(R.id.iVCountry);
        TextView tvCountryName = (TextView)view.findViewById(R.id.tVCountryName);
        TextView tvCountryDescription = (TextView) view.findViewById(R.id.tVCountryDescription);
        TextView tvCountryCapitol = (TextView) view.findViewById(R.id.tvCountryCapitol);

        ivCountryImage.setImageResource(countryItem.getFlag());

        tvCountryName.setText(countryItem.getName());
        tvCountryDescription.setText( context.getString(R.string.surface) + " " + countryItem.getSurface());
        tvCountryCapitol.setText( context.getString(R.string.capitol) + " " + countryItem.getCapitol());

        return view;
    }

}
