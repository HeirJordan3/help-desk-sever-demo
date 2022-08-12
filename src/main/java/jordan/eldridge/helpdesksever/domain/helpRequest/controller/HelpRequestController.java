package jordan.eldridge.helpdesksever.domain.helpRequest.controller;

import jordan.eldridge.helpdesksever.domain.helpRequest.model.HelpRequest;
import jordan.eldridge.helpdesksever.domain.helpRequest.service.HelpRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
// this is where it will be routed to
@RequestMapping("/help")
//we want to bring everything in
@CrossOrigin("*")
public class HelpRequestController {


    private HelpRequestService service;


    @Autowired
    public HelpRequestController(HelpRequestService service) {
        this.service = service;
    }
    @GetMapping("")
    public ResponseEntity<Iterable<HelpRequest>> getAll(){
        Iterable<HelpRequest> allRequest = service.getAll();
        return new ResponseEntity<>(allRequest, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<HelpRequest> create(@RequestBody HelpRequest helpRequest){
        helpRequest = service.create(helpRequest);
        return new ResponseEntity<>(helpRequest, HttpStatus.CREATED);
    }

}
