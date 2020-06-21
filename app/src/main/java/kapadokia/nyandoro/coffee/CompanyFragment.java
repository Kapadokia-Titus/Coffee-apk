package kapadokia.nyandoro.coffee;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

public class CompanyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.company_fragment, container, false);

        ImageView imageView = view.findViewById(R.id.banner);
        Picasso.get().load(R.drawable.beans).into(imageView);
        return view;
    }
}
