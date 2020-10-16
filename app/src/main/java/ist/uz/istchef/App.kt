package ist.uz.istchef

import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import ist.uz.istchef.api.Client
import ist.uz.istchef.api.ISTClient
import ist.uz.istchef.utils.Constants
import ist.uz.istchef.utils.Prefs

class App : MultiDexApplication() {
    companion object {
        lateinit var app: App
        var imageBaseUrl = ""
    }
    override fun onCreate() {
        super.onCreate()
        app = this
        MultiDex.install(this)
        Prefs.init(this)
        ISTClient.intitClient(this)
        Client.initClient(app,Constants.HOST)
     }
}