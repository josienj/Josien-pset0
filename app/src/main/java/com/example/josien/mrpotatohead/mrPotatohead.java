package com.example.josien.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class mrPotatohead extends AppCompatActivity {

    // save state of checkboxes
    // unfortunately, I don't get how to also save the state of the drawables when changing the
    // orientation view
    // I have read a lot about it, the result is that the checkboxes work, but the drawables not..
    // for instance looking at onSaveInstanceState and onRestoreInstanceState but still doesn't work
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potatohead);
    }

    // looking at the views of checkboxes that are clicked (so if they are checked or not)
    public void selectitem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // the next 10 steps are about view the drawable when checkbox is checked, else drawable
        // is invisible
        switch (view.getId()) {
            case R.id.arms_show:
                ImageView arms = (ImageView) findViewById(R.id.arms);
                if (checked)  {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.ears_show:
                ImageView ears = (ImageView) findViewById(R.id.ears);
                if (checked) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.eyebrows_show:
                ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.eyes_show:
                ImageView eyes = (ImageView) findViewById(R.id.eyes);
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.glasses_show:
                ImageView glasses = (ImageView) findViewById(R.id.glasses);
                if (checked) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.hat_show:
                ImageView hat = (ImageView) findViewById(R.id.hat);
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.mouth_show:
                ImageView mouth = (ImageView) findViewById(R.id.mouth);
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.mustache_show:
                ImageView mustache = (ImageView) findViewById(R.id.mustache);
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.nose_show:
                ImageView nose = (ImageView) findViewById(R.id.nose);
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
        }

        switch (view.getId()) {
            case R.id.shoes_show:
                ImageView shoes = (ImageView) findViewById(R.id.shoes);
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}