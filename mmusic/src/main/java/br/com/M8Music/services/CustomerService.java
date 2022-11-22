package br.com.M8Music.services;

import java.util.List;
import java.util.Optional;

import br.com.M8Music.models.CustomerModel;
import br.com.M8Music.repositorys.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;


    public List<CustomerModel> listAll(){
        return repository.findAll();
    }

    public Optional<CustomerModel> listById(Long id){

        return repository.findById(id);
    }

    public CustomerModel insert(CustomerModel customer) {

        return repository.save(customer);
    }

    public Optional<CustomerModel> update(Long id, CustomerModel customer){

        boolean existe = repository.existsById(id);
        if(!existe) {
            return Optional.empty();

        }
        return Optional.of(repository.save(customer));
    }

    public boolean delete(Long id) {

        boolean existe = repository.existsById(id);
        if(!existe) {
            return false;
        }
        return true;
    }

}
