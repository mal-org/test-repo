package net.leanix.githubwebhooks

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CallBackController {
    @PostMapping("/update")
    fun blog():String {
        println("Received Event")
        return "Received Event"
    }
    @PostMapping("/test")
    fun test():String {
        return "Test endpoint"
    }
}