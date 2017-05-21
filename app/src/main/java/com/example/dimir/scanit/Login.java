package com.example.dimir.scanit;

import android.content.Intent;
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

public class Login extends AppCompatActivity {

    EditText txtPasswordL,txtEmailL,txtEmailR,txtPasswordR,txtRetypePassword;
    TextView txtCreateAccount,txtLogin;
    Button btnSignin,btnReg;

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

  /*  private class LoginTask extends AsyncTask<String, Void, String> {

        private Context mContext;
        private ProgressDialog dialog;

        public LoginTask(Login activity) {
            dialog = new ProgressDialog(activity);
        }

        public LoginTask(Context context){
            this.mContext = context;
        }

        @Override
        protected void onPreExecute() {
            dialog.setMessage("Loading, please wait...");
            dialog.show();
        }

        @Override
        protected String doInBackground(String... strings) {
            String resp = "UNDEFINED";

            try {
                URL url = new URL("http://strathiot.mybluemix.net/api/iotUsers/count?where={\"email\":\"" + strings[0] + "\",\"password\":\"" + strings[1] + "\"}" );
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                InputStream stream = new BufferedInputStream(urlConnection.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder builder = new StringBuilder();

                String inputString;
                while ((inputString = bufferedReader.readLine()) != null) {
                    builder.append(inputString);
                }

                JSONObject response = new JSONObject(builder.toString());
                resp = response.getString("count");

                if (resp.equals("1"))
                {
                    startActivity(new Intent(Login.this,Home.class));
                }

                urlConnection.disconnect();
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
            return resp;
        }

        @Override
        protected void onPostExecute(String resp) {
            //  txtUsername.setText(temp);
            if (dialog.isShowing()) {
                dialog.dismiss();

                if (resp.equals("1"))
                {
                    startActivity(new Intent(Login.this,Home.class));
                }

                else
                {
                    Toast.makeText(mContext, "Incorrect details. Please retry", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }*/
}

