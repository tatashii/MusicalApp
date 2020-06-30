package com.example.musicalapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SherinArrayAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<Sherin_ModelClass> SherinArrayList;

    public SherinArrayAdapter(Context context, ArrayList sherinArrayList) {


        this.context=context;
        this.SherinArrayList=sherinArrayList;

    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return  SherinArrayList.size();
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {

        return SherinArrayList.get(position);
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) { convertView = LayoutInflater.from(context).
                inflate(R.layout. sherin_list_item, parent, false); }
        Sherin_ModelClass sherin_modelClass = (Sherin_ModelClass) getItem(position);
        ImageView imageView1=convertView.findViewById(R.id.sherin_image);
        ImageView imageView2=convertView.findViewById(R.id.songplay);
        TextView tv1=convertView.findViewById(R.id.sherin_name);
        TextView tv2=convertView.findViewById(R.id.song_name);
        imageView1.setImageAlpha(sherin_modelClass.getSherin_images());
        imageView2.setImageAlpha(sherin_modelClass.getMywave());
        tv1.setText(sherin_modelClass.getSingerName());
        tv2.setText(sherin_modelClass.getSongName());

        return convertView;
    }
}

