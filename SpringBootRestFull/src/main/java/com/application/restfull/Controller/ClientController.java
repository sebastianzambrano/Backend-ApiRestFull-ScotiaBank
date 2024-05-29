package com.application.restfull.Controller;

import com.application.restfull.Entity.Client;
import com.application.restfull.IService.IClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/client")
public class ClientController extends BaseController<Client, IClientService> {
    public ClientController(IClientService service) {
        super(service, "Client");
    }
}
