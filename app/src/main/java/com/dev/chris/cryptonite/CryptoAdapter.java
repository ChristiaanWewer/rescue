package com.dev.chris.cryptonite;

import android.content.Context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by chris on 3-1-2018.
 */

public class CryptoAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<CryptoCoinData> cryptoCoinData;

    public CryptoAdapter(Context context, ArrayList<CryptoCoinData> cryptoCoinData) {
        super(context, R.layout.cryptocoin_row, cryptoCoinData);

        this.context = context;
        this.cryptoCoinData = cryptoCoinData;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.cryptocoin_row, parent, false);

        TextView numberRowTextView = view.findViewById(R.id.numberRowTextView);
        TextView nameRowTextView = view.findViewById(R.id.nameRowTextView);
        TextView priceRowTextView = view.findViewById(R.id.priceRowTextView);
        TextView priceChangeRowTextView = view.findViewById(R.id.priceChangeRowTextView);

        numberRowTextView.setText(cryptoCoinData.get(position).getRank());
        nameRowTextView.setText(cryptoCoinData.get(position).getCoinName());
        priceRowTextView.setText(Double.toString(cryptoCoinData.get(position).getPriceUsd()));
        priceChangeRowTextView.setText(cryptoCoinData.get(position).getDayVolumeUsd());

        return view;
    }

}
