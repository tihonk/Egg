package egg.actions.services.impl

import egg.actions.services.HomeService
import org.springframework.stereotype.Service

@Service
class HomeServiceImpl : HomeService {

    override fun generateStartField(): String {
        return "Hello from kotlin";
    }
}