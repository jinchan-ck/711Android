package com.sweetvvck.seven11;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class DisplayActivity extends Activity {
	private WebView mWebView;
	private ProgressBar mProgressBar;
	private static int _who;
	public static void startDisplayActivity(Context context, int who){
		_who = who;
		Intent intent = new Intent(context, DisplayActivity.class);
		context.startActivity(intent);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		mWebView = (WebView) findViewById(R.id.webview);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
//		mWebView.getSettings().setUseWideViewPort(true); 
//		mWebView.getSettings().setLoadWithOverviewMode(true); 
//		mWebView.getSettings().setUseWideViewPort(false);
//		Toast.makeText(this, "who : " + _who, Toast.LENGTH_SHORT).show();
		if(_who == 1){
			mWebView.loadUrl("http://docs.google.com/viewer?overridemobile=true&chrome=true&url=https://dl.dropboxusercontent.com/u/37027104/711-20140428.pdf");
		}else{
			mWebView.loadUrl("http://docs.google.com/viewer?overridemobile=true&chrome=true&url=https://dl.dropboxusercontent.com/s/hule0e986gntnew/711.pptx");
		}
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.setWebViewClient(new WebViewClient(){
			
			@Override
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				super.onPageStarted(view, url, favicon);
				mProgressBar.setVisibility(View.VISIBLE);
			}
			
			@Override
			public void onPageFinished(WebView view, String url) {
				super.onPageFinished(view, url);
				mProgressBar.setVisibility(View.GONE);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.display, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_refresh) {
			if(_who == 1){
				mWebView.loadUrl("http://docs.google.com/viewer?overridemobile=true&chrome=true&url=https://dl.dropboxusercontent.com/u/37027104/711-20140428.pdf");
			}else{
				mWebView.loadUrl("http://docs.google.com/viewer?overridemobile=true&chrome=true&url=https://dl.dropboxusercontent.com/s/hule0e986gntnew/711.pptx");
			}
			return true;
		}else if(id == android.R.id.home){
			this.finish();
		}
		return super.onOptionsItemSelected(item);
	}
}
