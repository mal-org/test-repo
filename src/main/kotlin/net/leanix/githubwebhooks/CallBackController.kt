package net.leanix.githubwebhooks

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CallBackController {
    @PostMapping("/update")
    fun blog():String {
        println("Received Event")
        return "Received Event"
    }

    @GetMapping("/update")
    fun getBlog():String {
        println("Received Event")
        return "Received Event"
    }

    @PostMapping("/create")
    fun createBlog():String {
        println("Blog created")
        return "Blog created"
    }

    @DeleteMapping("/delete")
    fun deleteBlog():String {
        println("Blog deleted")
        return "Blog deleted"
    }
}
