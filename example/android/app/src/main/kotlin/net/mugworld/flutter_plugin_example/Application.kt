package net.mugworld.flutter_plugin_example


import android.util.Log
import io.flutter.app.FlutterApplication
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.view.FlutterMain

class Application : FlutterApplication(), PluginRegistrantCallback {
  override fun onCreate() {
    super.onCreate()
//    FlutterMain.startInitialization(this.applicationContext)
    Log.e("pluginTest4", "FlutterMain")
//    FlutterMain.ensureInitializationComplete(this, null)
    GeofencingService.setPluginRegistrant(this)
  }

  override fun registerWith(registry: PluginRegistry) {
    Log.e("pluginTest5", "FlutterMain")
    GeneratedPluginRegistrant.registerWith(registry);
  }
}

class GeofencingService {
  companion object{
    lateinit var p: PluginRegistrantCallback

    fun setPluginRegistrant(p: PluginRegistrantCallback){
      this.p = p
    }
  }
}
