package illegaller.aida.dev.art.cusback;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // TODO: Implement this method
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // TODO: Implement this method
        if(item.getItemId() == R.id.item)
        {
            startActivity(new Intent(this,ControlList.class));
        }
        return super.onOptionsItemSelected(item);
    }
    
    
    
}
