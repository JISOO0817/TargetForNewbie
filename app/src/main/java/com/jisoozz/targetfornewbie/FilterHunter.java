package com.jisoozz.targetfornewbie;

import android.widget.Filter;

import java.util.ArrayList;

public class FilterHunter extends Filter {

    private HunterAdapter hunterAdapter;
    private ArrayList<Hunter> filterList;

    public FilterHunter(HunterAdapter hunterAdapter, ArrayList<Hunter> filterList) {
        this.hunterAdapter = hunterAdapter;
        this.filterList = filterList;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {

        FilterResults results = new FilterResults();

        if(constraint != null && constraint.length()>0){

            constraint = constraint.toString().toUpperCase();
            ArrayList<Hunter> filterMarkets = new ArrayList<>();

            for(int i=0; i<filterList.size(); i++){


            }

            results.count = filterMarkets.size();
            results.values = filterMarkets;
        }else{
            results.count = filterList.size();
            results.values = filterList;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {


    }
}
