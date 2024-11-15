package com.germanov.composition.domain.repository

import com.germanov.composition.domain.entity.GameSettings
import com.germanov.composition.domain.entity.Level
import com.germanov.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}