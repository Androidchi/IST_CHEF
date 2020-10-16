package ist.uz.istchef.repository

import io.reactivex.disposables.CompositeDisposable
import ist.uz.istchef.App
import ist.uz.istchef.api.Api
import ist.uz.istchef.api.Client
import ist.uz.istchef.api.ISTClient

open class BaseRepository {
    val api = Client.getInstance(App.app).create(Api::class.java)

    val compositeDisposible = CompositeDisposable()
}