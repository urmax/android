package com.example.ccvideo;

import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;



public class GuideActivity extends Activity {
	private ViewPager viewPager;
	private ArrayList<View> pageview;
	private Button bt_in;
	public void onButtonClick(View view){
		Intent intent =new Intent();  
		intent.setClass(GuideActivity.this,  MainActivity.class);  
		startActivity(intent);  
		finish();  
	    }
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        //设置无标题栏
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        
	        setContentView(R.layout.activity_guide);
	        onStart();
	       // finish();
	        


	    

	    }
	  
		@Override
		protected void onStart() {
			// TODO Auto-generated method stub
			super.onStart();
			
			
			viewPager = (ViewPager) findViewById(R.id.viewPager);
	        
	        //查找布局文件用LayoutInflater.inflate
	        LayoutInflater inflater =getLayoutInflater();
	        View view1 = inflater.inflate(R.layout.item01, null);
	        View view2 = inflater.inflate(R.layout.item02, null);
	        View view3 = inflater.inflate(R.layout.item03, null);
	        View view4 = inflater.inflate(R.layout.item04, null);
	        //在第四个viewpager加入click点击页面转换
//	        view4.setOnClickListener(new View.OnClickListener() {
//				
//				@Override
//				public void onClick(View arg0) {  
//					Intent intent =new Intent();  
//					intent.setClass(GuideActivity.this,  MainActivity.class);  
//					startActivity(intent);  
//					finish();  
//				}  
//			});
	        //将view装入数组
	        pageview =new ArrayList<View>();
	        pageview.add(view1);
	        pageview.add(view2);
	        pageview.add(view3);
	        pageview.add(view4);
	        
	        
	        //数据适配器
	        PagerAdapter mPagerAdapter = new PagerAdapter(){

	            @Override
	            //获取当前窗体界面数
	            public int getCount() {
	                // TODO Auto-generated method stub
	                return pageview.size();
	            }

	            @Override
				public int getItemPosition(Object object) {
					// TODO Auto-generated method stub
					return super.getItemPosition(object);
				}

				@Override
	            //断是否由对象生成界面
	            public boolean isViewFromObject(View arg0, Object arg1) {
	                // TODO Auto-generated method stub
	                return arg0==arg1;
	            }
	            //是从ViewGroup中移出当前View
	             public void destroyItem(View arg0, int arg1, Object arg2) {  
	                    ((ViewPager) arg0).removeView(pageview.get(arg1));  
	                }  
	            
	            //返回一个对象，这个对象表明了PagerAdapter适配器选择哪个对象放在当前的ViewPager中
	            public Object instantiateItem(View arg0, int arg1){
	                ((ViewPager)arg0).addView(pageview.get(arg1));
	                return pageview.get(arg1);                
	            }
	            
	            
	            
	        };
	        
	        
	        //绑定适配器
	        viewPager.setAdapter(mPagerAdapter);
	        
	        
		}
		
		@Override    
		public boolean onKeyDown(int keyCode, KeyEvent event) {  
			if (keyCode == KeyEvent.KEYCODE_BACK) {  
				Intent intent =new Intent();  
				intent.setClass(GuideActivity.this, MainActivity.class);  
				startActivity(intent);  
				finish();  
			}  
			return false;  
		}  
		
	    
	}

