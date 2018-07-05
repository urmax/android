package com.example.ccvideo;

import android.os.Bundle;  
import android.support.v4.app.Fragment;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.webkit.WebView.FindListener;
import android.widget.ListView;
import android.widget.TextView;
public class FragmentBen  extends Fragment{
	
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        return inflater.inflate(R.layout.fragment_ben, container, false);  
    }  
}
