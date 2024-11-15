package com.germanov.composition.domain.usecases

import com.germanov.composition.domain.entity.GameSettings
import com.germanov.composition.domain.entity.Level
import com.germanov.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings{
        return repository.getGameSettings(level)
    }
}