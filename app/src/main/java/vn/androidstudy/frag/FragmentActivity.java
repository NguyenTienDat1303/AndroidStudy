package vn.androidstudy.frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Handler;

import vn.androidstudy.R;
import vn.androidstudy.frag.fragment.LoginFragment;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        replaceFragment(new LoginFragment());
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContainer, fragment)
                .addToBackStack(null)
                .commit();
    }

    public void replaceParentFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        String backStateName = fragment.getClass().getName();
        boolean fragmentPopped = manager.popBackStackImmediate(backStateName, 0);

        if (!fragmentPopped) {
            FragmentTransaction fragmentTransaction = manager
                    .beginTransaction()
                    //                        .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right,
                    //                                android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .addToBackStack(null)
                    .replace(R.id.mainContainer, fragment, backStateName);
            fragmentTransaction.commit();
            manager.executePendingTransactions();
        }
    }
}
