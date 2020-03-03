package co.uac.tabapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import co.uac.tabapp.fragmentos.FragmentOne;
import co.uac.tabapp.fragmentos.FragmentThree;
import co.uac.tabapp.fragmentos.FragmentTwo;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne(), "WebView");
        adapter.addFragment(new FragmentTwo(), "ListView");
        adapter.addFragment(new FragmentThree(), "Google Maps");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
