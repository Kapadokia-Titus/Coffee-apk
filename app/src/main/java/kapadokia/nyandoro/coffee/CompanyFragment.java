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
    ImageView banner, contact, wait, driveThrough;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.company_fragment, container, false);

        banner= view.findViewById(R.id.banner);
        Picasso.get().load(R.drawable.beans).into(banner);

        contact= view.findViewById(R.id.icon_contact);
        Picasso.get().load(R.drawable.ic_done).into(contact);

        wait= view.findViewById(R.id.icon_wait);
        Picasso.get().load(R.drawable.ic_done).into(wait);

        driveThrough= view.findViewById(R.id.icon_drivethru);
        Picasso.get().load(R.drawable.ic_done).into(driveThrough);


        return view;
    }
}
