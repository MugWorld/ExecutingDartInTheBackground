package net.mugworld.flutter_plugin

import android.app.Activity
import android.content.Context
import android.util.Log
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterPlugin(val context: Context, activity: Activity?): MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "flutter_plugin")
      Log.e("pluginTest6", "registerWith")
      channel.setMethodCallHandler(FlutterPlugin(registrar.context(), registrar.activity()))
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method == "initializeService") {
      val args = call.arguments<ArrayList<*>>()
      initializeService(context, args)
      Log.e("pluginTest7", "registerWith")
      result.success(true)
    } else {
      result.notImplemented()
    }
  }

  private fun initializeService(context: Context, args: ArrayList<*>?) {
    val callbackHandle = args!![0] as Long
    context.getSharedPreferences("SHARED_PREFERENCES_KEY", Context.MODE_PRIVATE)
            .edit()
            .putLong("CALLBACK_DISPATCHER_HANDLE_KEY", callbackHandle)
            .apply()
  }
}
