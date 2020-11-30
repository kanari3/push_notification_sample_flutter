package jp.andpad.android.flutter.pushnotification

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService
import io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin
import io.flutter.view.FlutterMain

class MainActivity: FlutterActivity(), PluginRegistry.PluginRegistrantCallback {

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)

        FlutterFirebaseMessagingService.setPluginRegistrant(this)
        FlutterMain.startInitialization(this)

    }

    override fun registerWith(registry: PluginRegistry?) {
        if (!registry!!.hasPlugin("io.flutter.plugins.firebasemessaging")) {
            FirebaseMessagingPlugin.registerWith(registry!!.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"));
        }

    }

}
