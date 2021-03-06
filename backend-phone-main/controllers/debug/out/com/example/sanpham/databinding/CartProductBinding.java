// Generated by view binder compiler. Do not edit!
package com.example.sanpham.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sanpham.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CartProductBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton CartProductBtnCong;

  @NonNull
  public final ImageButton CartProductBtnTru;

  @NonNull
  public final ImageView CartProductIMG;

  @NonNull
  public final TextView CartProductName;

  @NonNull
  public final TextView CartProductPrice;

  @NonNull
  public final ImageButton CartProductRemove;

  @NonNull
  public final EditText CartProductSL;

  private CartProductBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton CartProductBtnCong, @NonNull ImageButton CartProductBtnTru,
      @NonNull ImageView CartProductIMG, @NonNull TextView CartProductName,
      @NonNull TextView CartProductPrice, @NonNull ImageButton CartProductRemove,
      @NonNull EditText CartProductSL) {
    this.rootView = rootView;
    this.CartProductBtnCong = CartProductBtnCong;
    this.CartProductBtnTru = CartProductBtnTru;
    this.CartProductIMG = CartProductIMG;
    this.CartProductName = CartProductName;
    this.CartProductPrice = CartProductPrice;
    this.CartProductRemove = CartProductRemove;
    this.CartProductSL = CartProductSL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CartProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CartProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cart_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CartProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Cart_Product_btnCong;
      ImageButton CartProductBtnCong = ViewBindings.findChildViewById(rootView, id);
      if (CartProductBtnCong == null) {
        break missingId;
      }

      id = R.id.Cart_Product_btnTru;
      ImageButton CartProductBtnTru = ViewBindings.findChildViewById(rootView, id);
      if (CartProductBtnTru == null) {
        break missingId;
      }

      id = R.id.Cart_Product_IMG;
      ImageView CartProductIMG = ViewBindings.findChildViewById(rootView, id);
      if (CartProductIMG == null) {
        break missingId;
      }

      id = R.id.Cart_Product_Name;
      TextView CartProductName = ViewBindings.findChildViewById(rootView, id);
      if (CartProductName == null) {
        break missingId;
      }

      id = R.id.Cart_Product_price;
      TextView CartProductPrice = ViewBindings.findChildViewById(rootView, id);
      if (CartProductPrice == null) {
        break missingId;
      }

      id = R.id.Cart_Product_remove;
      ImageButton CartProductRemove = ViewBindings.findChildViewById(rootView, id);
      if (CartProductRemove == null) {
        break missingId;
      }

      id = R.id.Cart_Product_SL;
      EditText CartProductSL = ViewBindings.findChildViewById(rootView, id);
      if (CartProductSL == null) {
        break missingId;
      }

      return new CartProductBinding((LinearLayout) rootView, CartProductBtnCong, CartProductBtnTru,
          CartProductIMG, CartProductName, CartProductPrice, CartProductRemove, CartProductSL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
