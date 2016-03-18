package agenda.cursoandroid.com.agenda;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class AddContactActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtPhone;
    private EditText edtEmail;
    private EditText edttAdress;
    private EditText edtDates;
    private EditText edtGroups;

    private Spinner spinPhone;
    private Spinner spinEmail;
    private Spinner spinAdress;
    private Spinner spinDates;

    private ArrayAdapter<String> arrayAdapterPhone;
    private ArrayAdapter<String> arrayAdapterEmail;
    private ArrayAdapter<String> arrayAdapterAdress;
    private ArrayAdapter<String> arrayAdapterDates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        edtName = (EditText) findViewById(R.id.edtNameId);
        edtPhone = (EditText) findViewById(R.id.edtPhoneId);
        edtEmail = (EditText) findViewById(R.id.edtEmailId);
        edttAdress = (EditText) findViewById(R.id.edtAdressId);
        edtDates = (EditText) findViewById(R.id.edtDatesId);
        edtGroups = (EditText) findViewById(R.id.edtGroupsId);

        spinPhone = (Spinner) findViewById(R.id.spnPhoneId);
        spinEmail = (Spinner) findViewById(R.id.spnEmailId);
        spinAdress = (Spinner) findViewById(R.id.spnAdressId);
        spinDates = (Spinner) findViewById(R.id.spnDatesId);

        arrayAdapterPhone = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        arrayAdapterEmail = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        arrayAdapterAdress = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        arrayAdapterDates = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

        spinPhone.setAdapter(arrayAdapterPhone);
        spinEmail.setAdapter(arrayAdapterEmail);
        spinAdress.setAdapter(arrayAdapterAdress);
        spinDates.setAdapter(arrayAdapterDates);

        arrayAdapterPhone.add("Celular");
        arrayAdapterPhone.add("Trabalho");
        arrayAdapterPhone.add("Casa");
        arrayAdapterPhone.add("Principal");
        arrayAdapterPhone.add("Fax Trabalho");
        arrayAdapterPhone.add("Fax Casa");
        arrayAdapterPhone.add("Pager");
        arrayAdapterPhone.add("Outros");

        arrayAdapterEmail.add("Pessoal");
        arrayAdapterEmail.add("Trabalho");
        arrayAdapterEmail.add("Outros");

        arrayAdapterAdress.add("Casa");
        arrayAdapterAdress.add("Trabalho");
        arrayAdapterAdress.add("Outros");

        arrayAdapterDates.add("Aniversário");
        arrayAdapterDates.add("Data comemorativa");
        arrayAdapterDates.add("Outros");


    }

}
