package net.leanix.githubwebhooks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubWebhooksApplication

fun main(args: Array<String>) {
	runApplication<GithubWebhooksApplication>(*args)
}
