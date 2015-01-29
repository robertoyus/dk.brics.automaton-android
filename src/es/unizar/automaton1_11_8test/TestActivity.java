package es.unizar.automaton1_11_8test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import dk.brics.automaton.Datatypes;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		
		// Datatypes.main(new String[0]);
		
		Datatypes.get("string");

		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}

}
