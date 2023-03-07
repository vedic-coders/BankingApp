//package com.example.bankingapp.NOUSE;
//
//import android.graphics.drawable.Drawable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.bankingapp.R;
//
//public class SimpleItem extends DrawerItems<SimpleItem.ViewHolder>{
//
//
//    private int selectedItenIconTint;
//    private int selectedItenTitleTint;
//
//    private int unselectedItenIconTint;
//    private int unselectedItenTitleTint;
//
//    private Drawable icon;
//    private String title;
//
//    public SimpleItem(Drawable icon, String title){
//        this.icon = icon;
//        this.title = title;
//    }
//    @Override
//    public ViewHolder createViewHolder(ViewGroup parent) {
//       LayoutInflater inflater = LayoutInflater.from(parent.getContext()) ;
//       View view = inflater.inflate(R.layout.item_option, parent, false);
//       return new ViewHolder(view);
//    }
//
//    @Override
//    public void bindViewHolder(ViewHolder holder) {
//        holder.icon.setImageDrawable(icon);
//        holder.title.setText(title);
//
//        holder.title.setText(isChecked ? selectedItenTitleTint : unselectedItenTitleTint);
//        holder.icon.setColorFilter(isChecked ? selectedItenIconTint : unselectedItenIconTint);
//
//    }
//    public SimpleItem withSelectedIconTint(int SelectedItemIconTint) {
//        this.selectedItenIconTint = SelectedItemIconTint;
//        return this;
//    }
//
//    public SimpleItem withSelectedTitleTint(int SelectedItemTitleTint) {
//        this.selectedItenTitleTint = SelectedItemTitleTint;
//        return this;
//    }
//
//    public SimpleItem withUnselectedIconTint(int UnselectedItemIconTint) {
//        this.unselectedItenIconTint = UnselectedItemIconTint;
//        return this;
//    }
//
//    public SimpleItem withUnselectedTitleTint(int UnselectedItemTitleTint) {
//        this.unselectedItenTitleTint = UnselectedItemTitleTint;
//        return this;
//    }
//    static class ViewHolder extends DrawerAdapter.ViewHolder{
//
//        private ImageView icon;
//        private TextView title;
//
//
//        public ViewHolder(View view){
//            super(view);
//            icon = view.findViewById(R.id.icon);
//            title = view.findViewById(R.id.title);
//        }
//    }
//
//}
