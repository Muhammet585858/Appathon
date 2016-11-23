package com.example.muhammet.appathon;
import android.app.Activity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by Muhammet on 22-11-2016.
 */

public class Microphone extends MainActivity {

    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.microphone);
        double x,y;
        x = -5.0;
        GraphView graph = (GraphView) findViewById(R.id.decibellGraph);
        series = new LineGraphSeries<DataPoint>();
        for(int i = 0; i < 500; i++) {
            x = x + 0.1;
            y = Math.sin(x);
            series.appendData(new DataPoint(x, y), true, 500);
        }
        graph.addSeries(series);
    }

}
