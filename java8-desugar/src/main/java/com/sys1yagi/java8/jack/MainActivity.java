package com.sys1yagi.java8.jack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Optional<String> name = getNameOrNull();
        Toast.makeText(this, name.orElse("jack and"), Toast.LENGTH_SHORT).show();
        name.map(input -> input + input);
//
        Stream.of("a", "b", "c")
                .map(value -> value + value)
                .collect(Collectors.toList());

        Log.d("moge", "test:" + Sample.test());
    }

    private Optional<String> getNameOrNull() {
        return Optional.ofNullable("jill");
    }
}
