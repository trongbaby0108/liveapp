// Generated by view binder compiler. Do not edit!
package com.example.sanpham.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sanpham.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final Button btnChuyenSanpham;

  @NonNull
  public final Button btnChuyenSanpham1;

  @NonNull
  public final Button btnDkNgay;

  private FragmentHomeBinding(@NonNull NestedScrollView rootView, @NonNull Button btnChuyenSanpham,
      @NonNull Button btnChuyenSanpham1, @NonNull Button btnDkNgay) {
    this.rootView = rootView;
    this.btnChuyenSanpham = btnChuyenSanpham;
    this.btnChuyenSanpham1 = btnChuyenSanpham1;
    this.btnDkNgay = btnDkNgay;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_chuyen_sanpham;
      Button btnChuyenSanpham = ViewBindings.findChildViewById(rootView, id);
      if (btnChuyenSanpham == null) {
        break missingId;
      }

      id = R.id.btn_chuyen_sanpham1;
      Button btnChuyenSanpham1 = ViewBindings.findChildViewById(rootView, id);
      if (btnChuyenSanpham1 == null) {
        break missingId;
      }

      id = R.id.btn_dkNgay;
      Button btnDkNgay = ViewBindings.findChildViewById(rootView, id);
      if (btnDkNgay == null) {
        break missingId;
      }

      return new FragmentHomeBinding((NestedScrollView) rootView, btnChuyenSanpham,
          btnChuyenSanpham1, btnDkNgay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
