package illegaller.aida.dev.art.cusback;
import android.content.*;
import android.os.*;
import android.provider.*;
import android.util.*;
import android.widget.*;

public class BackgroundImg extends ImageView
{
    
    private Handler mHandler;
    private Runnable mTricker;

    private int settings;
    
    public BackgroundImg(Context context, AttributeSet attr)
    {
        super(context, attr);
        mHandler = new Handler();
        mTricker = new Runnable()
        {
            public void run()
            {
                UpdateBackground();
                mHandler.postDelayed(this,500);
            }

        };

        mTricker.run();
    }
        
    private void UpdateBackground() 
    {
        // permission setting //
        settings = Settings.System.getInt(getContext().getContentResolver(), "settings_bg",0);
        switch (settings){
            default:{return;}
            case 0:
                {
                    BackgroundImg.this.setBackgroundColor(0x00000000);
                    return;
                }

            case 1:{
                    setBackgroundResource(setResource("bg_1", "drawable"));
                    return;
                }

            case 2:{
                    setBackgroundResource(setResource("bg_2", "drawable"));
                    return;
                }

            case 3:{
                    setBackgroundResource(setResource("bg_3", "drawable"));
                    return;
                }
            }
        }
        
    public int setResource(String nama, String tipe)
    {
        return getContext().
            getResources().getIdentifier(nama, tipe, getContext().
                                         getPackageName());
    }
 }
