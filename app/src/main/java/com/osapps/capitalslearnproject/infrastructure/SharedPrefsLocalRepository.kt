package com.osapps.capitalslearnproject.infrastructure

import android.content.SharedPreferences
import com.osapps.capitalslearnproject.infrastructure.LocalRepository

class SharedPrefsLocalRepository(private val preferences: SharedPreferences) : LocalRepository {

    override fun save(key: String, value: String?) {
        preferences.edit().putString(key, value).apply()
    }

    override fun saveBool(key: String, value: Boolean) {
        preferences.edit().putBoolean(key, value).apply()
    }

    override fun get(key: String): String? {
        return preferences.getString(key, null)
    }
    override fun getBool(key: String): Boolean {
        return preferences.getBoolean(key, false)
    }

    override fun clear(key: String) {
        preferences.edit().remove(key).apply()
    }

    override fun clearAllFromServer(server: String) {
        clear(LocalRepository.KEY_PUSH_TOKEN)
        clear(LocalRepository.TOKEN_KEY + server)
        clear(LocalRepository.SETTINGS_KEY + server)
        clear(LocalRepository.USERNAME_KEY + server)
    }
}