package com.example.user.recyclerviewcardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    RecyclerView myRecycler;
    MyCustomAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        myRecycler = ((RecyclerView) findViewById(R.id.recyclerView));
        myAdapter = new MyCustomAdapter(this, Data.getData());

        myRecycler.setAdapter(myAdapter);

        myRecycler.setLayoutManager(new LinearLayoutManager(this)); // Vertical Orientation By Default


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.linearViewHorizontal:

                LinearLayoutManager mLinearManagerHorizontal = new LinearLayoutManager(this);
                mLinearManagerHorizontal.setOrientation(LinearLayoutManager.HORIZONTAL);
                myRecycler.setLayoutManager(mLinearManagerHorizontal);
                break;
            case R.id.linearViewVertical:

                LinearLayoutManager mLinearManagerVertical = new LinearLayoutManager(this);
                mLinearManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
                myRecycler.setLayoutManager(mLinearManagerVertical);
                break;
            case R.id.gridView:
                GridLayoutManager mGridManagerGrid = new GridLayoutManager(this,4);
                myRecycler.setLayoutManager(mGridManagerGrid);
                break;
            case R.id.staggerViewVertical:
                StaggeredGridLayoutManager mStaggeredManagerVertical = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
                mStaggeredManagerVertical.setOrientation(mStaggeredManagerVertical.VERTICAL);
                myRecycler.setLayoutManager(mStaggeredManagerVertical);
                break;
            case R.id.staggerViewHorizontal:
                StaggeredGridLayoutManager mStaggeredManagerHorizontal = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
                mStaggeredManagerHorizontal.setOrientation(mStaggeredManagerHorizontal.HORIZONTAL);
                myRecycler.setLayoutManager(mStaggeredManagerHorizontal);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
