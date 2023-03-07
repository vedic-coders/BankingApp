//package com.example.bankingapp.NOUSE;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//
//public class SpaceItems extends DrawerItems<SpaceItems.ViewHolder>{
//
//    private int spaceDp;
//    public SpaceItems(int spaceDp){
//        this.spaceDp = spaceDp;
//    }
//    @Override
//    public ViewHolder createViewHolder(ViewGroup parent) {
//       Context context = parent.getContext();
//       View view = new View(context);
//       int height = (int) (context.getResources().getDisplayMetrics().density*spaceDp);
//       view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
//
//       return new ViewHolder(view);
//    }
//
//    @Override
//    public void bindViewHolder(ViewHolder holder) {
//
//    }
//
//    @Override
//    public boolean isSelectable() {
//        return false;
//    }
//
//    public class ViewHolder extends DrawerAdapter.ViewHolder{
//        public ViewHolder(View view){
//            super(view);
//        }
//    }
//}
