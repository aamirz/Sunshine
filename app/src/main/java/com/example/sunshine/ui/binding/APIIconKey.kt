package com.example.sunshine.ui.binding

/**
 * The APIIconKey class generates a valid apiKey if it a valid key.
 * Otherwise it sets itself to null.
 */
abstract class APIIconKey(inputKeyValue: String, validCodes: Set<String>) {
    val keyValue: String?
    get() {
        return _keyValue
    }
    private var _keyValue: String? = if (validCodes.contains(inputKeyValue)) inputKeyValue else null
}
