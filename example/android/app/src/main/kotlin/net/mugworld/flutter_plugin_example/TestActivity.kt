package net.mugworld.flutter_plugin_example

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.TextView

import io.flutter.app.FlutterActivity
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.view.FlutterCallbackInformation
import io.flutter.view.FlutterMain
import io.flutter.view.FlutterNativeView
import io.flutter.view.FlutterRunArguments

class TestActivity: FlutterActivity(){

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
//      FlutterMain.startInitialization(this.applicationContext)
//      FlutterMain.ensureInitializationComplete(this, null)

//      Handler().postDelayed({
//          var tv = TextView(this)
//          var context = this
//          tv.setText("是打飞机多sd\nfsdfs\ndfdsfas\ndfkjasldjfljasl\ndjflasjd\nlfkjaskljdflkjaslkd\nfjlksdj斯拉克交房\n了都是机翻禄口\n街道斯洛伐克就")
//          if (sBackgroundFlutterView == null) {
//
//              val callbackHandle = getSharedPreferences(
//                      "SHARED_PREFERENCES_KEY",
//                      Context.MODE_PRIVATE)
//                      .getLong("CALLBACK_DISPATCHER_HANDLE_KEY", 0)
//              val callbackInfo = FlutterCallbackInformation.lookupCallbackInformation(callbackHandle)
//              if (callbackInfo == null) {
//                  Log.e("水电费水电费", "Fatal: failed to find callback")
//                  return@postDelayed
//              }
//              sBackgroundFlutterView = FlutterNativeView(this, true)
//              val registry = sBackgroundFlutterView!!.pluginRegistry
////              GeofencingService.p.registerWith(registry)
//              Log.i("pluginTest3", "Starting GeofencingService...")
//              val args = FlutterRunArguments()
//              args.bundlePath = FlutterMain.findAppBundlePath(this)
//              args.entrypoint = callbackInfo.callbackName
//              args.libraryPath = callbackInfo.callbackLibraryPath
//
//              sBackgroundFlutterView!!.runFromBundle(args)
////          IsolateHolderService.setBackgroundFlutterView(sBackgroundFlutterView)
//          }
//          tv.setOnClickListener {
//              Log.e("pluginTest1","水电费水电费")
//              if (mBackgroundChannel == null){
//                  mBackgroundChannel = MethodChannel(sBackgroundFlutterView,
//                          "background")
//                  mBackgroundChannel!!.setMethodCallHandler(context)
//              }
//              mBackgroundChannel!!.invokeMethod("haha","haha1")
//          }
//          setContentView(tv)
//      },5000)
  }
}

