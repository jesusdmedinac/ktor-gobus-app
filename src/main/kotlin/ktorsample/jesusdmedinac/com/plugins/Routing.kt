package ktorsample.jesusdmedinac.com.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ktorsample.jesusdmedinac.com.data.model.Person
import ktorsample.jesusdmedinac.com.presentation.articleRouting
import kotlin.random.Random

fun Application.configureRouting() {
    routing {
        staticResources("/static", "files")

        articleRouting()
    }
}
