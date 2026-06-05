package week8

class NotificationService {
    fun sendEmail(emailAddress : String){
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile){
        if (user.email != null){
            sendEmail(user.email)
        }
        else{
            println("Email address is null")
        }
    }
}