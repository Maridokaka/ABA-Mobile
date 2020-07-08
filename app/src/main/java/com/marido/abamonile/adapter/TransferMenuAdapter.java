package com.marido.abamonile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marido.abamonile.R;
import com.marido.abamonile.modedl.MenuItem;

import java.util.List;

public class TransferMenuAdapter extends RecyclerView.Adapter<TransferMenuAdapter.ViewHolder> {

    private List<MenuItem> list;
    private Context context;

    public TransferMenuAdapter(List<MenuItem> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_transfer_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) { //get item from index to display

        final MenuItem item = list.get(position);

        holder.title.setText(item.getTitle());
        holder.icon.setImageDrawable(item.getIcon());
    }

    @Override
    public int getItemCount() { //get item size.

        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView icon;
        private TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.image_icon);
            title = itemView.findViewById(R.id.tv_title);
        }
    }
}
