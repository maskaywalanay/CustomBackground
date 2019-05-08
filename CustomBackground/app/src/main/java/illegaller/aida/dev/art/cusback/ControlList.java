package illegaller.aida.dev.art.cusback;
import android.os.*;
import android.preference.*;
import android.provider.*;

public class ControlList extends PreferenceActivity implements Preference.OnPreferenceChangeListener
{
    private ListPreference settings;
    
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(setResource("preferencess",  "xml"));
        
        settings = (ListPreference)findPreference("settings_bg");
        long tik = Settings.System.getInt(getContentResolver(),"settings_bg", 500);
        settings.setValue(String.valueOf(tik));
        settings.setSummary(settings.getEntry());
        settings.setOnPreferenceChangeListener((Preference.OnPreferenceChangeListener)this);

    }
        
    public boolean onPreferenceChange(Preference preference , Object object)
    {
        if(preference == settings)
        {
            long tik = Long.valueOf(String.valueOf(object));
            int s = settings.findIndexOfValue((String)object);
            Settings.System.putLong(getContentResolver(),"settings_bg", (tik));
            settings.setSummary(settings.getEntries()[s]);
        }

        return true;
    }
    
    public int setResource(String nama, String tipe)
    {
        return getBaseContext().
        getResources().
        getIdentifier(nama, tipe, getBaseContext().
        getPackageName());
    }
    
}
