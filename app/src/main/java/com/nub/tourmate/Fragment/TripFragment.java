package com.nub.tourmate.Fragment;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.nub.tourmate.Adapter.TripAdapter;
import com.nub.tourmate.BottomSheet_AddTrip;
import com.nub.tourmate.Classes.IndividualTrip;
import com.nub.tourmate.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TripFragment extends Fragment {


    public TripFragment() {
    }

    private BottomSheet_AddTrip bottomSheet_addTrip;
    private FloatingActionButton fab;
    private RecyclerView triprecyclerView;
    DatabaseReference database;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference myRef;
    private List<IndividualTrip> list;
    private List<IndividualTrip> filterList;
    private TripAdapter tripAdapter;
    //private Context context;
    private FirebaseAuth firebaseAuth;
    String currentuser;

    private long fromdateMs;
    private long fromdateMs1;
    private long todateMs;
    private long todateMss = Long.valueOf("2592000000");
    ////////////////

    private TextView fromDateTv, toDateTv;
    private LinearLayout fromDatepicked, toDatepicked;
    private long selectedFromDateinMS;
    private long selectedToDateinMS;
    private TextView viewAllTripsTv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trip, container, false);


        return view;
    }


}
