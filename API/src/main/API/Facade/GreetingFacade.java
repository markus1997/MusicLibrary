package Facade;

import DTO.GreetingDTO;
import Services.GreetingService;

public class GreetingFacade {

    private GreetingService service;

    //TODO: refactor to Beans
    public GreetingFacade() {
        service = new GreetingService();
    }

    public GreetingDTO getGreetingMessage()
    {
        return service.getGreetingMessage();
    }
}
