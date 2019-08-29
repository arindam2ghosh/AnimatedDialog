package com.arindam.animatedDialog.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.arindam.animatedDialog.AnimatedDialog;
import com.arindam.animatedDialog.BottomSheetAnimatedDialog;
import com.arindam.animatedDialog.interfaces.DialogInterface;
import com.arindam.animatedDialog.interfaces.OnCancelListener;
import com.arindam.animatedDialog.interfaces.OnDismissListener;
import com.arindam.animatedDialog.interfaces.OnShowListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnShowListener, OnCancelListener, OnDismissListener {

    private AnimatedDialog mSimpleDialog;
    private AnimatedDialog mAnimatedDialog;
    private BottomSheetAnimatedDialog mSimpleBottomSheetDialog;
    private BottomSheetAnimatedDialog mAnimatedBottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButtonSimpleDialog = findViewById(R.id.button_simple_dialog);
        Button mButtonAnimatedDialog = findViewById(R.id.button_animated_dialog);
        Button mButtonBottomSheetDialog = findViewById(R.id.button_simple_bottomsheet_dialog);
        Button mButtonAnimatedBottomSheetDialog = findViewById(R.id.button_animated_bottomsheet_dialog);

        // Simple Material Dialog
        mSimpleDialog = new AnimatedDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new AnimatedDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeBtnVisibility(View.INVISIBLE)
//                .setNegativeButton("Cancel", R.drawable.ic_close, new MaterialDialog.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//                        Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
//                        dialogInterface.dismiss();
//                    }
//                })
                .build();

        // Simple BottomSheet Material Dialog
        mSimpleBottomSheetDialog = new BottomSheetAnimatedDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new BottomSheetAnimatedDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeBtnVisibility(View.GONE)
                .build();

        // Animated Simple Material Dialog
        mAnimatedDialog = new AnimatedDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new AnimatedDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", R.drawable.ic_close, new AnimatedDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setAnimation("delete_anim.json")
                .build();

        // Animated BottomSheet Material Dialog
       mAnimatedBottomSheetDialog = new BottomSheetAnimatedDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new BottomSheetAnimatedDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", R.drawable.ic_close, new BottomSheetAnimatedDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setAnimation("delete_anim.json")
                .build();

       mButtonSimpleDialog.setOnClickListener(this);
       mButtonBottomSheetDialog.setOnClickListener(this);
       mButtonAnimatedDialog.setOnClickListener(this);
       mButtonAnimatedBottomSheetDialog.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_simple_dialog :
                mSimpleDialog.show();
                break;

            case R.id.button_simple_bottomsheet_dialog :
                mSimpleBottomSheetDialog.show();
                break;

            case R.id.button_animated_dialog :
                mAnimatedDialog.show();
                break;

            case R.id.button_animated_bottomsheet_dialog :
                mAnimatedBottomSheetDialog.show();
                break;
        }
    }

    @Override
    public void onShow(DialogInterface dialogInterface) {

    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {

    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {

    }
}
