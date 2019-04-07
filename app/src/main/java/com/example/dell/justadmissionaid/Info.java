package com.example.dell.justadmissionaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Info extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        pdfView= (PDFView)findViewById(R.id.pdfview);
        pdfView.fromAsset("circular.pdf")
                .load();

    }
}
