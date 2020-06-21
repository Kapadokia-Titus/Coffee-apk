package kapadokia.nyandoro.coffee.utilities;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kapadokia.nyandoro.coffee.R;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ItemViewHolder> {
    private ArrayList<FeaturedItem> mItems;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        public TextView mItemName;
        public TextView mItemDesc;
        public ImageView mImageView;

        public ItemViewHolder(View v) {
            super(v);
            mItemDesc = v.findViewById(R.id.item_desc);
            mItemName =  v.findViewById(R.id.item_name);
            mImageView =  v.findViewById(R.id.item_image);
        }
    }

    public FeaturedAdapter(ArrayList<FeaturedItem> items) {
        mItems = items;
    }

    @Override
    public FeaturedAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.featured_view, parent, false);

        ItemViewHolder itemHolder = new ItemViewHolder(v);
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.mItemDesc.setText(mItems.get(position).getDescription());
        holder.mItemName.setText(mItems.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}