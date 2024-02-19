package in.priya.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.priya.entity.Address;
import in.priya.entity.Employee;
import in.priya.repository.AddressRepository;
import in.priya.repository.EmployeeRepository;

@Service
public class EmpAddService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private AddressRepository addRepo;
	
	
	public void saveEmployee()
	{
		Employee emp=new Employee();
		Address address1=new Address();
		
		address1.setCity("Tasgaon");
		address1.setState("Maharashtra");
		address1.setCountry("India");
		address1.setEmployee(emp);
		
		
		Address address2=new Address();
		
		address2.setCity("Sangli");
		address2.setState("Maharashtra");
		address2.setCountry("India");
		address2.setEmployee(emp);
		
		emp.setName("Priyanak");
		emp.setEmail("priyanak@gmail.com");
		emp.setGender("Female");
		
		List<Address> addressList= Arrays.asList(address1,address2);
		
		emp.setAddress(addressList);
		
		empRepo.save(emp);
	}
	
	public void deleteEmployee(Integer id)
	{
		empRepo.deleteById(id);
	}
	
	public void deleteAddress(Integer id)
	{
		addRepo.deleteById(id);
	}
	
	public void getEmployee(Integer id)
	{
		empRepo.findById(id);
	}
	
	public void getAddress(Integer id)
	{
		addRepo.findById(id);
	}

}
