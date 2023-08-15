package com.traiden.manualdependencyinjection.di.dagger.modules

import com.traiden.manualdependencyinjection.di.dagger.EmailService
import com.traiden.manualdependencyinjection.di.dagger.qualifier.MessageQualifier
import com.traiden.manualdependencyinjection.di.dagger.MessageService
import com.traiden.manualdependencyinjection.di.dagger.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    //@Named("message")
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount:Int): NotificationService {
        return MessageService(retryCount)
    }

    // here we return this object because dagger already know how to create its object.
    // we add a tag with this.
    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }

//    @Binds
//    abstract fun getEmailService(emailService: EmailService):NotificationService
}