package com.example.sunshine.ui.utils

/**
 * Turn any string into a string with the degree symbol.
 */
fun String.toDegreeString(): String {
    return this + "\u00B0"
}