/**
* Created by dj on 6/5/17.
*/

package org.truthdefender.goalgetters.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import org.truthdefender.goalgetters.fragments.LoginFragment;
import org.truthdefender.goalgetters.R;

public class MainActivity extends AppCompatActivity {
	private FragmentManager fragmentManager;
	private LoginFragment loginFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    fragmentManager = getSupportFragmentManager();
        loginFragment = (LoginFragment)fragmentManager.findFragmentById(R.id.login);
        if(loginFragment == null) {
            loginFragment = new LoginFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.main, loginFragment)
                    .addToBackStack(null)
                    .commit();
        }
	}

    public void createLoginFragment() {
        loginFragment = new LoginFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.main, loginFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.clear();
        //getMenuInflater().inflate(R.menu.default_menu, menu);
        return true;
    }
}
