package com.gerhorgan.tableview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.gerhorgan.tableview.Adapter.FixtureAdapter;
import com.gerhorgan.tableview.model.Player;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private FixtureAdapter mAdapter;
    private DatabaseReference mDatabase;
    private DatabaseReference fixtureEndPoint;
    private DatabaseReference playerEndPoint;
    TextView tv3, tv2,tv4,tv1,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15;
    //StorageReference storageReference= FirebaseStorage.getInstance().getReference().child("Kildare.png");
    ImageView iv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv2= (TextView) findViewById(R.id.tvPlayer2);
        tv3= (TextView) findViewById(R.id.tvPlayer3);
        tv4= (TextView) findViewById(R.id.tvPlayer4);
        tv1= (TextView) findViewById(R.id.tvPlayer1);
        tv5= (TextView) findViewById(R.id.tvPlayer5);
        tv6= (TextView) findViewById(R.id.tvPlayer6);
        tv7= (TextView) findViewById(R.id.tvPlayer7);
        tv8= (TextView) findViewById(R.id.tvPlayer8);
        tv9= (TextView) findViewById(R.id.tvPlayer9);
        tv10= (TextView) findViewById(R.id.tvPlayer10);
        tv11= (TextView) findViewById(R.id.tvPlayer11);
        tv12= (TextView) findViewById(R.id.tvPlayer12);
        tv13= (TextView) findViewById(R.id.tvPlayer13);
        tv14= (TextView) findViewById(R.id.tvPlayer14);
        tv15= (TextView) findViewById(R.id.tvPlayer15);

        iv= (ImageView) findViewById(R.id.imageView2);

        mDatabase= FirebaseDatabase.getInstance().getReference();
        playerEndPoint=mDatabase.child("Dublin").child("Players");
        //addInitialData();
        playerEndPoint.addValueEventListener(valueEventListener);
        StorageReference storageReference= FirebaseStorage.getInstance().getReference().child("Kildare.png");


        Glide.with(this /* context */)
                .using(new FirebaseImageLoader())
                .load(storageReference)
                .into(iv);


    }

    private void addInitialData(){

        List<Player> samplePlayers= SampleData.getSamplePlayers();
            for (Player player: samplePlayers){
                String key= playerEndPoint.push().getKey();
                player.setPlayerId(key);
                playerEndPoint.child(key).setValue(player);

            }



    }

    ValueEventListener valueEventListener= new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            ArrayList<String> names = new ArrayList<>();

            for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                Player player= snapshot.getValue(Player.class);
                names.add(player.getName());
                //tv2.setText(player.getName());

            }
            tv2.setText(names.get(1));
            tv3.setText(names.get(2));
            tv4.setText(names.get(3));
            tv1.setText(names.get(0));
            tv5.setText(names.get(4));
            tv6.setText(names.get(5));
            tv7.setText(names.get(6));
            tv8.setText(names.get(7));
            tv9.setText(names.get(8));
            tv10.setText(names.get(9));
            tv11.setText(names.get(10));
            tv12.setText(names.get(11));
            tv13.setText(names.get(12));
            tv14.setText(names.get(13));
            tv15.setText(names.get(14));


        }

        @Override
        public void onCancelled(DatabaseError databaseError) {

        }

    };











}