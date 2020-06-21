package kapadokia.nyandoro.coffee.utilities;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import kapadokia.nyandoro.coffee.R;

public class GalleryAdapter extends ArrayAdapter {
    private Context context;
    private int layoutResourceId;
    private ArrayList data;

    public GalleryAdapter(Context context, int layoutResourceId, ArrayList data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        Picasso.get().load(UrlHelper.BaseUrl+ this.data.get(position))
                .error(R.drawable.beans)
                .into((ImageView) convertView);

        return convertView;
    }
}