import 'dart:async';
import 'dart:ui';

import 'package:flutter/services.dart';
import 'package:flutter_plugin/callback_dispatcher.dart';
class FlutterPlugin {
  static const MethodChannel _channel = const MethodChannel('flutter_plugin');

//  static Future<String> get platformVersion async {
//    await _channel.invokeMethod('getPlatformVersion');
//  }

  static Future<void> initialize() async {
    final CallbackHandle callback = PluginUtilities.getCallbackHandle(callbackDispatcher);
    print("pluginTest8");
    await _channel.invokeMethod('initializeService',<dynamic>[callback.toRawHandle()]);
  }
}
