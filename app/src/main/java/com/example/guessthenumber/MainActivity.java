package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int Ranval,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RandomMethod();
    }

    public void RandomMethod() {
        Ranval = (int) (Math.random() * (100 - 0 + 1) + 0);
         number=Ranval;
    }

    public void guessClicked(View view) {
//        EditText value = findViewById(R.id.editText);
//        if (!value.toString().isEmpty()) {
//            int input = Integer.parseInt(value.getText().toString());
//            TextView textView = findViewById(R.id.textView);
//            textView.setText("" + input + Ranval);
//            }
//        if (value.getText().toString().length() == 0 || value.getText().toString().length() == 1) {
//            Toast.makeText(this, "Please input number", Toast.LENGTH_LONG).show();
//        }
        EditText editText = findViewById(R.id.editText);
        String star = editText.getText().toString();

        if (star.equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "Enter A Number", Toast.LENGTH_LONG).show();
        } else {
            int guess = Integer.parseInt(editText.getText().toString());
            TextView textView = findViewById(R.id.textView);
            if (number == guess) {
                textView.setText(
                        "Congratulations!"
                                + " You guessed the number. New Number Created");
                RandomMethod();
            }
            else if (number > guess) {
                textView.setText(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess) {
                textView.setText(
                        "The number is"
                                + " less than " + guess);
            }

        }
    }
}