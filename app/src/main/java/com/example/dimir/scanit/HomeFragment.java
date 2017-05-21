package com.example.dimir.scanit;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View v;

    ImageButton btnScan,btnList,btnSales,btnpple;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_home, container, false);
        configureImageButton();
        return v;

    }

    private void configureImageButton() {

        btnScan=(ImageButton) v.findViewById(R.id.btnScan);
        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scannerActivity=new Intent(getActivity(),Scanner.class);
                startActivity(scannerActivity);


                Toast.makeText(getActivity(), "Scanner!", Toast.LENGTH_LONG).show();

            }
        });

        btnList= (ImageButton) v.findViewById(R.id.btnList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListActivity=new Intent(getActivity(),List.class);
                startActivity(ListActivity);

                Toast.makeText(getActivity(), "Shopping List", Toast.LENGTH_LONG).show();
            }
        });
    }

}
