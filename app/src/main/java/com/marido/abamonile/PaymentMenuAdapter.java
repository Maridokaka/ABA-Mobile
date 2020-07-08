package com.marido.abamonile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.marido.abamonile.R;
import com.marido.abamonile.adapter.TitleAdapter;
import com.marido.abamonile.modedl.MenuItem;

import java.text.CollationElementIterator;
import java.util.List;

public class PaymentMenuAdapter extends RecyclerView.Adapter<PaymentMenuAdapter.ViewHolder> {

    private List<MenuItem> list;
    private Context context;

    public PaymentMenuAdapter(List<MenuItem> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.moblie_layout,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MenuItem item = list.get(position);

        holder.title.setText(item.getTitle());
        holder.icon.setImageDrawable(item.getIcon());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CollationElementIterator title;
        public ImageSwitcher icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.image_icon);
            TextView title1 = itemView.findViewById(R.id.tv_title);
        }
    }
}
