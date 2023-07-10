package com.kliachenko.composepaging3.data.mappers

import com.kliachenko.composepaging3.data.local.BeerEntity
import com.kliachenko.composepaging3.data.remote.BeerDto
import com.kliachenko.composepaging3.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagLine = tagLine,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagLine = tagLine,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}