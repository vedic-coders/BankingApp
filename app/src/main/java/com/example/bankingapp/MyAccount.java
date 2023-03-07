package com.example.bankingapp;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MyAccount extends AppCompatActivity {

    Switch aSwitch, bSwitch, cSwitch;
    TextView accountBalance, cardBalance, upiBalance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
//        getSupportActionBar().hide();
        aSwitch = findViewById(R.id.switch1);
        bSwitch = findViewById(R.id.switch2);
        cSwitch = findViewById(R.id.switch3);
        accountBalance = findViewById(R.id.actBal);
        cardBalance = findViewById(R.id.cardActBal);
        upiBalance = findViewById(R.id.upiBal);
        accountBalance.setHeight(0);
        cardBalance.setHeight(0);
        upiBalance.setHeight(0);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // on below line we are checking
                // if switch is checked or not.
                if (isChecked) {
                    // on below line we are setting text
                    // if switch is checked.
                    accountBalance.setHeight(60);
                } else {
                    // on below line we are setting text
                    // if switch is unchecked.
                    accountBalance.setHeight(0);
                }
            }
        });

        bSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // on below line we are checking
                // if switch is checked or not.
                if (isChecked) {
                    // on below line we are setting text
                    // if switch is checked.
                    cardBalance.setHeight(60);
                } else {
                    // on below line we are setting text
                    // if switch is unchecked.
                    cardBalance.setHeight(0);
                }
            }
        });

        cSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // on below line we are checking
                // if switch is checked or not.
                if (isChecked) {
                    // on below line we are setting text
                    // if switch is checked.
                    upiBalance.setHeight(60);
                } else {
                    // on below line we are setting text
                    // if switch is unchecked.
                    upiBalance.setHeight(0);
                }
            }
        });
    }
}