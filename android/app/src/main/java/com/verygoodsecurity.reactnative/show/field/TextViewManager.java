package com.verygoodsecurity.reactnative.show.field;

import android.util.TypedValue;

import android.content.res.Resources;

import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;

import com.verygoodsecurity.reactnative.show.VGSShowOnCreateViewInstanceListener;

import com.verygoodsecurity.vgsshow.widget.VGSTextView;

import com.verygoodsecurity.reactnative.util.ResourceUtil;
import kotlin.text.Regex;
import android.util.Log;

public class TextViewManager extends ViewGroupManager<VGSTextView> {

    private VGSTextView textView;

    private VGSShowOnCreateViewInstanceListener listener;

    TextViewManager(VGSShowOnCreateViewInstanceListener listener) {
        super();
        this.listener = listener;
    }

    @Override
    public String getName() {
        return "VGSTextView";
    }

    @ReactProp(name = "contentPath")
    public void setContentPath(VGSTextView view, String text) {

      Log.e("contentPathIS", text);

      switch (text) {
        case "origin":
          view.addTransformationRegex(new Regex("(\\d{2}).(\\d{3}).(\\d{3}).(\\d{3})"), "$1-$2-$3-$4");
        case "headers.Vgs-Tenant":
          view.addTransformationRegex(new Regex("(tnt)(\\d{1})"), "$1-$2");
      }
      
      view.setContentPath(text);

    }


    @ReactProp(name = "padding")
    public void setPadding(VGSTextView view, int padding) {
        int paddingDp = ResourceUtil.convertPxToDp(view.getContext(), padding);
        view.setPadding(paddingDp, paddingDp, paddingDp, paddingDp);
    }

    @ReactProp(name = "fontSize")
    public void setFontSize(VGSTextView view, int size) {
        view.setTextSize(size * Resources.getSystem().getDisplayMetrics().density);
    }

    @ReactProp(name = "hint")
    public void setHint(VGSTextView view, String text) {
        view.setHint(text);
    }

    @Override
    protected VGSTextView createViewInstance(ThemedReactContext reactContext) {
      textView = new VGSTextView(reactContext);

        listener.onCreateViewInstance(textView);

        return textView;
    }

    public String getContentPath() {
        if(textView == null) {
            return "";
        } else {
            return textView.getContentPath();
        }
    }
}