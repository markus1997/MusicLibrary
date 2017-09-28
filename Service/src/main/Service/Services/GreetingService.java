package Services;

import DTO.GreetingDTO;

public class GreetingService {
    public GreetingService()
    {

    }

    public GreetingDTO getGreetingMessage()
    {
        return new GreetingDTO("Hello From Service");
    }
}
