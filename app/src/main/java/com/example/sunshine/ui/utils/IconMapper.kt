package com.example.sunshine.ui.utils

import com.example.sunshine.models.APIIconKey

/**
 * This IconMapper interface provides drawable bindings for
 * different values supplied by a given Weather API.
 *
 * The signatures are nullable to handle cases where the
 * caller might supply an invalid key.
 */
interface IconMapper {
    fun getIcon(apiIconKey: APIIconKey): Int
    fun getSmallIcon(apiIconKey: APIIconKey): Int
}