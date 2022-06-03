package zup.com.hello

import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header

@Controller("/api/v1/hello")
class HelloController {

    @Get
    fun helloWorld(@Header("name") name: String, @Header("lastName") lastName: String): MutableHttpResponse<String> {
        return HttpResponse.ok("Hello $lastName, $name!")
    }

}