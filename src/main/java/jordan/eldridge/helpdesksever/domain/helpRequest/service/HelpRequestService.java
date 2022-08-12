package jordan.eldridge.helpdesksever.domain.helpRequest.service;

import jordan.eldridge.helpdesksever.domain.helpRequest.model.HelpRequest;

import java.util.List;

public interface HelpRequestService {
    HelpRequest create (HelpRequest helpRequest );
    Iterable <HelpRequest> getAll ();

}
