package kapadokia.nyandoro.coffee;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kapadokia.nyandoro.coffee.utilities.FeaturedAdapter;
import kapadokia.nyandoro.coffee.utilities.FeaturedItem;

public class FeaturedFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.featured_fragment, container, false);

        mRecyclerView =view.findViewById(R.id.recycler_featured);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        final ArrayList<FeaturedItem> images = new ArrayList<>();
        images.add(new FeaturedItem("ground.jpg", "The Best Coffee", "It simply doesn't get any better."));
        images.add(new FeaturedItem("table.jpg", "Stay for a While", "Have a seat and stay a while to study, read, or ponder the universe."));
        images.add(new FeaturedItem("beans.jpg", "Freshly Roasted", "Every Morning. Every Time."));
        images.add(new FeaturedItem("granola.jpg", "Healthy Bites", "Start your morning off with a healthy snack."));
        images.add(new FeaturedItem("bag.jpg", "Smells to Go", "Take home some of our best beans."));
        mAdapter = new FeaturedAdapter(images);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
