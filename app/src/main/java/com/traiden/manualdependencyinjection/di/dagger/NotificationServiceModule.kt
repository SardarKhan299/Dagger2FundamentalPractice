package com.traiden.manualdependencyinjection.di.dagger

import android.provider.ContactsContract.CommonDataKinds.Email
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }

//    @Provides
//    fun getEmailService():NotificationService{
//        return EmailService()
//    }
}