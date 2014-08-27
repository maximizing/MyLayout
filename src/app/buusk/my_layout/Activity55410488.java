package app.buusk.my_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.Manifest;
public class Activity55410488 extends Activity implements OnClickListener{
	private Button btnone,btntwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnone = (Button) findViewById(R.id.btn_max);
        btntwo = (Button) findViewById(R.id.Change);
        btntwo.setOnClickListener(this);
//        btnone.setOnClickListener(new OnClickListener(){
//        	
//
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(Activity55410488.this, "MAX", Toast.LENGTH_SHORT).show();
//			}
//        });
//        
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.Change:
		Intent i = new Intent(getApplicationContext(),Main.class);
		startActivity(i);
		break;
		}
	}
	
}
