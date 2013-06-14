package uk.co.dharc.dsb.android;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;

import java.io.IOException;
import java.net.*;

import android.widget.EditText;

public class ConnectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.connect, menu);
        return true;
    }
    
    //Connect to a DSB server.
    public void connect(View view)
    {
    	EditText host = (EditText)findViewById(R.id.hostName);
    	String hoststr[] = host.getText().toString().split(":");
    	
    	System.out.println(hoststr[0]);
    	
    	ConnectivityManager connMgr = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
    	NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
    	
    	if (networkInfo != null && networkInfo.isConnected())
    	{
    		
    	}
    	else
    	{
    		System.out.println("Not connected to network");
    	}
    	
    	/*try {
			m_sock = new Socket(hoststr[0],5555);
		} catch (UnknownHostException e) {
			System.out.println("Could not connect to host");
			return;
		} catch (IOException e) {
			return;
		}*/
    }
    
    private Socket m_sock;
    
}
