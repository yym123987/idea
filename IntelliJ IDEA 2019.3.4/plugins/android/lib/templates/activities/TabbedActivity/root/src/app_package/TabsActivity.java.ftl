package ${escapeKotlinIdentifiers(packageName)};

import android.os.Bundle;
import ${getMaterialComponentName('android.support.design.widget.FloatingActionButton', useMaterial2)};
import ${getMaterialComponentName('android.support.design.widget.Snackbar', useMaterial2)};
import ${getMaterialComponentName('android.support.design.widget.TabLayout', useMaterial2)};
import ${getMaterialComponentName('android.support.v4.view.ViewPager', useAndroidX)};
import ${getMaterialComponentName('android.support.v7.app.AppCompatActivity', useAndroidX)};
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import ${packageName}.ui.main.SectionsPagerAdapter;

public class ${activityClass} extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.${layoutName});
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}