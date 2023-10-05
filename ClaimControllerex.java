import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

    private final Logger logger;

    @Autowired
    public ClaimController(Logger claimControllerLogger) {
        this.logger = claimControllerLogger;
    }

    // Your controller methods here...
}
