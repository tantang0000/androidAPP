package com.android.myapp;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
    /** Called when the activity is first created. */
	private Button button;
	private MyApp myApp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				myApp = (MyApp)getApplication();
				myApp.setName("jack");//修改之后的名称
				Intent intent = new Intent(Main.this,OtherActivity.class);
				startActivity(intent);
			}
		});
    }
}