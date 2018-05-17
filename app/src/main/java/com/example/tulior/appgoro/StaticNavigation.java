package com.example.tulior.appgoro;

import android.content.Context;
import android.content.Intent;

public final class StaticNavigation {
    public static boolean ExecuteBottonNavigation(Context context, int itemId) {
        Intent intent = null;

        switch (itemId) {
            case R.id.navigation_home:
                intent = new Intent(context, BeerOptionsActivity.class);
                context.startActivity(intent);
                return true;
            case R.id.navigation_beer:
                intent = new Intent(context, MakingGoroActivity.class);
                context.startActivity(intent);
                return true;
            case R.id.navigation_buy:
                intent = new Intent(context, BeerOptionsActivity.class);
                context.startActivity(intent);
                return true;
            case R.id.navigation_profile:
                intent = new Intent(context, UserProfileActivity.class);
                context.startActivity(intent);
                return true;
        }
        return false;
    }

}
