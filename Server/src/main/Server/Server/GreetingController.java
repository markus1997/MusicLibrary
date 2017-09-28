package Server;

import Facade.GreetingFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@RequestMapping("/api")
public class GreetingController {

    //TODO: Beans
    private GreetingFacade facade;

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public @ResponseBody String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return facade.getGreetingMessage().getMessage();
    }

    @ExceptionHandler
    void handleIllegalArgumentException(
            IllegalArgumentException e, HttpServletResponse response) throws IOException {

        response.sendError(HttpStatus.BAD_REQUEST.value());

    }
}
