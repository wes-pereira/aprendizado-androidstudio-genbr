package com.example.sqlite_com_room.data

class UserRepository (private val userDao: UserDao) {

    val selectUser = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }

}