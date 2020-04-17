package com.msum.csis365.mvvmlab.view.contact.create;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.msum.csis365.mvvmlab.R;

public class CreateContactActivity extends AppCompatActivity {

    // TODO - STEP 1 - Create a local variable to hold an instance of the ViewModel

    private TextInputLayout tilForename;
    private TextInputLayout tilSurname;
    private TextInputLayout tilPhoneNumber;
    private TextInputLayout tilStreet;
    private TextInputLayout tilCity;
    private TextInputLayout tilState;
    private TextInputLayout tilZipCode;
    private TextInputLayout tilCountry;
    private TextInputLayout tilEmail;
    private Button btnCancel;
    private Button btnSave;

    public static final short REQUEST_CODE = (short) 987654321;
    public static final String EXTRA_NAME = "CREATE_CONTACT";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);

        // TODO - STEP 2 - Create an instance of the ViewModel and set it to the local variable

        bindViews();
        setTextWatchers();
        setInputListeners();
        setClickListeners();

        // TODO - STEP 3 - Observe the exposed Live Data from Step 2
    }

    private void setViewErrors(CreateContactViewState viewState) {
        // Forename errors
        tilForename.setError(viewState.getForenameError());
        tilForename.setErrorEnabled(viewState.getForenameError() != null);

        // Surname errors
        tilSurname.setError(viewState.getSurnameError());
        tilSurname.setErrorEnabled(viewState.getSurnameError() != null);

        // Phone Number errors
        tilPhoneNumber.setError(viewState.getPhoneNumberError());
        tilPhoneNumber.setErrorEnabled(viewState.getPhoneNumberError() != null);

        // Address errors
        tilStreet.setError(viewState.getStreetError());
        tilStreet.setErrorEnabled(viewState.getStreetError() != null);
        tilCity.setError(viewState.getCityError());
        tilCity.setErrorEnabled(viewState.getCityError() != null);
        tilState.setError(viewState.getStateError());
        tilState.setErrorEnabled(viewState.getStateError() != null);
        tilZipCode.setError(viewState.getZipCodeError());
        tilZipCode.setErrorEnabled(viewState.getZipCodeError() != null);
        tilCountry.setError(viewState.getCountryError());
        tilCountry.setErrorEnabled(viewState.getCountryError() != null);

        // Email errors
        tilEmail.setError(viewState.getEmailError());
        tilEmail.setErrorEnabled(viewState.getEmailError() != null);

        // General errors
        if (viewState.getGeneralError() != null) {
            Toast.makeText(this, viewState.getGeneralError(), Toast.LENGTH_LONG).show();
        }
    }

    private void consumeResultState(CreateContactViewState viewState) {
        if (viewState.getResultCode() != null) {
            Intent intent = new Intent();

            if (viewState.getResultCode() == RESULT_OK) {
                intent.putExtra(EXTRA_NAME, viewState.getContact());
            }

            setResult(viewState.getResultCode(), intent);
            finish();
        }
    }

    private void setClickListeners() {
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO - STEP 4 - Notify the ViewModel that the user is attempting to save the input
            }
        });
    }

    private void bindViews() {
        tilForename = findViewById(R.id.til_forename);
        tilSurname = findViewById(R.id.til_surname);
        tilPhoneNumber = findViewById(R.id.til_phone_number);
        tilStreet = findViewById(R.id.til_street);
        tilCity = findViewById(R.id.til_city);
        tilState = findViewById(R.id.til_state);
        tilZipCode = findViewById(R.id.til_zip_code);
        tilCountry = findViewById(R.id.til_country);
        tilEmail = findViewById(R.id.til_email);
        btnCancel = findViewById(R.id.btn_cancel);
        btnSave = findViewById(R.id.btn_save);
    }

    private void setTextWatchers() {
        tilPhoneNumber.getEditText().addTextChangedListener(new PhoneNumberFormattingTextWatcher());

        tilForename.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 5 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilSurname.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 6 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilPhoneNumber.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 7 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilStreet.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 8 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilCity.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 9 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilState.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 10 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilZipCode.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 11 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilCountry.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 12 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });

        tilEmail.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // NO-OP
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO - STEP 13 - Pass the input text to the ViewModel
            }

            @Override
            public void afterTextChanged(Editable s) {
                // NO-OP
            }
        });
    }

    private void setInputListeners() {
        tilForename.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 14 - Pass the input text to the ViewModel
                }
            }
        });

        tilSurname.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 15 - Pass the input text to the ViewModel
                }
            }
        });

        tilPhoneNumber.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 16 - Pass the input text to the ViewModel
                }
            }
        });

        tilStreet.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 17 - Pass the input text to the ViewModel
                }
            }
        });

        tilCity.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 18 - Pass the input text to the ViewModel
                }
            }
        });

        tilState.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 19 - Pass the input text to the ViewModel
                }
            }
        });

        tilZipCode.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 20 - Pass the input text to the ViewModel
                }
            }
        });

        tilCountry.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 21 - Pass the input text to the ViewModel
                }
            }
        });

        tilEmail.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    // TODO - STEP 22 - Pass the input text to the ViewModel
                }
            }
        });

        tilEmail.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    // TODO - STEP 23 - Notify the ViewModel that the user is attempting to save the input
                    handled = true;
                }
                return handled;
            }
        });
    }
}
