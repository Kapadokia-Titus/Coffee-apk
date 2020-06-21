package kapadokia.nyandoro.coffee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment newFragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_featured:
                    newFragment = new FeaturedFragment();
                    break;
                case R.id.navigation_gallery:
                    newFragment = new GalleryFragment();
                    break;
                case R.id.navigation_company:
                    newFragment = new CompanyFragment();
                    break;
            }

            if(newFragment != null){
                FragmentTransaction fragmentManager = getSupportFragmentManager().beginTransaction();
                fragmentManager.replace(R.id.content,  newFragment)
                        .commit();
                return true;
            }

            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

       FragmentTransaction fragmentManager= getSupportFragmentManager().beginTransaction();
                fragmentManager.replace(R.id.content, new FeaturedFragment())
                .commit();

    }

}
