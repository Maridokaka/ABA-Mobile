package com.marido.abamonile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marido.abamonile.PaymentMenuAdapter;
import com.marido.abamonile.R;
import com.marido.abamonile.modedl.DepositMenuitem;
import com.marido.abamonile.modedl.MenuItem;

import java.util.List;

public class DepositAdapter extends RecyclerView.Adapter<DepositAdapter.ViewHolder>{

    private List<DepositMenuitem> list;
    private Context context;

    public DepositAdapter(List<DepositMenuitem>list,Context context){
        this.list=list;
        this.context=context;
    }
    @NonNull
    @Override
    public DepositAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.moblie_layout,parent,false);
        return new DepositAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull DepositAdapter.ViewHolder holder, int position) {
        final DepositMenuitem item = list.get(position);

        holder.title.setText(item.getTitle());
        holder.icon.setImageDrawable(item.getIcon());
        holder.desc.setText(item.getDesc());
        holder.btntitle.setText(item.getBtntitle());

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView icon;
        private TextView title,desc;
        private Button btntitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.image_icon);
            title = itemView.findViewById(R.id.tv_title);
            btntitle = itemView.findViewById(R.id.btn_title);
            desc = itemView.findViewById(R.id.tv_desc);
        }

    }
}

