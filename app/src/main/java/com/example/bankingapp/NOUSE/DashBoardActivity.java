//package com.example.bankingapp.NOUSE;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//import android.os.Handler;
//import android.widget.Toast;
//
//import com.example.bankingapp.DRVInterface.LoadsMore;
//import com.example.bankingapp.R;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//public class DashBoardActivity extends AppCompatActivity {

//    private RecyclerView recyclerView;
//    private StaticRvAdapter staticRvAdapter;
//
//    List<DynamicRvModel> item = new ArrayList();
//    DynamicRvAdapter dynamicRvAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_dash_board);
//        getSupportActionBar().hide();
//
//        ArrayList<StaticRvModel> items = new ArrayList<>();
//        items.add(new StaticRvModel(R.drawable.bankpng, "Transfer"));
//        items.add(new StaticRvModel(R.drawable.bankk, "Deposit"));
//        items.add(new StaticRvModel(R.drawable.fb_logo, "Withdraw"));
//        items.add(new StaticRvModel(R.drawable.google,"Google"));items.add(new StaticRvModel(R.drawable.bankpng, "Transfer"));
//        items.add(new StaticRvModel(R.drawable.bankk, "Deposit"));
//        items.add(new StaticRvModel(R.drawable.fb_logo, "Withdraw"));
//        items.add(new StaticRvModel(R.drawable.google,"Google"));
//
//        recyclerView = findViewById(R.id.rv_1);
//        staticRvAdapter = new StaticRvAdapter(items);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
//        recyclerView.setAdapter(staticRvAdapter);
//
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//        item.add(new DynamicRvModel("Bank"));
//
//
//        RecyclerView drv = findViewById(R.id.rv_2);
//        drv.setLayoutManager(new LinearLayoutManager(this));
//        dynamicRvAdapter = new DynamicRvAdapter(drv,this,item);
//        drv.setAdapter(dynamicRvAdapter);
//
//        dynamicRvAdapter.setLoadsMore(new LoadsMore() {
//            @Override
//            public void onLoadMore() {
//                if (item.size()<=10) {
//                    item.add(null);
//                    dynamicRvAdapter.notifyItemInserted(item.size()-1);
//                    new Handler().postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                           item.remove(item.size()-1);
//                            dynamicRvAdapter.notifyItemRemoved(item.size());
//
//                            int index = item.size();
//                            int end = index + 10;
//                            for (int i = index; i < end; i++) {
//                              String name = UUID.randomUUID().toString() ;
//                              DynamicRvModel itemm = new DynamicRvModel(name);
//                              item.add(itemm);
//                            }
//                            dynamicRvAdapter.notifyDataSetChanged();
//                            dynamicRvAdapter.setLoaded();
//                        }
//                    }, 4000);
//
//                } else {
//                    Toast.makeText(DashBoardActivity.this, "Data Completed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//    }
//}