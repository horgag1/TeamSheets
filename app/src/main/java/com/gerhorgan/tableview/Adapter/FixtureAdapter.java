package com.gerhorgan.tableview.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.gerhorgan.tableview.R;
import com.gerhorgan.tableview.model.Fixtures;
import com.google.firebase.database.DatabaseReference;

/**
 * Created by gerhorgan on 18/07/2017.
 */

public class FixtureAdapter extends FirebaseRecyclerAdapter<Fixtures, FixtureAdapter.FixtureViewHolder> {

    private Context mApplicationContext;



    public FixtureAdapter(Context context,DatabaseReference ref) {
        super(Fixtures.class, R.layout.fixture_entry, FixtureViewHolder.class, ref);
        mApplicationContext = context.getApplicationContext();
    }

    static class FixtureViewHolder extends RecyclerView.ViewHolder{

        public final ImageView image;
        public final TextView time;
        public final TextView metadata;

        public FixtureViewHolder(View itemView) {
            super(itemView);
            this.image = (ImageView) itemView.findViewById(R.id.imageView1);
            this.time = (TextView) itemView.findViewById(R.id.textView1);
            this.metadata = (TextView) itemView.findViewById(R.id.textView2);
        }
    }




    @Override
    protected void populateViewHolder(FixtureViewHolder viewHolder, Fixtures model, int position) {


    }





}
