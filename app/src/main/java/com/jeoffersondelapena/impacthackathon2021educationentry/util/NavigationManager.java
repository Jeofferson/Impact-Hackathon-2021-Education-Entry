package com.jeoffersondelapena.impacthackathon2021educationentry.util;

import android.content.Context;
import android.content.Intent;

public class NavigationManager {
    public static void goToActivity(Context context, Class _class, boolean isClearTask) {
        Intent intent = new Intent(context, _class);

        if (isClearTask) {
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        }

        context.startActivity(intent);
    }

//    public static void goToFragment(Context context, String fragmentStackName, Fragment fragment) {
//        ((FragmentActivity) context).getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fragment_container, fragment)
//                .hide(BottomNavigationViewStacksManager.currentFragment)
//                .show(fragment)
//                .commit();
//
//        BottomNavigationViewStacksManager.currentFragment = fragment;
//        BottomNavigationViewStacksManager.currentFragmentStackName = fragmentStackName;
//
//        BottomNavigationViewStacksManager.createFragment(fragmentStackName, fragment);
//    }
}