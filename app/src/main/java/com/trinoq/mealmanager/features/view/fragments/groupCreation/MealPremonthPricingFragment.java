package com.trinoq.mealmanager.features.view.fragments.groupCreation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trinoq.mealmanager.R;
public class MealPremonthPricingFragment extends Fragment {

    public MealPremonthPricingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meal_pre_month_pricing, container, false);
    }
}