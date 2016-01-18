package com.alipay;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import android.content.Intent;
import android.app.Activity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlipayPackage implements ReactPackage {
  private final Activity mMainActivity;
  private AlipayModule mModuleInstance;

  public AlipayPackage(Activity mainActivity) {
    this.mMainActivity = mainActivity;
  }

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    mModuleInstance = new AlipayModule(reactContext, mMainActivity);

    return Arrays.<NativeModule>asList(mModuleInstance);
  }

  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

  public void handleActivityResult(final int requestCode, final int resultCode, final Intent data) {
      if (mModuleInstance == null) {
          return;
      }
  }
}