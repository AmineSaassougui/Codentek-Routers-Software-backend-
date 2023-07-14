package com.example.routers.Services;

import com.example.routers.Repositories.IClientRepository;
import com.example.routers.Repositories.IOwnerRepository;
import com.example.routers.Repositories.IRentalRepository;
import com.example.routers.Repositories.IRouterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RouterServicesImpl implements IRouterServices{
    @Autowired
    IRouterRepository routerRepository ;
    @Autowired
    IClientRepository clientRepository ;
    @Autowired
    IRentalRepository RentalRepository ;
    @Autowired
    IOwnerRepository ownerRepository ;


}
