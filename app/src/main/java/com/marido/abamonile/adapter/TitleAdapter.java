package com.marido.abamonile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marido.abamonile.R;
import com.marido.abamonile.modedl.MenuItem;

import java.util.List;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.Holder> {

    private Context context;
    private List<MenuItem> list;

    public TitleAdapter(Context context, List<MenuItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public TitleAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_menu,parent,false);
        return new TitleAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int position) {

        final MenuItem item = list.get(position);  // catch Position of List

        holder.icon.setImageDrawable(item.getIcon());
        holder.title.setText(item.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Titles"+position,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        private ImageView icon;
        private TextView title;

        public Holder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.icon);
            title = itemView.findViewById(R.id.tv_title);

        }
    }
}