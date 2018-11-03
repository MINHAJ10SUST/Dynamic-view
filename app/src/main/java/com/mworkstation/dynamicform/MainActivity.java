package com.mworkstation.dynamicform;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.mworkstation.dynamicform.activity.LithoActivity;
import com.mworkstation.dynamicform.jasonobject.JsnEditTextView;
import com.mworkstation.dynamicform.jasonobject.JsnRootView;
import com.mworkstation.dynamicform.jasonobject.JsnTextView;
import com.mworkstation.dynamicform.object.MEditText;
import com.mworkstation.dynamicform.object.MLinearLayout;
import com.mworkstation.dynamicform.object.MTextView;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    MLinearLayout form;
    boolean visivity =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        form =findViewById(R.id.form);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();




        JsnTextView jsnTextView=new JsnTextView();
        jsnTextView.setTextColor("#FF0000");
        jsnTextView.setHint("HHHHHHHH");

        JsnEditTextView jsnEditTextView=new JsnEditTextView();
        jsnEditTextView.setHint("set name");
        jsnEditTextView.setHieght(200);
        jsnEditTextView.setLine(6);

        if(visivity) {
//            MTextView mTextView = new MTextView(this,jsnTextView);
//            mTextView.setText("Hi friends");
//
//            MTextView mTextView2 = new MTextView(this,jsnTextView);
//            mTextView2.setText("i am minhaj");
//            form.setOrientation(LinearLayout.VERTICAL);
//            form.addView(mTextView);
//            form.addView(new MEditText(this,jsnEditTextView));
//            form.addView(mTextView2);


            JsnRootView jsnRootView=new JsnRootView();
            jsnRootView.setJsnTextView(jsnTextView);
            jsnRootView.setJsnEditTextView(jsnEditTextView);
            form=JsnRootView.getView(form,jsnRootView.genericViews(this));
            visivity=false;
        }




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
               startActivity(new Intent(MainActivity.this, LithoActivity.class));
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
