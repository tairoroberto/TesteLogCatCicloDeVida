package com.example.testelogcat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.v("script", "Verbose - texto cor -> Preta");
		Log.d("script", "Degug - texto cor -> Azul");
		Log.i("script", "Informação - texto cor -> Verde");
		Log.w("script", "Alerta - texto cor -> Laranja");
		Log.e("script", "Erro - texto cor -> Vermelho");
		
		
		Log.i("script", getClassName()+" - OnCreate");

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
	
	//Metodo que chama tela 2
	public void irTela2(View view) {
		Intent intent = new Intent(MainActivity.this, Activity2.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
