package ru.practicum.android.diploma.search.data.dto

sealed interface RequestDto {
    interface WithParams {
        fun toRequestParams(): Map<String, String>
    }
    interface WithPathId {
        fun getRequestPathId(): Int
    }
}
