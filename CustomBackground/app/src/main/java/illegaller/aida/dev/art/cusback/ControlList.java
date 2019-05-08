package illegaller.aida.dev.art.cusback;
import android.preference.*;
import android.os.*;

public class ControlList extends PreferenceActivity
{
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(setResource("preferencess",  "xml"));
    }
    
    public int setResource(String nama, String tipe)
    {
        return getBaseContext().
        getResources().
        getIdentifier(nama, tipe, getBaseContext().
        getPackageName());
    }
    
}
