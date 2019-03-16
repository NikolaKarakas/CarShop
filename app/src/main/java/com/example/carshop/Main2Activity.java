package com.example.carshop;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.text.TextUtils;

import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

   // private TextView t1 ;

    private TextInputLayout mgtlBrand;
    private TextInputLayout mgtlModel;
    private TextInputLayout mgtlYear;
    private TextInputLayout mgtlMileage;
    private TextInputLayout mgtlFuel;
    private TextInputLayout mgtlType;
    private TextInputLayout mgtlPower;
    private TextInputLayout mgtlPrice;
    private  TextInputEditText mgtBrand;
    private TextInputEditText mgtModel;
    private TextInputEditText mgtYear;
    private TextInputEditText mgtMileage;
    private TextInputEditText mgtFuel;
    private TextInputEditText mgtType;
    private TextInputEditText mgtPower;
    private TextInputEditText mgtPrice;

    private Button acButton;
    private Firebase mRef;
    private Firebase mRootRef;
    DatabaseReference databaseReference;
    FirebaseDatabase database ;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        acButton = (Button) findViewById(R.id.addcarButton);

        mgtlBrand = findViewById(R.id.gtlBrand);
        mgtlModel = findViewById(R.id.gtlModel);
        mgtlYear = findViewById(R.id.gtlYear);
        mgtlMileage = findViewById(R.id.gtlMileage);
        mgtlFuel = findViewById(R.id.gtlFuel);
        mgtlType= findViewById(R.id.gtlType);
        mgtlPower = findViewById(R.id.gtlPower);
        mgtlPrice = findViewById(R.id.gtlPrice);
        mgtBrand = findViewById(R.id.gtBrand);
        mgtModel = findViewById(R.id.gtModel);
        mgtYear = findViewById(R.id.gtYear);
        mgtMileage = findViewById(R.id.gtMileage);
        mgtFuel = findViewById(R.id.gtFuel);
        mgtType= findViewById(R.id.gtType);
        mgtPower = findViewById(R.id.gtPower);
        mgtPrice = findViewById(R.id.gtPrice);



       mRef = new Firebase("https://carshop-a9d4b.firebaseio.com/cars");
       // mRootRef = new Firebase("https://carshop-a9d4b.firebaseio.com/Cars");
       // database= FirebaseDatabase.getInstance();
       // databaseReference = database.getReference().child("cars");


        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Firebase mRefChild = mRef.child("Brand");
                mRefChild.setValue(mgtlBrand.getEditText().getText().toString());
                mRefChild = mRef.child("Model");
                mRefChild.setValue(mgtlModel.getEditText().getText().toString());
                mRefChild = mRef.child("Year");
                mRefChild.setValue(mgtlYear.getEditText().getText().toString());
                mRefChild = mRef.child("Mileage");
                mRefChild.setValue(mgtlMileage.getEditText().getText().toString());
                mRefChild = mRef.child("Fuel");
                mRefChild.setValue(mgtlFuel.getEditText().getText().toString());
                mRefChild = mRef.child("Type");
                mRefChild.setValue(mgtlType.getEditText().getText().toString());
                mRefChild = mRef.child("Power");
                mRefChild.setValue(mgtlPower.getEditText().getText().toString());
                mRefChild = mRef.child("Price");
                mRefChild.setValue(mgtlPrice.getEditText().getText().toString());
*/
                addArrayList();

            }
        });





       // bAdminScreen = (TextView) findViewById(R.id.editText11);
    }

    private void  addArrayList(){
        String Brand = mgtlBrand.getEditText().getText().toString().trim();
        String Model=mgtlModel.getEditText().getText().toString().trim();
        String Year =mgtlYear.getEditText().getText().toString().trim();
        String Mileage =mgtlMileage.getEditText().getText().toString().trim();
        String Fuel =mgtlFuel.getEditText().getText().toString().trim();
        String Type = mgtlType.getEditText().getText().toString().trim();
        String Power =mgtlPower.getEditText().getText().toString().trim();
        String Price =mgtlPrice.getEditText().getText().toString().trim();


        if(TextUtils.isEmpty(Brand)) {
            mgtlBrand.setError("Please enter your Brand!");
        }else if (TextUtils.isEmpty(Model)){
            mgtlModel.setError("Please enter Model!");
        }else if(TextUtils.isEmpty(Year)){
            mgtlYear.setError("Please enter Year!");
        }else if(TextUtils.isEmpty(Mileage)){
            mgtlMileage.setError("Please enter Mileage!");
        }else if(TextUtils.isEmpty(Fuel)) {
            mgtlFuel.setError("Please enter Fuel!");
        } else if(TextUtils.isEmpty(Type)) {
            mgtlType.setError("Please enter Type!");
        }else if(TextUtils.isEmpty(Power)) {
            mgtlPower.setError("Please enter Power!");
        }else if(TextUtils.isEmpty(Price)){
                        mgtlPrice.setError("Please enter Price!");
        }else{

            //String id=  databaseReference.push().getKey();





            Cars cars = new Cars(Brand,Model,Year,Mileage,Fuel,Type,Power,Price);
          //  var aa = mRef.push();
            String mid = mRef.push().getKey();
            mRef.child(mid).child("Brand").setValue(Brand.toString());
            mRef.child(mid).child("Model").setValue(Model.toString());
            mRef.child(mid).child("Brand").setValue(Year.toString());
            mRef.child(mid).child("Mileage").setValue(Mileage.toString());
            mRef.child(mid).child("Fuel").setValue(Fuel.toString());
            mRef.child(mid).child("Type").setValue(Type.toString());
            mRef.child(mid).child("Power").setValue(Power.toString());
            mRef.child(mid).child("Price").setValue(Price.toString());




            Toast.makeText(this,"Car is added",Toast.LENGTH_LONG).show();
            Cleartxt();

        }

    }

    private void Cleartxt(){
        mgtBrand.setText("");
        mgtModel.setText("");
        mgtYear.setText("");
        mgtMileage.setText("");
        mgtFuel.setText("");
        mgtType.setText("");
        mgtPower.setText("");
        mgtPrice.setText("");


       // tID.requestFocus();

    }



}
