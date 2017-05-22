package com.example.dimir.scanit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    EditText txtPasswordL,txtEmailL,txtEmailR,txtPasswordR,txtRetypePassword;
    TextView txtCreateAccount,txtLogin;
    Button btnSignin,btnReg;

    //Variables

    /*private ProgressDialog pDialog;

    // JSON Response node names
    private static String KEY_SUCCESS = "success";


    private static String url_login = "http://tutishem.com/peter/post/login.php";

    // Alert Dialog Manager
    AlertDialogManager alert = new AlertDialogManager();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmailL=(EditText)findViewById(R.id.txtname);
        txtPasswordL=(EditText)findViewById(R.id.txtpassword);

        txtLogin=(TextView) findViewById(R.id.txtLogin);
        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeActivity=new Intent(Login.this,Home.class);
                startActivity(HomeActivity);

                /*String email = txtEmailL.getText().toString();
                String pass = txtPasswordL.getText().toString();

                if (email.equals("") || pass.equals(""))
                {
                    Toast.makeText(Login.this, "Enter login details.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    new LoginTask(Login.this).execute(email,pass);
                    txtEmailL.setText("");
                    txtPasswordL.setText("");
                }*/



            }
        });

        txtCreateAccount=(TextView)findViewById(R.id.txtcreateaccount);
        txtCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegActivity=new Intent(Login.this,Registration.class);
                startActivity(RegActivity);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Async task class to get json by making HTTP call
     * *//*
    private class LoginUser extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
            pDialog = new ProgressDialog(Login.this);
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();

        }

        @Override
        protected Void doInBackground(Void... arg0) {

            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("username", Username));
            params.add(new BasicNameValuePair("password", Password));

            // Creating service handler class instance
            ServiceHandler sh = new ServiceHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url_login, ServiceHandler.GET, params);
            JSONObject json = null;
            try {
                json = new JSONObject(jsonStr);
            } catch (JSONException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            //shows the response that we got from the http request on the logcat
            Log.d("Response: ", "> " + jsonStr);

            // check for login response
            try {
                if (json.getString(KEY_SUCCESS) != null) {
                    // loginErrorMsg.setText("");
                    String res = json.getString(KEY_SUCCESS);

                    if (Integer.parseInt(res) == 1) {
                        // user successfully logged in


                        // Launch Home Screen
                        Intent intCategory = new Intent(
                                getApplicationContext(), Home.class);
                        intCategory.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intCategory);

                        finish();
                    } else {
                        // Error in login
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                // loginErrorMsg.setText("Incorrect PhoneNumber/Password");
                                alert.showAlertDialog(
                                        Login.this,
                                        "Login Error",
                                        "Incorrect Username/Password. Please Try Again!",
                                        false);
                            }
                        });
                    }
                } else {
                    alert.showAlertDialog(Login.this, "Login Error",
                            "Failed to Login. Please Try Again!", false);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            // }
            // });
            // thread.start();
            return null;
        }*/
    }