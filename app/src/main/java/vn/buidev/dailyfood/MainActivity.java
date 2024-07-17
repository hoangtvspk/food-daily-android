package vn.buidev.dailyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Simulate checking if the user is logged in
        boolean isLoggedIn = checkIfUserIsLoggedIn();

        if (isLoggedIn) {
            // Navigate to Home Screen
            startActivity(new Intent(this, HomeActivity.class));
        } else {
            // Navigate to Login Screen
            startActivity(new Intent(this, LoginActivity.class));
        }

        // Close the MainActivity so it's not in the back stack
        finish();
    }

    private boolean checkIfUserIsLoggedIn() {
        // Replace with actual login status check logic
        return false;
    }
}