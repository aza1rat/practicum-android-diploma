package ru.practicum.android.diploma.filter.data

interface StorageClient<K, V> {
    fun storeData(key: K, data: V)
    fun getData(key: K): V?
    fun deleteData(key: K)
    fun clearData()
}
