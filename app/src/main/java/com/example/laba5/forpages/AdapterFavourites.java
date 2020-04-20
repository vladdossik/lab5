package com.example.laba5.forpages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.laba5.R;
import com.example.laba5.api.model.PhotoDTO;

import java.util.List;


public class AdapterFavourites extends RecyclerView.Adapter<AdapterFavourites.ItemViewHolder> {
    private Context context;
    private List<PhotoDTO> list;
    private ItemViewHolder viewHolder;

    public AdapterFavourites(Context context, List<PhotoDTO> arrayPhotoDTO) {
        this.context = context;
        this.list = arrayPhotoDTO;
        System.out.println("array " + arrayPhotoDTO.size());
    }

    @NonNull
    @Override
    public AdapterFavourites.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab2_item, parent, false);
        return new ItemViewHolder(v);
    }

    @Override

    public void onBindViewHolder(@NonNull final ItemViewHolder holder, int position) {
        final PhotoDTO currentItem = list.get(position);
        viewHolder = (ItemViewHolder) holder;

        String imageUrl = currentItem.getImageUrl();
        Glide.with(context)
                .load(imageUrl)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(viewHolder.imageView);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.tab2_item_image);
        }

    }
}
