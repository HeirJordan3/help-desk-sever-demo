package jordan.eldridge.helpdesksever.domain.helpRequest.repo;

import jordan.eldridge.helpdesksever.domain.helpRequest.model.HelpRequest;
import org.springframework.data.repository.CrudRepository;

public interface HelpRequestRepo extends CrudRepository<HelpRequest,Long> {


}
