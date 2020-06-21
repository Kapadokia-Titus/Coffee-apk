package kapadokia.nyandoro.coffee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import kapadokia.nyandoro.coffee.utilities.GalleryAdapter;

public class GalleryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gallery_fragment, container, false);

        ArrayList<String> imageUrls = new ArrayList<String>();

        GridView gridGallery = view.findViewById(R.id.grid_gallery);
        GalleryAdapter gridAdapter = new GalleryAdapter(getContext(), R.layout.gallery_item_layout, imageUrls);
        gridGallery.setAdapter(gridAdapter);

        return view;
    }
}
