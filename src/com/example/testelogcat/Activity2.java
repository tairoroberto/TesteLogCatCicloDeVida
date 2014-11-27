package com.example.testelogcat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("script", getClassName()+" - onPause");
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("script", getClassName()+" - onResume");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("script", getClassName()+" - onRestart");
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("script", getClassName()+" - onDestroy");
	}
	
	//Metodo que mostrar o nome da classe
	private String getClassName() {
		String aux = getClass().getName();
		return(aux.substring(aux.lastIndexOf(".") + 1));
	}
	


	public void voltar(View view) {
		finish();
	}
}
