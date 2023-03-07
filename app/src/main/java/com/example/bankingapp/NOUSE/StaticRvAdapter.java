//package com.example.bankingapp.NOUSE;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.bankingapp.R;
//
//import java.util.ArrayList;
//
//public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticRvViewHolder>{
//
//    private ArrayList<StaticRvModel> items;
//    int row_index = -1;
//
//    public StaticRvAdapter(ArrayList<StaticRvModel> items) {
//        this.items = items;
//    }
//
//    @NonNull
//    @Override
//    public StaticRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item,parent,false);
//        StaticRvViewHolder holder = new StaticRvViewHolder(view);
//        return holder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull StaticRvViewHolder holder, int position) {
//        StaticRvModel currentItem = items.get(position);
//        holder.imageView.setImageResource(currentItem.getImage());
//        holder.textView.setText(currentItem.getText());
//
//        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                row_index = holder.getAdapterPosition();
//                notifyDataSetChanged();
//            }
//        });
//
//        if (row_index == position){
//            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected);
//
//        }else{
//            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_background);
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return items.size();
//    }
//
//    public static class StaticRvViewHolder extends RecyclerView.ViewHolder{
//
//        TextView textView;
//        ImageView imageView;
//        LinearLayout linearLayout;
//
//        public StaticRvViewHolder(@NonNull View itemView) {
//            super(itemView);
//            imageView = itemView.findViewById(R.id.img);
//            textView = itemView.findViewById(R.id.txt_transfer);
//            linearLayout = itemView.findViewById(R.id.linearlayout);
//        }
//    }
//}
