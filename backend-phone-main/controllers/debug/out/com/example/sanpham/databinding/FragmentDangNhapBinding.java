// Generated by view binder compiler. Do not edit!
package com.example.sanpham.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sanpham.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDangnhapBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDn;

  @NonNull
  public final EditText dnPassword;

  @NonNull
  public final EditText dnUserName;

  private FragmentDangnhapBinding(@NonNull LinearLayout rootView, @NonNull Button btnDn,
      @NonNull EditText dnPassword, @NonNull EditText dnUserName) {
    this.rootView = rootView;
    this.btnDn = btnDn;
    this.dnPassword = dnPassword;
    this.dnUserName = dnUserName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDangnhapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDangnhapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dangnhap, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDangnhapBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_dn;
      Button btnDn = ViewBindings.findChildViewById(rootView, id);
      if (btnDn == null) {
        break missingId;
      }

      id = R.id.dn_Password;
      EditText dnPassword = ViewBindings.findChildViewById(rootView, id);
      if (dnPassword == null) {
        break missingId;
      }

      id = R.id.dn_UserName;
      EditText dnUserName = ViewBindings.findChildViewById(rootView, id);
      if (dnUserName == null) {
        break missingId;
      }

      return new FragmentDangnhapBinding((LinearLayout) rootView, btnDn, dnPassword, dnUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}