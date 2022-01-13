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

public final class FragmentDangkiBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button dangki;

  @NonNull
  public final EditText fullname;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText phone;

  @NonNull
  public final EditText username;

  private FragmentDangkiBinding(@NonNull LinearLayout rootView, @NonNull Button dangki,
      @NonNull EditText fullname, @NonNull EditText password, @NonNull EditText phone,
      @NonNull EditText username) {
    this.rootView = rootView;
    this.dangki = dangki;
    this.fullname = fullname;
    this.password = password;
    this.phone = phone;
    this.username = username;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDangkiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDangkiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dangki, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDangkiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dangki;
      Button dangki = ViewBindings.findChildViewById(rootView, id);
      if (dangki == null) {
        break missingId;
      }

      id = R.id.fullname;
      EditText fullname = ViewBindings.findChildViewById(rootView, id);
      if (fullname == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.phone;
      EditText phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new FragmentDangkiBinding((LinearLayout) rootView, dangki, fullname, password, phone,
          username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
