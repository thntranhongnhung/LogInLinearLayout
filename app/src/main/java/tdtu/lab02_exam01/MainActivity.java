package tdtu.lab02_exam01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
// 518H0043- Trần Hồng Nhung
public class MainActivity extends AppCompatActivity {
    Button buttonLogIn;
    EditText editTextUsername, editTextPassword;
    CheckBox checkBoxRememberPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogIn=findViewById(R.id.buttonLogIn);
        editTextUsername=findViewById(R.id.editTextUsername);
        editTextPassword=findViewById(R.id.editTextPassword);
        checkBoxRememberPass=findViewById(R.id.checkBoxRememberPass);
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();
                if("".equals(username) || "".equals(password)){
                    Toast.makeText(MainActivity.this,"Username/Password không dược để trống",Toast.LENGTH_LONG).show();
                }
                else if(!username.equals(password)){
                    Toast.makeText(MainActivity.this,"Sai username/password",Toast.LENGTH_LONG).show();
                }
                else {
                    if(checkBoxRememberPass.isChecked()){
                        Toast.makeText(MainActivity.this,"Đăng nhập thành công, mật khẩu đã được lưu",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}