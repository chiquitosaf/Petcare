package com.tubes.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;
import java.util.Calendar;

public class register extends AppCompatActivity {

    private EditText input_date;
    private TextView text_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        input_date = findViewById(R.id.input_tanggal_lahir);
        text_date = findViewById(R.id.txt_input_tanggal_lahir);
        input_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDateDialog();
            }
        });
    }

    public void openDateDialog(){
        DatePickerDialog dateDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                text_date.setText(String.valueOf(dayOfMonth)+"/"+String.valueOf(month)+"/"+String.valueOf(year));
            }
        }, Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));

        dateDialog.show();
    }

}