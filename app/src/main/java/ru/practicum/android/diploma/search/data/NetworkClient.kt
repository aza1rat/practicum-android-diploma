package ru.practicum.android.diploma.search.data

import ru.practicum.android.diploma.search.data.dto.RequestDto
import ru.practicum.android.diploma.search.data.dto.Response

interface NetworkClient {
    fun doRequest(dto: RequestDto): Response
}
