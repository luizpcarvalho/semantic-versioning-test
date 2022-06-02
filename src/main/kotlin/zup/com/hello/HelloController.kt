package zup.com.hello

import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/api/v1/hello")
class HelloController {

    @Post
    fun helloWorld(@Body("name") name: String): MutableHttpResponse<String> {
        return HttpResponse.ok("Hello $name!")
    }

}