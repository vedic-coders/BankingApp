//package com.example.bankingapp.NOUSE;
//
//import android.app.Activity;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.bankingapp.DRVInterface.LoadsMore;
//import com.example.bankingapp.R;
//
//import java.util.List;
//
//class LoadingViewHolder extends RecyclerView.ViewHolder{
//
//    public ProgressBar progress;
//
//    public LoadingViewHolder(@NonNull View itemView) {
//        super(itemView);
//        progress = itemView.findViewById(R.id.progressBar);
//    }
//}
//
//class itemViewHolder extends RecyclerView.ViewHolder{
//
//    public TextView name;
//
//    public itemViewHolder(@NonNull View itemView) {
//        super(itemView);
//        name = itemView.findViewById(R.id.bank);
//    }
//}
//
//public class DynamicRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
//
//    private final int VIEW_TYPE_ITEM = 0, VIEW_TYPE_LOADING=1;
//    LoadsMore loadsMore;
//    Activity activity;
//    boolean isLoading;
//    List<DynamicRvModel> items;
//    int visibleThreshold = 5;
//    int lastVisibleItem, totalItemCount;
//
//    public DynamicRvAdapter(RecyclerView recyclerView, Activity activity, List<DynamicRvModel> items) {
//        this.activity = activity;
//        this.items = items;
//
//        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
//        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//                totalItemCount = linearLayoutManager.getItemCount();
//                lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
//                if (!isLoading && totalItemCount<=(lastVisibleItem+visibleThreshold)) {
//                    if (loadsMore!=null)
//                        loadsMore.onLoadMore();
//                    isLoading = true;
//                }
//            }
//        });
//    }
//
//
//    @Override
//    public int getItemViewType(int position) {
//        return items.get(position)  == null ?VIEW_TYPE_LOADING:VIEW_TYPE_ITEM ;
//    }
//
//    public void setLoadsMore(LoadsMore loadsMore){
//        this.loadsMore = loadsMore;
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        if (viewType == VIEW_TYPE_ITEM){
//            View view = LayoutInflater.from(activity).inflate(R.layout.dynamic_rv_items, parent, false);
//            return new LoadingViewHolder(view);
//        }
//        else if (viewType == VIEW_TYPE_LOADING){
//            View view = LayoutInflater.from(activity).inflate(R.layout.dynamic_rv_progress_bar, parent, false);
//            return new LoadingViewHolder(view);        }
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        if(holder instanceof itemViewHolder){
//            DynamicRvModel  item =  items.get(position);
//            itemViewHolder itemViewHolder = (itemViewHolder) holder;
//            itemViewHolder.name.setText(items.get(position).getName());
//        }
//        else if(holder instanceof LoadingViewHolder){
//            LoadingViewHolder loadingViewHolder = (LoadingViewHolder) holder;
//            //    loadingViewHolder.progress.setVisibility(View.VISIBLE);
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return items.size();
//    }
//
//    public void setLoaded(){
//        isLoading = false;
//    }
//
//}
