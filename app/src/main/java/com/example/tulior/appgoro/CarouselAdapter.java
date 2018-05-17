package com.example.tulior.appgoro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class CarouselAdapter extends PagerAdapter {
    private final List<BeerModel> beerModelList;
    private final Activity act;
    private final Context context;
    private final LayoutInflater layoutInflater;

    public CarouselAdapter(List<BeerModel> beerModelList, Activity act, Context context) {
        this.beerModelList = beerModelList;
        this.act = act;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return beerModelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.card_item, container, false);

        ImageView beerMark = (ImageView) view.findViewById(R.id.beerMark);
        ImageView beerExample = (ImageView) view.findViewById(R.id.beerExample);

        RatingBar beerRating = (RatingBar) view.findViewById(R.id.beerRating);

        TextView beerName = (TextView) view.findViewById(R.id.beerName);
        TextView beerGroup = (TextView) view.findViewById(R.id.beerGroup);
        TextView beerStyle = (TextView) view.findViewById(R.id.beerStyle);
        TextView beerAlchoolPercent = (TextView) view.findViewById(R.id.beerAlchoolPercent);
        TextView beerActive = (TextView) view.findViewById(R.id.beerActive);
        TextView beerSazonal = (TextView) view.findViewById(R.id.beerSazonal);
        TextView beerTemperature = (TextView) view.findViewById(R.id.beerTemperature);
        TextView beerType = (TextView) view.findViewById(R.id.beerType);

        ImageButton buyBeer = (ImageButton) view.findViewById(R.id.buyBeer);

        BeerModel beerModel = this.beerModelList.get(position);

        beerMark.setImageResource(beerModel.BeerMark);
        beerMark.setImageResource(beerModel.BeerExample);

        beerRating.setRating(Float.parseFloat(beerModel.BeerRating));
        beerRating.setIsIndicator(true);

        beerName.setText(beerModel.BeerName);
        beerGroup.setText(beerModel.BeerGroup);
        beerStyle.setText(beerModel.BeerStyle);
        beerAlchoolPercent.setText(beerModel.BeerAlchoolPercent);
        beerActive.setText(beerModel.BeerActive);
        beerSazonal.setText(beerModel.BeerSazonal);
        beerTemperature.setText(beerModel.BeerTemperature);
        beerType.setText(beerModel.BeerType);

        buyBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(act, StartGoroActivity.class);
                //context.startActivity(intent);
                v.getContext().startActivity(intent);
            }
        });

        container.addView(view);

        return view;
    }
}
