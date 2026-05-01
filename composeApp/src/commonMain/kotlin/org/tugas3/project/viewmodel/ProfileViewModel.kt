package org.tugas3.project.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import org.tugas3.project.data.ProfileUiState
import org.tugas3.project.data.SettingsManager

class ProfileViewModel(private val settingsManager: SettingsManager) : ViewModel() {
    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = combine(
        _uiState,
        settingsManager.isDarkMode,
        settingsManager.sortOrder
    ) { state, isDark, sortOrder ->
        state.copy(isDarkMode = isDark, sortOrder = sortOrder)
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), ProfileUiState())

    fun updateName(newName: String) {
        _uiState.update { it.copy(name = newName) }
    }

    fun updateBio(newBio: String) {
        _uiState.update { it.copy(bio = newBio) }
    }

    fun updateProfileImage(uri: String?) {
        _uiState.update { it.copy(profileImageUri = uri) }
    }

    fun toggleDarkMode(isDark: Boolean) {
        viewModelScope.launch {
            settingsManager.setTheme(isDark)
        }
    }

    fun updateSortOrder(order: String) {
        viewModelScope.launch {
            settingsManager.setSortOrder(order)
        }
    }
}
