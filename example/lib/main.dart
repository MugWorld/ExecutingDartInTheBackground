import 'package:flutter/material.dart';
import 'dart:async';

import 'package:flutter/services.dart';
import 'package:flutter_plugin/flutter_plugin.dart';

void main() async {
  initPlatformState();
  runApp(MyApp());


}

Future<void> initPlatformState() async {
  // Platform messages may fail, so we use a try/catch PlatformException.
  try {
    print("initPlatformState");
    await FlutterPlugin.initialize();
  } on PlatformException {
  }
  // If the widget was removed from the tree while the asynchronous platform
  // message was in flight, we want to discard the reply rather than calling
  // setState to update our non-existent appearance.

}
class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _platformVersion = 'Unknown';

  @override
  void initState() {
    super.initState();

  }

  // Platform messages are asynchronous, so we initialize in an async method.


  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: Text('Running on: $_platformVersion\n'),
        ),
      ),
    );
  }
}
