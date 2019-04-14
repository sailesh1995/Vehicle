package edu.softwarica.android.project.vehicle;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recyclerView;
    ArrayList<Vehicle> vehicleList;
    EditText etxt_maker, etxt_year, etxt_color, etxt_price, etxt_engine;
    Button btn_car, btn_diesel;
    TextView txt_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicleList = new ArrayList<>();

        etxt_maker = findViewById(R.id.etxt_maker);
        etxt_year = findViewById(R.id.etxt_year);
        etxt_color = findViewById(R.id.etxt_color);
        etxt_price = findViewById(R.id.etxt_price);
        etxt_engine = findViewById(R.id.etxt_engine);
        txt_details = findViewById(R.id.txt_details);
        btn_car = findViewById(R.id.btn_car);
        btn_diesel = findViewById(R.id.btn_diesel);

        btn_car.setOnClickListener(this);
        btn_diesel.setOnClickListener(this);


    }

    public void addVechicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleList.size() + 1);
        vehicle.setManufacturer(etxt_maker.getText().toString());
        vehicle.setYear(Integer.parseInt(etxt_year.getText().toString()));
        vehicle.setColor(etxt_color.getText().toString());
        vehicle.setPrice(Float.parseFloat(etxt_price.getText().toString()));
        vehicle.setEngine(Float.parseFloat(etxt_engine.getText().toString()));
        vehicleList.add(vehicle);

    }

    public void displayDetails(){
        for (int i = 0; i < vehicleList.size(); i++ ){
            txt_details.setText("This is vehicla No. " + vehicleList.get(i).getId() + "\n"
            + "Manufacturer: " + vehicleList.get(i).getManufacturer() + "; " +
                    "Current Value: " + Float.toString(vehicleList.get(i).getPrice()) + "Effective"
            + "\n" + "engine size: " + Float.toString(vehicleList.get(i).getEngine()));
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_car:
                addVechicle();
                displayDetails();

                break;
            case R.id.btn_diesel:
                break;
            default:
                break;
        }
    }

}



