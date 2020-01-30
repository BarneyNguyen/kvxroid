package com.ving.kvxroid.Models

import com.ving.kvxroid.AnyObject

data class Image (
    val id: String,
    val name: String,
    val imageUrl: String,
    var isSelected: Boolean
) : AnyObject