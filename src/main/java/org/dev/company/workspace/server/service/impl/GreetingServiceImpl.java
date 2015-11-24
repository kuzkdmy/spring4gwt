package org.dev.company.workspace.server.service.impl;

import org.dev.company.workspace.shared.GreetingService;
import org.springframework.stereotype.Service;

@Service("greet")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return "spring for gwt integration working";
    }
}
