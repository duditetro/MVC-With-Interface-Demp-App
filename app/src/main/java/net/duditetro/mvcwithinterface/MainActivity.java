package net.duditetro.mvcwithinterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    TextView messageTv;
    Button changeTextBtn;
    MainContract.Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageTv = findViewById(R.id.textViewMessage);
        changeTextBtn = findViewById(R.id.buttonChangeText);

        controller = new MainController(this);

        changeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.onButtonClicked();
            }
        });



    }

    @Override
    public void showGreeting(String message)
    {
        messageTv.setText(message);
    }
}